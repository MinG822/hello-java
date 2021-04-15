package array;
/*
array 패키지의 ArrayCopy 클래스
객체 배열을 복사해본다

얕은 복사
System.arraycopy(복사할 배열, 복사할 첫 위치, 붙여넣을 배열, 붙여넣을 첫 위치, 복사할 요소 개수)
객체의 주소 값만 복사함

깊은 복사
built in 함수가 따로 없다니..!

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
		
		// !! 이미 같은 주소인 객체가 들어있어서 소용없었다 !!
		
		Book[] bookShelf3 = new Book[3];
		
		for(int i = 0; i < bookShelf3.length; i++) {
			
			// !! 새로운 객체를 생성해주지 않고 바로 값을 대입하면 안된다 !! 
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
