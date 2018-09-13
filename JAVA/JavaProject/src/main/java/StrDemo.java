package main.java;
/**
 * StringBuffer����
 */
public class StrDemo {
	public static void main(String[] args) {
		String s = "abc";
		StringBuffer sb1 = new StringBuffer();  // ������ʼ������StringBuffer������һ���յĶ���,16���ֽڳ��ȵĻ�����
		//StringBuilder sbBuilder1 = new StringBuilder("This is only a StringBuilder");  // StringBuilder �ַ������������̰߳�ȫ��
		
		//ʹ��˵����
		//strBuf1=(StringBuffer)s;  // StringBuffer��String���ڲ�ͬ�����ͣ������ڼ̳й�ϵ������ֱ�ӽ���ǿ������ת��
		StringBuffer sb2 = new StringBuffer(s);  // Stringת��ΪStringBuffer
		System.out.println("Stringת��ΪStringBuffer��Ҫͨ��new StringBuffer()ʵ�֣�String��"+s+"  StringBuffer��"+sb2.toString());
		s=sb1.toString();  // StringBufferת��ΪString
		sb1.append(s);  // ����append�޸��ǿ��Ե�
		
		//StringBuffer���еķ�����Ҫƫ���ڶ����ַ����ı仯������׷�ӡ������ɾ����
		main.java.StrDemo.stringVsStringBuffer(s, sb1);		
		System.out.println("//ע��StringBuffer���޸ĺ���Է��� StringBuffer: " + sb1.toString());
	}
	/**
	 * Ϊʲô��append�����أ���ΪЧ�ʸ߰���������String��StringBuffer�ֱ�ƴװSQL���1000��
	 * @param s,sb1
	 */
	public static void stringVsStringBuffer(String s,StringBuffer sb1){
		final int times = 100000;
        // ͨ��String����
        long timeStart1 = System.currentTimeMillis();
        String sInfo[] = {"SELECT * FROM INFO WHERE INFO=","UESRNAME",";"};
        for (int i=0; i<times; i++) {
            s=sInfo[0]+sInfo[1]+sInfo[2];
        }
        long timeEnd1 = System.currentTimeMillis();
        System.out.println("String: " + s + "����ʱ��"+(timeEnd1 - timeStart1) + "ms");
        // ͨ��StringBuffer����
        timeStart1 = System.currentTimeMillis();
        for (int i=0; i<times; i++) {
        	sb1.setLength(0);
            sb1.append("select * from userInfo where username=")
            .append(sInfo[1])
            .append(";");
        }
        timeEnd1 = System.currentTimeMillis();
        System.out.println("StringBuffer: " + sb1.toString() +  "����ʱ��"+(timeEnd1 - timeStart1) + "ms");	
	}

}
