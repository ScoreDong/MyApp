package main.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import main.java.NewRoot;

class TestNewRoot {
	@Test
	@DisplayName("�������")
	void test() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();  
        System.setOut(new PrintStream(outContent));  //�����ж�ȡ�˿���̨��������ڶ��Բ���ֻ��Ҫ�жϿ���̨����������ǵ�Ԥ���Ƿ�һ�¼��ɡ�
        String[] testInt = {"16"};
        NewRoot.main(testInt);
		assertEquals("The square root of 16 is 4.0\n",outContent.toString());
	}
	
	@Nested
	@DisplayName("�쳣����")
	class hasException{
		@Nested
		@DisplayName("����Ϊ�ջ������ַ�")
		class errorTest{
	        @Test
	        @DisplayName("����Ϊ��")
	        void isEmpty() {
	        	String[] testInt = {};
	        	
	            IllegalArgumentException exception = assertThrows(java.lang.IllegalArgumentException.class, () -> {
	            	NewRoot.main(testInt);
	            });
	            assertEquals("������һ������", exception.getMessage());
	        }
	        @Test
	        @DisplayName("�����ַ�")
	        void isChar() {
	        	String[] testInt = {"A"};
	        	
	        	NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
	            	NewRoot.main(testInt);
	            });
	            assertEquals("���������Ͳ���ת����", exception.getMessage());
	        }
		}
 
        @Test
        @DisplayName("���븺��")
        void throwsExceptionWhenPopped() {
        	String[] testInt = {"-1"};
        	ArithmeticException exception = assertThrows(java.lang.ArithmeticException.class, () -> {
        		NewRoot.main(testInt);
        		});
        assertEquals("����������", exception.getMessage());
    }
    }
}