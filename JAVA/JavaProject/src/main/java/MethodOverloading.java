package main.java;
/**
 * <h1>���أ�</h1>
 * <h3>˵����</h3>
 * <li>�����б�ͬ������������ͬ�����Ͳ�ͬ��˳��ͬ��</li>
 * <li>���������������Ʋ�ͬ�ǲ����Եġ�</li>
 * <li>����Ա����һ�������췽��Ҳ�������ء�</li>
 * <li>����Ϊfinal�ķ������ܱ����ء�</li>
 * <li>����Ϊstatic�ķ������ܱ����أ������ܹ����ٴ�������</li>
 * <h3>���������صĹ���</h3>
 * <li>�������Ʊ�����ͬ��</li>
 * <li>�����б���벻ͬ��������ͬ�������Ͳ�ͬ����������˳��ͬ�ȣ���</li>
 * <li>�����ķ������Ϳ�����ͬҲ���Բ���ͬ��</li>
 * <li>�����������Ͳ�ͬ�����Գ�Ϊ���������ء�</li>
 * <h3>�������ص�ʵ�֣�</h3>
 * <li>����������ͬʱ������������ݵ��÷����Ĳ����������������͵�ȥ���ƥ�䣬��ѡ���Ӧ�ķ��������ƥ��ʧ�ܣ��������������������طֱ档</li>
 */
public class MethodOverloading {

    public static class Demo{
        /**
         * һ����ͨ�ķ�������������
         */
        void test(){
            System.out.println("No parameters");
        }
        /**
         * ��������ķ��������Ҵ���һ�����Ͳ���
         */
        void test(int a){
            System.out.println("a: " + a);
        }
        /**
         * ��������ķ��������Ҵ�����������
         */
        void test(int a,int b){
            System.out.println("a and b: " + a + " " + b);
        }
        /**
         * ��������ķ��������Ҵ���һ��˫���Ȳ���
         */
        double test(double a){
            System.out.println("double a: " + a);
            return a*a;
        }
       
        public static void main(String args[]){
            Demo obj= new Demo();
            obj.test();
            obj.test(2);
            obj.test(2,3);
            obj.test(2.0);
        }
    }
}
