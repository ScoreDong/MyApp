/**  
 * Project Name:JavaProject  
 * File Name:Impl.java  
 * Package Name:main.java  
 * Date:2018��1��2������10:09:51  
 * Copyleft (c) 2018, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  
  
package main.java;  
/**  
 * ClassName:Impl <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018��1��2�� ����10:09:51 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
interface I1 {  
    public default void print(){  
            System.out.println("I1");  
    }  
    public void hello();  
}  
interface I2{  
    public default void print(){  
            System.out.println("I2");  
    }  
    public void world();  
}  
public class Impl implements I1,I2{  
    public void hello(){  
    }  
    public void world(){  
    }
	@Override
	public void print() {
		  
		// ��̳У������ܵġ����븲�ǵ��������Sub�̳��������ӿڣ�Base1��Base2�����������ӿ�ǡ�þ�����ȫ��ͬ������Ĭ�Ϸ�������ô�ͻ������ͻ����ʱSub��ͱ���ͨ����������ʽָ���Լ�Ҫʹ����һ���ӿڵ�ʵ�֣������ṩ�Լ���ʵ�֣�
		I1.super.print();
	}
	public static void main(String[] args) {
		Impl a =new Impl();
		a.print();
	}
}  
  
