package main.java;
/**
 * �ڼ̳����У����ǽ���������ת����Ϊ������ת�͡���������������ת����Ϊ������ת�͡���
 * ע�⣺����ֱ�ӽ�����Ķ���ǿ��ת��Ϊ�������ͣ�ֻ�ܽ�����ת�ͺ����������ٴ�ת��Ϊ�������͡�Ҳ����˵����������������ת�ͺ󣬲���������ת�͡�
 */
public class Instanceof {
	public static void main(String[] args) {
        // ���� People ���ʵ��
        People superObj = new People();
        System.out.println("// ���� People ���ʵ����WhatInstanceOf(superObj);");
        WhatInstanceOf(superObj);
        // ���� President ���ʵ��
        President sonObj = new President();
        System.out.println("// ���� President ���ʵ���� WhatInstanceOf(sonObj);");
        WhatInstanceOf(sonObj);
        // ����Object ���ʾ��
        final Object  i = null;
        System.out.println("// ����Object ���ʾ����Object i = null;");
        WhatInstanceOf(i);
        
        //����Ĵ�������ʱ���׳��쳣�����ܽ��������ֱ��ת��Ϊ��������
        //President sonObj2 = (SonClass)superObj;
        
        //��ȷ������������ת�ͣ�������ת��
        System.out.println("���ǽ���������ת����Ϊ������ת�͡���������������ת����Ϊ������ת�͡���");
        superObj=sonObj;
        Teacher sonObj2=(Teacher)superObj;
        WhatInstanceOf(sonObj2);
        
	}
    public static void WhatInstanceOf(Object obj) {
        if(obj instanceof Object){
            System.out.println("����һ������");
        }
        if(obj instanceof People){
            System.out.println("��������");
        }
        if(obj instanceof Teacher){
            System.out.println("����һ����ʦ");
        }
        if(obj instanceof President){
            System.out.println("����У��");
        }

        System.out.println("-----------");  

    }
}

class People{ }
class Teacher extends People{ }
class President extends Teacher{ }
