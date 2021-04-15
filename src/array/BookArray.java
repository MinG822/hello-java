package array;
/*
 array 패키지의 BookArray 클래스
 객체 배열에 대해 알아본다
 
 객체 배열은 초기값이 null 
 */
public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length ; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book("book"+i, "author"+i);
			library[i].showBookInfo();
			System.out.println(library[i]);
		}
		
	}
}
