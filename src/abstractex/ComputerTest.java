package abstractex;
/*
abstractex 패키지의 테스트클래스 ComputerTest

추상 클래스는 인스턴스를 생성할 수 없다.
구현된 코드가 없어 수행할 수 있는 내용이 없다
하지만 형변환은 가능
*/
public class ComputerTest {
	public static void main(String[] args) {
//		Computer com = new Computer();
//		Computer com = new NoteBook();
		Computer com = new Desktop();
		Computer mycom = new MyNoteBook();
		com.display();
		com.typing();
		mycom.display();
		mycom.typing();
	}
}
