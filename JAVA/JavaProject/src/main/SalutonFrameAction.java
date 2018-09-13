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
 * Function: SalutonFrame֮��ѧϰ�����¼� <br/>  
 * Reason:   ѧϰ <br/>  
 * Date:     2017��12��6�� ����11:10:08 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//ʹ��ActionListener�ӿ�

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalutonFrameAction extends JFrame implements ActionListener {

	/**  
	 * serialVersionUID:ϵͳ˵Ҫ��һ��ID.  
	 * @since JDK 1.6  
	 */
	private static final long serialVersionUID = 1L;
	private static final int width=500, height=500; //д�����ڴ�С�����ľͺ�
	static JButton okButton = new JButton("OK");//����OK��ť
	static JLabel pageLabel = new JLabel("input something", JLabel.RIGHT);// ����label
	static JTextField pageInput = new JTextField("default", 20);// ����JTextField
	static JCheckBox jumbo1 = new JCheckBox("����һ����ѡ��", false);// ���3����ѡ��
	static JCheckBox jumbo2 = new JCheckBox("����һ����ѡ��", false);
	static JCheckBox jumbo3 = new JCheckBox("����һ��ѡ�еĸ�ѡ��", true);
	static ButtonGroup jumboGroup = new ButtonGroup();// ����һ����ѡ���ButtonGroup
	
	public SalutonFrameAction() {
		super("Hellow World");//���ñ���
		this.setSize(width, height);//���ô��ڴ�С������Ͳ�дthis����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����Ϊ�رմ��ں��˳�
		FlowLayout flo = new FlowLayout();//���ô��ڲ��ֹ�����FlowLayout
		setLayout(flo);//����FlowLayout
		add(okButton);//���OK��ť������
		add(pageLabel);//���label������
		add(pageInput);//���Text������
		jumboGroup.add(jumbo1);//��ǰ�����3����ѡ��ŵ�һ��group����
		jumboGroup.add(jumbo2);
		jumboGroup.add(jumbo3);
		this.add(jumbo1);//���3����ѡ�򵽽���
		this.add(jumbo2);//��Ϊ�ڹ��캯�����棬���Բ���this
		this.add(jumbo3);
	}

	public static final void main(String[] args) {
		SalutonFrameAction frame = new SalutonFrameAction();
		frame.setVisible(true);//��ʾ����
		okButton.addActionListener(frame);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub  
		Object source = event.getSource();
		System.out.println(source);
	}

}
  
