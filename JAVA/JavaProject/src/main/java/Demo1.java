package main.java;
/**
 * �������ͻ���֪ʶ
 */
public class Demo1 {

    public static void main(String[] args){
        // ������Demo1Student
    	class Demo1Student{  // ͨ��class�ؼ����ඨ����
    	    // ������ı���
    	    String name;
    	    int age;
    	    float score;

    	    // ������ĺ���
    	    void say(){
    	        System.out.println( name + "�������� " + age + "���ɼ��� " + score );
    	        }
    	}
    	class Demo2{//Java���������Լ������Ķ���
            // �ַ���
            char webName1 = '��';//�����ű�ʾ�ַ���
            char webName2 = 'Ң';
            void name(){
            	System.out.println("���ߵ������ǣ�" + webName1 + webName2 );
            	}
            // ����
            short x=22;  // ʮ���ƶ�����
            int y=022;  // �˽�������
            long z=0x22L;  // ʮ�����Ƴ�����
            // ������
            float m = 22.25f;//�����ȸ�����
            double n = 10.123123d;//˫���ȸ�����
            void number(){
            System.out.println("ת����ʮ���ƣ�x = " + x + ", y = " + y + ", z = " + z);
            System.out.println("����˻���" + m + " * " + n + "=" + m*n);
            // ǿ����������ת��
            System.out.println("��ʧ����:a = (int)34.56 + (int)11.2=" + ((int)34.56 + (int)11.2) + " //��ʧ����");
            System.out.println("��߾���:b = (double)m + (double)10 + 1=" + ((double)m + (double)10 + 1)+" //��߾���");
            }
    	}

        // ͨ�������������������������
    	Demo1Student stu1 = new Demo1Student();  // ����ʹ��new�ؼ���
        // ������ĳ�Ա
        stu1.name = "С��";
        stu1.age = 15;
        stu1.score = 92.5f;
        stu1.say();
        
        Demo2 demo=new Demo2();
        demo.name();
        demo.number();
    }
}