package array;
import java.util.ArrayList;
/*
 array ��Ű���� ArrayList Ŭ����
 ArrayList �� ���� �˾ƺ���
 
 ArrayList<E> �迭 �̸� = new ArrayList<E>();
 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); // �ʱ�ȭ�� ���� ������ null point ������ �߻���

		for(int i = 0; i < 5; i++) {
			library.add(new Book("book"+i, "author"+i));
		}
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i); // book �� library.get(i) �� �翬�� ���� id �� ����.
			book.showBookInfo();
//			System.out.println(book);
		}
		
		System.out.println(library.size());
		Book removedBook = library.remove(0);
		removedBook.showBookInfo();
		System.out.println(library.size());
		System.out.println(library.isEmpty());
		
		for (int i = 0; i < library.size();) { // ���ǽĿ��� library.size() �� �Ź� �޶����� �� ����
			System.out.println("library has " + library.size()+" and current is "+i);
			// library.remove(i);
			library.remove(0);
		}
		
		System.out.println(library.size());
		System.out.println(library.isEmpty());
	}

}
