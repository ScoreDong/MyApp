package main.java;
/**
 * �ο�http://www.mamicode.com/info-detail-517008.html
 *@functon ���߳�ѧϰ extends Thread
 *@author СҢ
 *@time 2016-10-17
 */
public class MutithreadLearningThread{
	public static void main(String args[]){
		MutiThreadsClass Thread1 = new MutiThreadsClass(),Thread2 = new MutiThreadsClass(),Thread3 = new MutiThreadsClass();
		Thread1.MutiThreads('a');
		Thread2.MutiThreads('b');
		Thread3.MutiThreads('c');
		/**
		 *�״�ͬһ��Thread��extends Thread �߳��ࣩ�����ظ�����start�����������java.lang.IllegalThreadStateException�쳣��
		 *ע�⣺start()�����ĵ��ú󲢲�������ִ�ж��̴߳��룬����ʹ�ø��̱߳�Ϊ������̬��Runnable����ʲôʱ���������ɲ���ϵͳ�����ġ�
		 */
		Thread1.start();
		Thread2.start();
		Thread3.start();
	}
}
class MutiThreadsClass extends Thread{
		private char name;
		private int n=1;
		public int MutiThreads(char c){
			this.name=c;
			return 0;
		}
		public void run(){
			System.out.println(name + "(Thread)����  :  " + n);
			n++;
			System.out.println(name + "����  :  " + n);
			return;
		}
	

}

