package main.java;

public class NewRoot {
	static int num;
	public static void main(String[] args) throws java.lang.IllegalArgumentException,java.lang.ArithmeticException{
		if (args.length > 0) {
			try {
				num = Integer.parseInt(args[0]);
			}catch (NumberFormatException e){
				System.err.println("���������Ͳ���ת����"); 
				throw new NumberFormatException("���������Ͳ���ת����");
			}
		}else {
			System.out.println("Please import a number");
			throw new java.lang.IllegalArgumentException("������һ������");
		}
		if(num>=0) {
			System.out.println("The square root of " + num + " is " + Math.sqrt(num));
		}else {
			System.out.println("Please ?");
			throw new java.lang.ArithmeticException("����������");
		}
	}
}
