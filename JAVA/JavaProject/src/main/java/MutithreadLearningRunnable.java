package main.java;
/**
 * �ο�http://blog.csdn.net/evankaka/article/details/44153709#t1
 * 2018-01-02 update ʹ�������ڲ����дһ���ֳ���
 *@functon ���߳�ѧϰ extends Runnable
 *@author СҢ
 *@time 2016-10-18
 */
public class MutithreadLearningRunnable {
	public static void main(String args[]){
		// �������ڲ����޸���һ��
		Thread a =  new Thread(new Runnable(){
			private int n=0;
			public void run(){
				do{
					System.out.println("Thread a (Runnable)����  :  " + n + " System.currentTimeMillis()=" + System.currentTimeMillis());
					try {
						Thread.sleep((int) Math.random() * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
						break;
					} 
					n++;
				}while(n<3);
			}
		}
		);
		
		// ���������������޸���һ�� ע�������õ�����ͷ��������lambda���ʽ�У���ͷ��������->���ұ����Ϊʵ�ֽӿڵķ���
		Runnable runner = () -> { System.out.println("�������� Thread b Runnable runner ������" );};
		Thread b =new Thread(runner);
		
		a.start();
		b.start();
        new Thread(new MutiThreadsClassA('a')).start();  
        new Thread(new MutiThreadsClassA('b')).start(); 
	}
}
/**
 * Thread2��ͨ��ʵ��Runnable�ӿڣ�ʹ�ø������˶��߳����������run���������Ƕ��̳߳����һ��Լ�������еĶ��̴߳��붼��run�������档Thread��ʵ����Ҳ��ʵ����Runnable�ӿڵ��ࡣ
 * �������Ķ��̵߳�ʱ����Ҫ��ͨ��Thread��Ĺ��췽��Thread(Runnable target) ���������Ȼ�����Thread�����start()���������ж��̴߳��롣
 * ʵ�������еĶ��̴߳��붼��ͨ������Thread��start()���������еġ���ˣ���������չThread�໹��ʵ��Runnable�ӿ���ʵ�ֶ��̣߳����ջ���ͨ��Thread�Ķ����API�������̵߳ģ���ϤThread���API�ǽ��ж��̱߳�̵Ļ�����
 *@author СҢ
 *@time 2016-10-18
 */
class MutiThreadsClassA implements Runnable{
	private int n=0;
	public char name;
	public MutiThreadsClassA(char c){
		this.name=c;
	}
	@Override
	public void run(){
		do{
			System.out.println(name + "(Runnable)����  :  " + n + " System.currentTimeMillis()=" + System.currentTimeMillis());
			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			} 
			n++;
		}while(n<3);
	}
}