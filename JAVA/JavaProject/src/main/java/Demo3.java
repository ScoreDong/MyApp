package main.java;
/** 
 * 
 * �����ڲ������ܷ��ʷ������ı����������Է����༶��ʵ�����ı�����
 * ���ڲ��ܹ������༶��ʵ��������������鱻�����ڷ����ڲ����������Է��ʷ������ı�����
 * �������Ϳ鼶�ı������뱻��ʽ��ʼ���������ܷ��ʡ�
 * @author yao
 */
public class Demo3 {
    public static String name = "yao";  // �༶�������ؼ���static��
    public int i=1; // ����ʵ��������
    // ���Կ飬�����ʼ������ʱ������
    {
		int j = 2;// �鼶����
        j=3;
        System.out.println("���Կ飬�����ʼ������ʱ������"+"\n�鼶���� j="+j);
    }
    
    public void test1() {
        int j = 3;  // ����������
        if(j == 3) {
            int k = 5;  // �鼶����
            System.out.println("�鼶���� k="+k);
        }
        // ���ﲻ�ܷ��ʿ鼶�������鼶����ֻ���ڿ��ڲ�����
        System.out.println("name=" + name + ",����ʵ�������� i=" + i + ", j=" + j);
    }
    
    public static void main(String[] args) {
        // ����������ֱ��ͨ�����������༶����
        System.out.println(Demo3.name);
       
        // �������󲢷������ķ���
        Demo3 t = new Demo3();
        t.test1();
    }
}
