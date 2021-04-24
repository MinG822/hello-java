package object;
/*
 * object 패키지의 EqualsTest 클래스
 * Object 클래스의 기본메서드 중 equals() 메서드에 대해 알아본다
 * 
 * equals 메서드는 두 인스턴스의 주소 값을 비고해 boolean 값을 반환한다
 * 주소 값이 같다면 같은 인스턴스인데, 다른 주소값을 가질 때도 같은 인스턴스라고 정의할 수 있음
 * 물리적 동일성이 아니라 논리적 동일성을 구현할 때도 equals 메서드를 재정의하여 사용한다 
 * 예를들어 객체를 복사하면 같은 메모리 위치를 참조하기 때문에 equals 메서드의 반환값은 true이다 (물리적으로 동일).
 * 그런데 문자열타입 변수 두 개가 같은 문자열이라면 equals 메서드로 비교할 때 true 로 값이 나온다 (논리적으로 동일).
 * 
 * 한편 == 기호는 equals 와 달리 두 객체의 메모리 주소 값을 비교한다
 * 
 * 학생 번호, 이름을 멤버변수로 가진 학생 객체를 만들어 번호와 이름이 같다면 같은 학생임을 나타내도록 equals 메서드를 재정의해본다
 * 
 * 
 */

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student targetStudent = (Student)obj;
			if (this.studentId != targetStudent.studentId) {
				return false;
			}
			else if (this.studentName != targetStudent.studentName) {
				return false;
			} 
			else return true;
		} 
		else return false;
	}
}

public class EqualsTest {
	public static void main(String args[]) {
		String aString = new String("abc");
		String bString = aString;
		String cString = new String("abc");
		
		System.out.println(aString.equals(bString));
		System.out.println(aString == bString);
		
		System.out.println(aString.equals(cString));
		System.out.println(aString == cString);
		
		Student studentA = new Student(123, "a");
		Student studentB = new Student(123, "a");
		
		System.out.println(studentA.equals(studentB));
		System.out.println(studentA == studentB);
	}
}
