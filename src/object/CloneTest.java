package object;
/*
 * object 패키지의 CloneTest 클래스
 * object 메서드 중 clone 메서드에 대해서 알아본다
 * 
 * 객체의 복사본을 사용하거나 할 때 clone 메서드를 사용할 수 있다
 * clone 메서드는 객체를 복사해 다른 객체를 반환해준다
 * 
 * clone 메서드를 사용하기 위해
 * 객체를 복제해도 된다는 Cloneable 인터페이스를 함께 선언
 * Cloneable 인터페이스가 함께 선언되어있지 않으면 clone메서드를 오버라이딩해도
 * 사용할 수 없다 (CloneNotSupprotedException 발생)
 */

class CloneStudent extends Student implements Cloneable {
	public CloneStudent(int studentId, String studentName) {
		super(studentId, studentName);
	}
	// clone 메서드에 대한 예외처리
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
