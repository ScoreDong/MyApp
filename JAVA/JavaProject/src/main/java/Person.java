/**  
 * Project Name:JavaProject  
 * File Name:Person.java  
 * Package Name:main.java  
 * Date:2018��1��2������10:20:32  
 * Copyleft (c) 2018, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  
  
package main.java;

import java.util.Arrays;
import java.util.stream.Collectors;

/**  
 * ClassName:Person <br/>  
 * Function: jdk8������-��Ϲ�۵�lambda���ʽ. <br/>  
 * Reason:   jdk8֮ǰ����������дGUI������¼�������ʱ�򣬸��ֵ������ڲ��࣬��Ѵ�����Ĵ��룬����������п��ԣ���Ȼjava��һ�н�Ϊ������ô����������ĳЩ��̬����һ��������Ҳ���Ե����Ƕ��󰡣������Ҳ���Ե����Ƕ��󰡣����ź���ʽ��̵ĸ���Խ��Խ�������ģ�java��CODE=OBJECT����һ�����ڵ����ˣ��������Ϊlambda���ʽ������Ϊ�˴��﷨�ϼ������ڲ��࣬�Ǿ�̫С��jdk8��lambda�ˣ�. <br/>  
 * Date:     2018��1��2�� ����10:20:32 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        http://blog.csdn.net/goldenfish1919/article/details/22747375
 */

public class Person{  
        public String firstName;  
        public String lastName;  
        public int age;  
        public Person(String firstName, String lastName, int age){  
                this.firstName = firstName;  
                this.lastName = lastName;  
                this.age = age;  
        }  
        public String getFirstName(){  
                return this.firstName;  
        }  
        public String getLastName(){  
                return this.lastName;  
        }  
        public int getAge(){  
                return this.age;  
        }  
        public String toString(){  
                return firstName+","+lastName+","+age;  
        }  
        public String toJson(){  
                return "{"+  
                                "firstName:\""+firstName+"\","+  
                                "lastName:\""+lastName+"\","+  
                                "age:"+age +  
                                "}";  
        }  
        public static void main(String args[]){  
         Person people[] = new Person[]{  
                 new Person("Ted", "Neward", 10),  
                 new Person("Charlotte", "Neward", 41),  
                 new Person("Michael", "Naward", 19),  
                 new Person("Matthew", "Nmward", 13)  
         };  
         // ����ţ�Ƶ�
         String json = Arrays.asList(people).stream().map(Person::toJson).collect(Collectors.joining(", ", "[", "]"));  
         System.out.println(json);  
 }  
}  