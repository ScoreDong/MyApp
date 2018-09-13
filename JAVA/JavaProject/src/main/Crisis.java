/**  
 * Project Name:JavaProject  
 * File Name:Crisis.java  
 * Package Name:main  
 * Date:2017��12��9������7:54:46  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  

package main;

import java.awt.FlowLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**  
 * ClassName:Crisis <br/>  
 * Function: ѧϰ�û����沼��<br/>  
 * Reason:   ADD REASON. <br/>  
 * Date:     2017��12��9�� ����7:54:46 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */

public class Crisis extends JFrame {
	/**  
	 * serialVersionUID:�汾���ƣ�ȷ���汾һ����.  
	 * @since JDK 1.6  
	 */
	private static final long serialVersionUID = 1L;
	private static final int width=500, height=500; //д�����ڴ�С�����ľͺ�
	private static final String lookAndFeel = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public Crisis() {
		super();
		JPanel row = new JPanel();
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���õ���ر��˳�
		FlowLayout flo = new FlowLayout();
		row.setLayout(flo);
		ArrayList<JButton> buttons = new ArrayList<JButton>(5);//���������ť
		buttons.add(new JButton("Panic"));//������Ӱ�ť
		buttons.add(new JButton("Don't Panic"));
		buttons.add(new JButton("Blame Others"));
		buttons.add(new JButton("Notify the Media"));
		buttons.add(new JButton("Save Yourself"));
		for (JButton button:buttons) {
			row.add(button);//������ӵ��û�����
		}
		this.add(row);
		this.setVisible(true);
	}
	public Insets getInsets() {
		Insets squeeze = new Insets(100,50,20,0);//�������ұ߿���룬���� getInsets()����
		return squeeze;
	}
	private static void setLookAndFeel() {
		  try {
			  UIManager.setLookAndFeel(lookAndFeel);
		  }catch(Exception exc) {
			  System.out.println(exc);//������󣬼������г���
		  }
	}
	public static final void main(String[] arguments) {
		Crisis.setLookAndFeel();
		@SuppressWarnings("unused")
		Crisis frame =new Crisis();
	}

}
  
