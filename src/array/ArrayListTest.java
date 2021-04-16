package array;
import java.util.ArrayList;
/*
 array 패키지의 ArrayList 클래스
 ArrayList 에 대해 알아본다
 
 ArrayList<E> 배열 이름 = new ArrayList<E>();
 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); // 초기화를 하지 않으면 null point 에러가 발생함

		for(int i = 0; i < 5; i++) {
			library.add(new Book("book"+i, "author"+i));
		}
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i); // book 과 library.get(i) 는 당연히 같은 id 를 가짐.
			book.showBookInfo();
//			System.out.println(book);
		}
		
		System.out.println(library.size());
		Book removedBook = library.remove(0);
		removedBook.showBookInfo();
		System.out.println(library.size());
		System.out.println(library.isEmpty());
		
		for (int i = 0; i < library.size();) { // 조건식에서 library.size() 가 매번 달라지는 거 주의
			System.out.println("library has " + library.size()+" and current is "+i);
			// library.remove(i);
			library.remove(0);
		}
		
		System.out.println(library.size());
		System.out.println(library.isEmpty());
	}

}
