package object;
/*
 * object 패키지의 ToStringEx 클래스
 * Object 클래스의 기본 메서드인 toString 메서드에 대해서 알아본다
 * 
 * 객체 정보를 문자열로 바꾸어줌
 * Object 클래스를 상속받는 모든 클래스는 toString()을 재정의 할 수 있음
 * Object 클래스는 모든 자바 클래스의 최상위 클래스이다
 * 클래스를 선언하면 컴파일 과정에서 자동으로 extends Object 구문이 쓰임
 * 
 * String, Integer 도 모두 Object 를 상속받았으며
 * toString 메서드를 재정의하고 있다
 * 
 * 재정의하지 않은 상태에서 toString()을 호출하면 클래스이름@해시코드 값을 반환한다
 * String 클래스에서 재정의한 toString() 메서드는 대입한 문자열을 반환한다
 * Integer 클래스에서 재정의한 toString() 메서드는 대입한 정수를 문자열 타입으로 반환한다
 * 
 * toString() 메서드를 재정의하면 원하는 값으로 객체정보를 표현할 수 있다
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
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		String str = new String("test");
		System.out.println(str.toString()); // == System.out.println(str);
		Integer i1 = Integer.valueOf(100); // new Integer 는 deprecated 되었음
		System.out.println(i1.toString());
	}

}
