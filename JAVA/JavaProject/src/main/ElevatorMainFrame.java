/**  
 * Project Name:JavaProject  
 * File Name:MainFrame.java  
 * Package Name:main  
 * Date:2017��12��10������11:18:50  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/

package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * ClassName:MainFrame <br/>
 * Function: ��������ͣ�ڲ�ͬ��¥�㣬����������е��ȡ� <br/>
 * д�������������һ���Ĵ��룬���Ʋ��ῴ�ڶ����ˡ�<br/>
 * Reason: JAVA����ݷ��� <br/>
 * Date: 2017��12��10�� ����11:18:50 <br/>
 * 
 * @author yao
 * @version
 * @since JDK 1.6
 * @see
 */
public class ElevatorMainFrame extends JFrame implements ActionListener {
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button = new JButton("��ʼ����");
	JLabel label = new JLabel();
	// TextArea���ڴ�ŷ�����
	public static JTextArea result = new JTextArea();
	JTextField textBox = new JTextField();
	MyPanel mypanel = new MyPanel();

	/**
	 * serialVersionUID:�������ǻ������������.
	 * 
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 1L;

	public ElevatorMainFrame() throws HeadlessException {
		// ����ͼ�ν���
		this.setTitle("���ݷ���");
		this.setLayout(new BorderLayout());
		this.setSize(800, 450);
		this.setLocation(200, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setSize(300, 450);
		panel.setLayout(new BorderLayout());
		panel1.setLayout(new GridLayout(1, 2));
		panel2.setLayout(new GridLayout(2, 1));
		panel2.add(button);
		label.setText("��������:");
		panel1.add(label);
		panel1.add(textBox);
		panel2.add(panel1);
		panel.add(panel2, BorderLayout.NORTH);
		result.setEditable(false);
		result.setWrapStyleWord(true);
		JScrollPane scrollPanel = new JScrollPane(result);
		panel.add(scrollPanel, BorderLayout.CENTER);
		this.add(panel, BorderLayout.WEST);
		this.add(mypanel, BorderLayout.CENTER);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (textBox.getText().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "����������");
		} else {
			try {
				int people = Integer.parseInt(textBox.getText());
				if (people <= 0) {
					JOptionPane.showMessageDialog(null, "��������С�ڻ����0");
				} else {
					Data.setPeople(people);
					Random random = new Random();
					Data.setStartLevel(random.nextInt(20) + 1);
					int temp = random.nextInt(20) + 1;
					while (temp == Data.getStartLevel()) {
						temp = random.nextInt(20) + 1;
					}
					Data.setEndLevel(temp);
					result.setText("���濪ʼ��\n");
					result.append(Data.getPeople() + "�˴�" + Data.getStartLevel() + "¥Ҫȥ" + Data.getEndLevel() + "¥\n");
					mypanel.Init();
					button.setEnabled(false);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "������������");
			}
		}
	}

	public ElevatorMainFrame(GraphicsConfiguration arg0) {

		super(arg0);

		// TODO Auto-generated constructor stub

	}

	public ElevatorMainFrame(String arg0) throws HeadlessException {

		super(arg0);
		// TODO Auto-generated constructor stub

	}

	public ElevatorMainFrame(String arg0, GraphicsConfiguration arg1) {

		super(arg0, arg1);
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		ElevatorMainFrame frame = new ElevatorMainFrame();
		frame.setVisible(true);
	}

	public class MyPanel extends JPanel {

		/**
		 * serialVersionUID:�������������������.
		 * 
		 * @since JDK 1.6
		 */
		private static final long serialVersionUID = 1L;

		int leavePeople = 0;
		int tag1 = 1;

