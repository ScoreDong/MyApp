/**  
 * Project Name:JavaProject  
 * File Name:People.java  
 * Package Name:main.java  
 * Date:2017��12��10������12:20:01  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  
  
package main.java;  
/**  
 * ClassName:People <br/>  
 * Function: ���磺People��һ���ӿڣ���������say��������� <br/>  
 * �ӿڣ��������,��Ϊ��һ������ĳ����ࡣ <br/> 
 * ���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ <br/> 
 * class���ڶ����� <br/> 
 * interface���ڶ���ӿ� <br/>  
 * �ӿڶ�����,��ʽ�ص㣺 <br/> 
 * 1.�ӿ��г�������:���������󷽷� <br/> 
 * 2.�ӿ��г�Ա���й̶����η� <br/> 
 *   ������ public static final <br/> 
 *   ������ public abstract <br/> 
 *    Ĭ�ϻᲹȫ����Ϊ���õ��Ķ��ԣ�Ӧдȫ�� <br/> 
 *       �ӿ��еĳ�Ա����public�� <br/> 
 * �ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷�����Ҫ������ʵ�֡� <br/>  
 * Date:     2017��12��10�� ����12:20:01 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        PeopleChinese
 * @FunctionalInterface ע��ֻ�����ĵ������ã�˵������ӿ��Ǻ���ʽ�ӿڣ�������������ʹ�����ע��������һ���ӿ��ǲ��Ǻ���ʽ�ӿڡ�
 */

@FunctionalInterface
public interface PeopleInterface {
	/** �ӿ�û�з����塣ֻ��ͨ��һ���������ȥʵ�����еķ����� */
	public abstract void say();
	/**���಻���Ը��Ǹ���ķ������߱�������ʹ���ඨ���븸����ͬ�ı������ߺ�����Ҳ�ᱻ����ȡ������*/
	public static final int NUM = 3;
}
  
