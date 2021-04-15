package array;
/*
array ��Ű���� ArrayCopy Ŭ����
��ü �迭�� �����غ���

���� ����
System.arraycopy(������ �迭, ������ ù ��ġ, �ٿ����� �迭, �ٿ����� ù ��ġ, ������ ��� ����)
��ü�� �ּ� ���� ������

���� ����
built in �Լ��� ���� ���ٴ�..!

*/
public class ObjectArrayCopy {

	public static void main(String[] args) {
		Book[] bookShelf1 = new Book[3];
		Book[] bookShelf2 = new Book[3];
		
		for(int i = 0; i < bookShelf1.length; i++) {
			bookShelf1[i] = new Book("book"+i, "author"+i);
		}
		System.arraycopy(bookShelf1, 0, bookShelf2, 0, bookShelf2.length);
		
		for(int i = 0; i < bookShelf1.length; i++) {
			bookShelf2[i].showBookInfo();
		}
		
		System.out.println("=========bookshelf1============");
		bookShelf1[0].setAuthor("newAuthor!!");
		bookShelf1[0].showBookInfo();
		System.out.println("=========bookshelf2============");
		bookShelf2[0].showBookInfo();
		
		for(int i = 0; i < bookShelf2.length; i++) {
			bookShelf2[i].setAuthor(bookShelf1[i].getAuthor());
			bookShelf2[i].setBookName(bookShelf1[i].getBookName());
		}
		
		System.out.println("=========bookshelf1============");
		bookShelf1[0].setAuthor("newnewAuthor!!");
		bookShelf1[0].showBookInfo();
		System.out.println("=========bookshelf2============");
		bookShelf2[0].showBookInfo();
		
		// !! �̹� ���� �ּ��� ��ü�� ����־ �ҿ������ !!
		
		Book[] bookShelf3 = new Book[3];
		
		for(int i = 0; i < bookShelf3.length; i++) {
			
			// !! ���ο� ��ü�� ���������� �ʰ� �ٷ� ���� �����ϸ� �ȵȴ� !! 
//			bookShelf3[i].setAuthor(bookShelf2[i].getAuthor());
//			bookShelf3[i].setBookName(bookShelf2[i].getBookName());
			
			bookShelf3[i] = new Book(bookShelf2[i].getBookName(), bookShelf2[i].getAuthor());
		}
		
		System.out.println("=========bookshelf2============");
		bookShelf2[0].setAuthor("realLastNewAuthor!!");
		bookShelf2[0].showBookInfo();
		System.out.println("=========bookshelf3============");
		bookShelf3[0].showBookInfo();
	}

}
