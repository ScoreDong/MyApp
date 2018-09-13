package main.java;
/**
 * static������һ����̬���������ڴ��е�λ�����ھ�̬�洢������������ͨ������ֱ�ӷ��ʡ����Ҳ��������˶��ٸ���static����ֻ��һ����Ҳ����˵����ʵ������һ������������static����ֻ�ܵ���static������
 */
public class Test {
	public static int i=1;
	//parent  
	public static class ParentStatic {  
	    public static void print(){  
	        System.out.println("************parent**************");  
	    }  
	  
	}  
	//child  
	public static class ChildStatic extends ParentStatic{  
	  
	    public static void print(){  
	        System.out.println("*******************child******************");
	        System.out.println(i);
	        ParentStatic.print();  
	        i=i+1;
//	                print(); //error occur,stack overflow  
//	        static������һ����̬���������ڴ��е�λ�����ھ�̬�洢������������ͨ������ֱ�ӷ��ʡ����Ҳ��������˶��ٸ���static����ֻ��һ����Ҳ����˵����ʵ������һ������������static����ֻ�ܵ���static������
	    }  
	}  
	public static class TestEntry {  
	    public static void main(String[] args) {//��������е�
	    	System.out.println("��������������������������������������������������������������������������������������������������������������������������������");
	        ChildStatic.print();//you can also use "ChildStatic.print()" to access the "print()"  
	    }  
	    
	  
	}  

    public static void main(String[] args) {  
    	System.out.println("public static void main(String[] args) {  ");
        ChildStatic.print();//you can also use "ChildStatic.print()" to access the "print()"  
    }  
	  
}
