package main.java;

/**
 * Create multiple threads.
 * @author yaopr
 *
 */
class NewThreadTest implements Runnable {
    /**
     * name of thread
     */
	String name; 
	private int i=0;
	Thread t;
    NewThreadTest(String TreadName){
    	name=TreadName;
    	t = new Thread(this,name);
    	t.start();
    }
	public void run() {
		try{
			System.out.println("This thread name is :" + name);
			for(i=1;i<5;i++){
				Thread.sleep(100);
				System.out.println("This thread name is :" + name + " and i is " + i);				
			}
		}catch(Throwable e){
			 System.out.println(name + "Throwable" + e);
		}finally{
	         System.out.println(name + " exiting.");
		}
	}
}
/**
 * ͨ����ϣ�����߳�����������ǰ��������У������ͨ����main()�е���sleep()��ʵ�ֵģ������㹻��ʱ����ӳ���ȷ���������̶߳��������߳̽�����Ȼ�����ⲻ��һ����������Ľ����������Ҳ����һ�������⣺һ���߳����֪����һ�߳��Ѿ�������
 * ���˵��ǣ�Thread���ṩ�˻ش������ķ�����
 * ���ַ��������ж�һ���߳��Ƿ��������һ���������߳��е���isAlive()�����ַ�����Thread���壬����ͨ����ʽ���£�
 *   final boolean isAlive( )
 * ����������߳��������У�isAlive()��������true����������򷵻�false��
 * �ȴ��߳̽����ĸ����õķ����ǵ���join()���������£�
 *   final void join( ) throws InterruptedException
 * �÷����ȴ��������߳̽�����������������Ҫ���̵߳ȴ�ֱ��ָ���̲߳���ĸ��join()�ĸ�����ʽ������ȴ�ָ���߳̽�������һ�����ʱ�䡣
 * @author yaopr
 *
 */
public class CreateMultipleThreads {
	public static void main(String args[]) {
		try{
			for(int i=0;i<6;i++){
				System.out.println("New Thread: " + i);
				NewThreadTest ts=new NewThreadTest("Thread" + i );//�����߳�
				ts.t.join(50);
				System.out.println("Thread " + ts.name + " is alive?" + ts.t.isAlive() + "Creat and Join" + i);//isAlive���������õ����ȴ��߳̽����ĸ����õķ����ǵ���join()
				ts.t.join(50);//join()�����ȴ��������߳̽�����������������Ҫ���̵߳ȴ�ֱ��ָ���̲߳���ĸ��join()�ĸ�����ʽ������ȴ�ָ���߳̽�������һ�����ʱ�䡣����50ms
				}
		}catch(InterruptedException e){
			System.out.println(e);
		}finally{
        System.out.println("main exiting.");
        }
	}
}