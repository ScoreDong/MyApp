/**  
 * Project Name:JavaProject  
 * File Name:Chinese.java  
 * Package Name:main.java  
 * Date:2017��12��10������12:17:37  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  
  
package main.java;  
/**  
 * ClassName:Chinese <br/>  
 * Function: implements��һ���࣬ʵ��һ���ӿ��õĹؼ��֣���������ʵ�ֽӿ��ж���ĳ��󷽷���ʵ��һ���ӿڣ�����ʵ�ֽӿ��е����з����� <br/>  
 * (1)�ӿڿ��Ա�����ʵ�֣�implements��,������ֻ�ܱ���һ�̳У�extends��
 * (2)�ӿ�ֻ�ж���,����������ж����ʵ��
 * (3)�ӿڵ��ֶζ���Ĭ��Ϊ:public static final, �������ֶ�Ĭ����"friendly"(�����ɼ�)
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        PeopleInterface
 */
public class PeopleChinese implements PeopleInterface{
	
	
	@Override
	public void say() {
		/** �ӿڵ�ʵ��:*/
		System.out.println(" ��ã�");
	}
	public static void main(String[] arguments) {
		/**�ӿڵĵ��ã�*/
		PeopleInterface chinese = new PeopleChinese() ;
		chinese.say();
		
		/** �ӿڵ�ʵ��+����,����lambda���ʽ*/
		PeopleInterface english = () -> {System.out.println(" Hello!");};
		english.say();
}}
  
