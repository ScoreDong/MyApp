/**  
 * Project Name:JavaProject  
 * File Name:HashMap1.java  
 * Package Name:main.java  
 * Date:2017��12��15������12:31:30  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  
  
package main.java;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**  
 * ClassName:HashMap1 <br/>  
 * Function: ��ʼѧϰHashMap <br/>  
 * Reason:   ��ʼѧϰHashMap. <br/>  
 * Date:     2017��12��15�� ����12:31:30 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class HashMap1 {
	private static HashMap<Serializable, Serializable> first = new HashMap<Serializable, Serializable>();
	private static HashMap<String,Long> phonebook =new HashMap<>();
	
	public static void main(String[] args) {
		// HashMap�洢����
		phonebook.put("MyPhoneNumber", 1234567890L);
		phonebook.put("PhoneNumber1", 11111L);
		phonebook.put("PhoneNumber2", 22222L);
		phonebook.put("MyPhoneNumber", 654321L);//���keyֵһ���ᷢ��ʲô�أ������棬����������
		first.put((String)"abc", (String)"def");
		first.put(123, 123);
		// HashMap��ȡ����
		Long a=phonebook.get("MyPhoneNumber");
		System.out.println("// HashMap��ȡ���� MyPhoneNumber " + a);
		a=phonebook.getOrDefault(null, -1L);
		System.out.println("// HashMap��ȡ�����ڵ�ֵnull��ʹ�� getOrDefault ���ⷵ��null�� " + a);
		// ͳ��size
		System.out.println(" phonebook.size(); " + phonebook.size());
		// ��������while������Iterator��
		final Iterator<Entry<String, Long>> iter = phonebook.entrySet().iterator();
		while (iter.hasNext()) {
			final Entry<String, Long> entry = iter.next();
			final Object key = entry.getKey();
			System.out.print(" key = entry.getKey(); " + key);
			final Object val = entry.getValue();
			System.out.println(" val = entry.getValue(); " + val);
		}
		// �������󣨰��̿��飩
		for (Map.Entry<String, Long> entry : phonebook.entrySet()){
			System.out.print(" entry.getKey(); " + entry.getKey());
			System.out.println(" entry.getValue(); " + entry.getValue());
		}
	}
}
  
