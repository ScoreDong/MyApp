package main.java;
import java.util.Scanner;
/**
 * ѭ������֪ʶ
 */
public class Demo2 {
	private static Scanner sc;
	//����žų˷�������FORѭ��
	public static void main2(String[] args) {
		int i=1,j=1;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.printf("%d*%d=%2d  ",i,j,i*j);
			}
			System.out.print("\n");
		}
	}
    public static void main(String[] args){
    	main.java.Demo2.main2(null);
    	int i=0;
    	System.out.print("��������Ҫ������ٸ�����");
    	sc = new Scanner(System.in);
    	i=sc.nextInt();
    	int[] num=new int[i],num2 =new int[i];
    	long total=0,total2 =0;
        System.out.print("������" + num.length + "���������Կո�Ϊ�ָ���");
    	for(i=0;i<num.length;i++){
    		num[i]=sc.nextInt();
    		num2[i]=num[i]*num[i];
    		System.out.println(num[i]);
    		total=total+num[i];
    		total2=total2+num2[i];
    	}
        System.out.println("�ͣ�" + total + "ƽ������" + total/num.length);
    }
}
