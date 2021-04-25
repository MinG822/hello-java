package object;
/*
 * object ��Ű���� CloneTest Ŭ����
 * object �޼��� �� clone �޼��忡 ���ؼ� �˾ƺ���
 * 
 * ��ü�� ���纻�� ����ϰų� �� �� clone �޼��带 ����� �� �ִ�
 * clone �޼���� ��ü�� ������ �ٸ� ��ü�� ��ȯ���ش�
 * 
 * clone �޼��带 ����ϱ� ����
 * ��ü�� �����ص� �ȴٴ� Cloneable �������̽��� �Բ� ����
 * Cloneable �������̽��� �Բ� ����Ǿ����� ������ clone�޼��带 �������̵��ص�
 * ����� �� ���� (CloneNotSupprotedException �߻�)
 */

class CloneStudent extends Student implements Cloneable {
	public CloneStudent(int studentId, String studentName) {
		super(studentId, studentName);
	}
	// clone �޼��忡 ���� ����ó��
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneStudent originalStudent = new CloneStudent(123, "a");
		CloneStudent clonedStudent = (CloneStudent)originalStudent.clone();
		
		System.out.println(originalStudent);
		System.out.println(clonedStudent);
		System.out.println(System.identityHashCode(originalStudent));
		System.out.println(System.identityHashCode(clonedStudent));
		
//		Student studentA = new Student(123, "a");
//		Student studentB = (Student)studentA.clone(); 
	}
}
