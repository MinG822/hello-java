package abstractex;
/*
abstractex ��Ű���� �׽�ƮŬ���� ComputerTest

�߻� Ŭ������ �ν��Ͻ��� ������ �� ����.
������ �ڵ尡 ���� ������ �� �ִ� ������ ����
������ ����ȯ�� ����
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
