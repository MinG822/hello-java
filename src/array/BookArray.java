package array;
/*
 array ��Ű���� BookArray Ŭ����
 ��ü �迭�� ���� �˾ƺ���
 
 ��ü �迭�� �ʱⰪ�� null 
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
