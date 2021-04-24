package object;
/*
 * object ��Ű���� ToStringEx Ŭ����
 * Object Ŭ������ �⺻ �޼����� toString �޼��忡 ���ؼ� �˾ƺ���
 * 
 * ��ü ������ ���ڿ��� �ٲپ���
 * Object Ŭ������ ��ӹ޴� ��� Ŭ������ toString()�� ������ �� �� ����
 * Object Ŭ������ ��� �ڹ� Ŭ������ �ֻ��� Ŭ�����̴�
 * Ŭ������ �����ϸ� ������ �������� �ڵ����� extends Object ������ ����
 * 
 * String, Integer �� ��� Object �� ��ӹ޾�����
 * toString �޼��带 �������ϰ� �ִ�
 * 
 * ���������� ���� ���¿��� toString()�� ȣ���ϸ� Ŭ�����̸�@�ؽ��ڵ� ���� ��ȯ�Ѵ�
 * String Ŭ�������� �������� toString() �޼���� ������ ���ڿ��� ��ȯ�Ѵ�
 * Integer Ŭ�������� �������� toString() �޼���� ������ ������ ���ڿ� Ÿ������ ��ȯ�Ѵ�
 * 
 * toString() �޼��带 �������ϸ� ���ϴ� ������ ��ü������ ǥ���� �� �ִ�
 * 
 */

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "����");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		String str = new String("test");
		System.out.println(str.toString()); // == System.out.println(str);
		Integer i1 = Integer.valueOf(100); // new Integer �� deprecated �Ǿ���
		System.out.println(i1.toString());
	}

}