		public MyPanel() {
			this.setSize(500, 500);
		}

		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			for (int i = 0; i < 20; i++) {
				g2.drawString(String.valueOf(20 - i), 20, 20 * (i + 1));
			}
			for (int i = 0; i < 5; i++) {
				if (i != 0 && i != 4) {
					g2.drawString("����" + i, 110 + 120 * i, 418);
				} else if (i == 0) {
					g2.drawString("��ʼ¥��", 110 + 120 * i, 418);
				} else {
					g2.drawString("����", 110 + 120 * i, 418);
				}
			}
			for (int i = 0; i < 5; i++) {
				g2.setColor(Color.gray);
				Rectangle2D rect = new Rectangle2D.Double(90 + 120 * i, 5, 80, 400);
				g2.fill(rect);
			}
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 20; j++) {
					g2.setColor(Color.RED);
					Rectangle2D rect = new Rectangle2D.Double(90 + 120 * i, 5 + 20 * j, 80, 20);
					g2.draw(rect);
				}
			}

			// ��̨���ݣ��ֱ�ͣ�ڲ�ͬ��¥��
			g2.setColor(Color.GREEN);
			Rectangle2D rect3 = new Rectangle2D.Double(90 + 120, 5 + 20 * 19, 80, 20);
			g2.fill(rect3);
			g2.setColor(Color.RED);
			g2.drawRect(90 + 120, 5 + 20 * 19, 80, 20);
			g2.setColor(Color.GREEN);
			Rectangle2D rect4 = new Rectangle2D.Double(90 + 120 * 2, 5 + 20 * 10, 80, 20);
			g2.fill(rect4);
			g2.setColor(Color.RED);
			g2.drawRect(90 + 120 * 2, 5 + 20 * 10, 80, 20);
			g2.setColor(Color.GREEN);
			Rectangle2D rect5 = new Rectangle2D.Double(90 + 120 * 3, 5, 80, 20);
			g2.fill(rect5);
			g2.setColor(Color.RED);
			g2.drawRect(90 + 120 * 3, 5, 80, 20);
			g2.dispose();
		}

		// ���û�����󣬵�����水ť�����г�ʼ��
		public void Init() {
			Graphics2D g2 = (Graphics2D) this.getGraphics();
			// ����ʼ¥��Ŀ���Ϊ��ɫ
			g2.setColor(Color.GREEN);
			Rectangle2D rect1 = new Rectangle2D.Double(90, 5 + 20 * (20 - Data.getStartLevel()), 80, 20);
			g2.fill(rect1);
			g2.setColor(Color.RED);
			g2.drawRect(90, 5 + 20 * (20 - Data.getStartLevel()), 80, 20);
			g2.drawString(String.valueOf(Data.getPeople()), 120, 5 + 20 * (20 - Data.getStartLevel() + 1));
			// ����ֹ¥��Ŀ�Ҳ��Ϊ��ɫ
			g2.setColor(Color.GREEN);
			Rectangle2D rect2 = new Rectangle2D.Double(90 + 120 * 4, 5 + 20 * (20 - Data.getEndLevel()), 80, 20);
			g2.fill(rect2);
			g2.setColor(Color.RED);
			g2.drawRect(90 + 120 * 4, 5 + 20 * (20 - Data.getEndLevel()), 80, 20);
			g2.drawString("0", 120 + 120 * 4, 5 + 20 * (20 - Data.getEndLevel() + 1));
			g2.dispose();
			leavePeople = Data.getPeople();
			if (leavePeople <= 13) {
				if (Data.getStartLevel() <= 6) {
					Elevator(1);
				} else if (Data.getStartLevel() >= 7 && Data.getEndLevel() <= 13) {
					Elevator(2);
				} else if (Data.getStartLevel() > 13) {
					Elevator(3);
				}
			} else if (leavePeople > 13 && leavePeople <= 26) {
				if (Data.getStartLevel() <= 10) {
					Elevator(1);
					Elevator(2);
				} else {
					Elevator(2);
					Elevator(3);
				}
			} else if (leavePeople > 26) {
				Elevator(1);
				Elevator(2);
				Elevator(3);
			}
		}

		// ����ĳ������
		class myTimerTask extends TimerTask {
			int mydr;
			int lou;
			int myi;
			int tag = 0;
			int elepeople = 0;

			Graphics2D g1;

			public myTimerTask(int i, int direction, JPanel panel) {
				mydr = direction;
				myi = i;
				g1 = (Graphics2D) panel.getGraphics();
				// ��δʹ�ù�
				if (direction == 0) {
					if (i == 2) {
						lou = 10;
						if (Data.getStartLevel() >= 10) {
							mydr = 1;
						} else {
							mydr = -1;
						}
					} else if (i == 1) {
						lou = 1;
						mydr = 1;
					} else if (i == 3) {
						lou = 20;
						mydr = -1;
					}
				}
			}

			public void run() {
				// System.out.println(1000);
				if (mydr == 1 && lou != Data.getStartLevel() && lou != Data.getEndLevel()) {
					g1.setColor(Color.GRAY);
					Rectangle2D rect3 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
					g1.fill(rect3);
					g1.setColor(Color.GREEN);
					Rectangle2D rect4 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou - 1), 80, 20);
					g1.fill(rect4);
					g1.setColor(Color.RED);
					g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
					g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou - 1), 80, 20);
					g1.drawString(String.valueOf(elepeople), 120 + 120 * myi, 5 + 20 * (20 - lou));
					lou++;
				} else if (mydr == -1 && lou != Data.getStartLevel() && lou != Data.getEndLevel()) {
					g1.setColor(Color.GRAY);
					Rectangle2D rect3 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
					g1.fill(rect3);
					g1.setColor(Color.GREEN);
					Rectangle2D rect4 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou + 1), 80, 20);
					g1.fill(rect4);
					g1.setColor(Color.RED);
					g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
					g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou + 1), 80, 20);
					g1.drawString(String.valueOf(elepeople), 120 + 120 * myi, 5 + 20 * (20 - lou + 2));
					lou--;
				} else if (lou == Data.getStartLevel()) {
					if (leavePeople > 13) {
						leavePeople -= 13;
						elepeople = 13;
					} else {
						elepeople = leavePeople;
						leavePeople = 0;
					}
					g1.setColor(Color.GREEN);
					Rectangle2D rect3 = new Rectangle2D.Double(90, 5 + 20 * (20 - Data.getStartLevel()), 80, 20);
					g1.fill(rect3);
					g1.setColor(Color.RED);
					g1.drawRect(90, 5 + 20 * (20 - Data.getStartLevel()), 80, 20);
					g1.drawString(String.valueOf(leavePeople), 120, 5 + 20 * (20 - Data.getStartLevel() + 1));

					if (Data.getStartLevel() < Data.getEndLevel()) {
						mydr = 1;
					} else {
						mydr = -1;
					}
					if (mydr == 1) {
						g1.setColor(Color.GRAY);
						Rectangle2D rect5 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.fill(rect5);
						g1.setColor(Color.GREEN);
						Rectangle2D rect4 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou - 1), 80, 20);
						g1.fill(rect4);
						g1.setColor(Color.RED);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou - 1), 80, 20);
						g1.drawString(String.valueOf(elepeople), 120 + 120 * myi, 5 + 20 * (20 - lou));
						lou++;
					} else if (mydr == -1) {
						g1.setColor(Color.GRAY);
						Rectangle2D rect5 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.fill(rect5);
						g1.setColor(Color.GREEN);
						Rectangle2D rect4 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou + 1), 80, 20);
						g1.fill(rect4);
						g1.setColor(Color.RED);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou + 1), 80, 20);
						g1.drawString(String.valueOf(elepeople), 120 + 120 * myi, 5 + 20 * (20 - lou + 2));
						lou--;
					}
				} else if (lou == Data.getEndLevel()) {
					g1.setColor(Color.GREEN);
					Rectangle2D rect3 = new Rectangle2D.Double(90 + 120 * 4, 5 + 20 * (20 - Data.getEndLevel()), 80,
							20);
					g1.fill(rect3);
					g1.setColor(Color.RED);
					if (elepeople != 0)
						g1.drawRect(90 + 120 * 4, 5 + 20 * (20 - Data.getStartLevel()), 80, 20);
					if (elepeople != 0) {
						Data.arrive += elepeople;
						g1.drawString(String.valueOf(Data.arrive), 120 + 120 * 4,
								5 + 20 * (20 - Data.getEndLevel() + 1));
						ElevatorMainFrame.result.append(String.valueOf(elepeople) + "����Ŀ�ĵ�\n");
					}

					if (Data.getStartLevel() < Data.getEndLevel()) {
						mydr = -1;
					} else {
						mydr = 1;
					}
					if (mydr == 1) {
						g1.setColor(Color.GRAY);
						Rectangle2D rect5 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.fill(rect5);
						g1.setColor(Color.GREEN);
						Rectangle2D rect4 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou - 1), 80, 20);
						g1.fill(rect4);
						g1.setColor(Color.RED);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou - 1), 80, 20);
						g1.drawString("0", 120 + 120 * myi, 5 + 20 * (20 - lou));
						lou++;
					} else if (mydr == -1) {
						g1.setColor(Color.GRAY);
						Rectangle2D rect5 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.fill(rect5);
						g1.setColor(Color.GREEN);
						Rectangle2D rect4 = new Rectangle2D.Double(90 + 120 * myi, 5 + 20 * (20 - lou + 1), 80, 20);
						g1.fill(rect4);
						g1.setColor(Color.RED);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou), 80, 20);
						g1.drawRect(90 + 120 * myi, 5 + 20 * (20 - lou + 1), 80, 20);
						g1.drawString("0", 120 + 120 * myi, 5 + 20 * (20 - lou + 2));
						lou--;
					}
					if (leavePeople == 0) {
						this.cancel();
						return;
					}
					elepeople = 0;
				}
			}
		}

		public void Elevator(int i) {
			int direction = 0;
			final Timer timer = new Timer();
			myTimerTask my = new myTimerTask(i, direction, this);
			timer.schedule(my, 1000, 1000);
		}
	}

	public static final class Data {
		// �������ݵ�����
		private static int people = 0;
		// ���ݿ�ʼ��¥��
		private static int startLevel = 0;
		// ���ݵ����¥��
		private static int endLevel = 0;
		// һ̨�����ܹ����ص�����
		private static int maxPeople = 13;
		public static int arrive = 0;

		public static void setPeople(int p) {
			people = p;
		}

		public static int getPeople() {
			return people;
		}

		public static void setStartLevel(int s) {
			startLevel = s;
		}

		public static int getStartLevel() {
			return startLevel;
		}

		public static void setEndLevel(int e) {
			endLevel = e;
		}

		public static int getEndLevel() {
			return endLevel;
		}

		public static int getMaxPeople() {
			return maxPeople;
		}
	}
}