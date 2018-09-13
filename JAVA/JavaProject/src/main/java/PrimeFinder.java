/**  
 * Project Name:JavaProject  
 * File Name:PrimeFinder.java  
 * Package Name:main.java  
 * Date:2017��12��17������8:27:08  
 * Copyleft (c) 2017, git@github.com:xiaoxiaoyao/MyApp.git .
 *  
*/  
  
package main.java;

import java.util.Scanner;

/**  
 * ClassName:PrimeFinder <br/>  
 * Function: ���߳���ϰ <br/>  
 * Reason:   ѧϰ���߳� <br/>  
 * Date:     2017��12��17�� ����8:27:08 <br/>  
 * @author   yao  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class PrimeFinder implements Runnable {
	private static boolean isPrime(final int checkNumber) {
		double root = Math.sqrt(checkNumber);
		for (int i = 2 ; i <= root;i++) {
			if(checkNumber % i ==0) {
				return false;
			}
		}
		return true;
	}
	Thread go;
	private int numPrime;
	PrimeFinder(int numPrimes){
		super();
		this.setNumPrime(numPrimes);
        go = new Thread(this);
        //��������̺߳��������У���ֱ��go.run()
        //go.run();
	}
	public static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
        System.out.println("������һ����ֵ��Ѱ��1��������ֵ��Χ��������������"); 
        int maxNum ;
        maxNum = sc.nextInt(); 
        System.out.println("Ѱ��1��"+ maxNum + "��Χ����������"); 
        int numPrimes = 1;
		while(numPrimes<maxNum) {
	        PrimeFinder pf =new PrimeFinder(numPrimes);
	        //�����̣߳�go.start
	        pf.go.start();
			numPrimes++;
		}

	}

	@Override
	public void run() {
		int numPrime = this.getNumPrime();
		System.out.println("now num is " + numPrime);
		if(isPrime(numPrime)) {
			System.out.println(numPrime);
		}
	}

	/*Eclipse˵�ˣ�Ҫ��Getter*/
	public int getNumPrime() {
		return numPrime;
	}

	/*Eclipse˵�ˣ�Ҫ��Setter*/
	public void setNumPrime(int numPrime) {
		this.numPrime = numPrime;
	}

}
  
