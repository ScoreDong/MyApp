/**  
 * Project Name:JavaProject  
 * File Name:SpacePanel.java  
 * Package Name:main  
 * Date:2017��12��7������12:05:12  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  
  
package main;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**  
 * ClassName:SpacePanel <br/>  
 * Function: ��ʾ�ܿռ��ʣ��ռ�. <br/>  
 * Reason:   ѧϰѧϰ. <br/>  
 * Date:     2017��12��7�� ����12:05:12 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class SpacePanel extends JPanel{
	/**  
	 * serialVersionUID:ϵͳ˵Ҫ��һ��ID.  
	 * @since JDK 1.6  
	 */
	private static final long serialVersionUID = 1L;
	JLabel spaceLabel = new JLabel("Disk space:");
	JLabel space = new JLabel();
	public SpacePanel() {
		super();
		try {
			setValue();
		}catch(IOException ioe) {
			space.setText("Error");
		}
	}
	private void setValue() throws IOException {
		//��ȡ��ǰ����
		Path current = Paths.get("");
		FileStore store =Files.getFileStore(current);
		//��ȡ��ǰ���̿ռ����
		long totalSpace = store.getTotalSpace();
		long freeSpace = store.getUsableSpace();
		space.setText("totalSpace is " + totalSpace + " freeSpace is " + freeSpace);
	}

}
  
