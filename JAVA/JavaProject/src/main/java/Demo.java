package main.java;
/**
 * ������Ϊ�����ã��ͺ������Ϊ�Ǳ������Ϊһ�������ҵ�����Ϊ���ط����ڸ����У������Զ����ϲ���׷�ݡ�
 * super �ؼ��ֵĹ��ܣ�
 *  ���ø���������Ϊ private �ı�����
 *  ��ȡ�Ѿ������˵ķ�����
 *  ��Ϊ��������ʾ���๹�췽����
 * @author yaopr
 *
 */
public class Demo{
    public static void main(String[] args) {
    	//���Ϊstatic�ķ�������newҲ��ʹ��
    	Dog.alive();
    	//�����������Ҫnewһ���������
        Dog obj = new Dog();
        obj.move();        
    }
}
class Animal{
    private String desc = "Animals are human's good friends";
    // ����Ҫ����һ�� getter ����
    public String getDesc() { return desc; }

    public void move(){
        System.out.println("Animals can move");
    }
    //���Ϊfinal�ķ������ɱ�����
    public static final void alive() {
    	System.out.println("Animals alive");
    }
}
class Dog extends Animal{
	//���Ϊfinal�ķ������ɱ�����
    public final void move(){
        super.move();  // ���ø���ķ���
        System.out.println("Dogs can walk and run");
        // ͨ�� getter �������ø������ر���
        System.out.println("Please remember: " + super.getDesc());
    }
    
}