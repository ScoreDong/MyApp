/**  
 * Project Name:JavaProject  
 * File Name:SalutonFrame.java  
 * Package Name:main  
 * Date:2017��12��6������11:10:08  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  

package main;  
/**  
 * ClassName:SalutonFrame <br/>  
 * Function: ѧϰʹ�ô��塢����������û����� <br/>  
 * Reason:   ѧϰ <br/>  
 * Date:     2017��12��6�� ����11:10:08 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SalutonFrame extends JFrame {

	/**  
	 * serialVersionUID:ϵͳ˵Ҫ��һ��ID.  
	 * @since JDK 1.6  
	 */
	private static final long serialVersionUID = 1L;

	public SalutonFrame() {
		super("Hellow World");//���ñ���
		setSize(500,500);//���ô��ڴ�С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����Ϊ�رմ��ں��˳�
		FlowLayout flo = new FlowLayout();//���ô��ڲ��ֹ�����FlowLayout
		setLayout(flo);//����FlowLayout
		JButton okButton = new JButton("OK");//����OK��ť
		add(okButton);//���OK��ť������
		JLabel pageLabel = new JLabel("input something",JLabel.RIGHT);//����label
		add(pageLabel);//���label������
		JTextField pageInput = new JTextField("default",20);
		add(pageInput);//���Text������
		JCheckBox jumbo1 = new JCheckBox("����һ����ѡ��",false);//���3����ѡ��
		JCheckBox jumbo2 = new JCheckBox("����һ����ѡ��",false);
		JCheckBox jumbo3 = new JCheckBox("����һ��ѡ�еĸ�ѡ��",true);
		ButtonGroup jumboGroup = new ButtonGroup();//����3����ѡ��ŵ�һ��group����
		jumboGroup.add(jumbo1);
		jumboGroup.add(jumbo2);
		jumboGroup.add(jumbo3);
		this.add(jumbo1);//���3����ѡ�򵽽���
		this.add(jumbo2);//��Ϊ�ڹ��캯�����棬���Բ���this
		this.add(jumbo3);
	}

	public static void main(String[] args) {
		SalutonFrame frame = new SalutonFrame();
		SpacePanel spaceLanel = new SpacePanel();//��ʾ���̿ռ�
		frame.add(spaceLanel.spaceLabel);
		frame.add(spaceLanel.space);
		frame.setVisible(true);//��ʾ����
	}
	public static final String lookAndFeel = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public static void setLookAndFeel() {
		  try {
			  UIManager.setLookAndFeel(lookAndFeel);
			  System.out.println(lookAndFeel);
		  }catch(Exception exc) {
			  System.out.println(exc);//������󣬼������г���
		  }
	}

}
  
