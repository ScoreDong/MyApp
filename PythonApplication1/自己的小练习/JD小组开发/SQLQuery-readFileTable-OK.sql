--��ȡ���ݿ���Ҫ�ö������������������òſ��ԣ�ѡ������ϵͳ�ĸ߼�ѡ�ִ�����´��룬�����û��޸ĸ߼�ѡ�
EXEC sp_configure 'show advanced options', 1  --��������
GO
RECONFIGURE       --��װ
GO
EXEC sp_configure 'Ad Hoc Distributed Queries', 1
GO
RECONFIGURE
GO
-- ʹ�����´�������xp_cmdshellѡ���Σ��ִ�к��������ر�xp_cmdshellѡ�СҢע����
exec sp_configure 'xp_cmdshell', 1; 
go 
reconfigure; 
go

---��ȡĿ¼�������ļ�����������ʱ��#t
IF object_id('tempdb..#t', 'u') IS NOT NULL
    DROP TABLE #t
GO
create table #t(b varchar(254))
insert into #t
EXEC master.dbo.xp_cmdshell 'dir/b D:\test'

---����Ŀ¼���ļ�
declare @name varchar(254)
declare @query varchar(1000)
DECLARE My_Cursor CURSOR --�����α�
FOR SELECT * FROM #t --�����Ҫ�ļ��Ϸŵ��α���
OPEN My_Cursor; --���α�
FETCH NEXT FROM My_Cursor INTO @name ; --��ȡ��һ������
WHILE @@FETCH_STATUS = 0
    BEGIN
		print '\
		
		
		���ڶ�ȡ�ļ�' + @name
		BEGIN TRY
		set @query='Insert into [' + @name + '] select * from OPENROWSET(''Microsoft.ACE.OLEDB.12.0'',''Excel 5.0;HDR=NO;IMEX=1;DATABASE=D:\test\' + @name + ''',sheet1$)'
		exec (@query)
		END TRY
		BEGIN CATCH
		set @query='Insert into [' + @name + '] select * from OPENROWSET(''Microsoft.ACE.OLEDB.12.0'',''Text;HDR=NO;DATABASE=D:\test;Extensions=csv,txt;'',''SELECT * FROM [' + @name + ']'')'
				exec (@query)
		END CATCH
		print 'ִ��SQL���룺' + @query

		print '��ȡ�ļ����' + @name
        FETCH NEXT FROM My_Cursor INTO @name ; --��ȡ��һ������
    END
CLOSE My_Cursor; --�ر��α�
DEALLOCATE My_Cursor; --�ͷ��α�


---ɨβ
IF object_id('tempdb..#t', 'u') IS NOT NULL
    DROP TABLE #t
GO
-- ʹ�����´������xp_cmdshellѡ�
exec sp_configure 'xp_cmdshell', 0; 
go 
reconfigure; 
go
