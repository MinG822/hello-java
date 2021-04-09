package staticex;
/*
staticex 패키지의 StudentTest 클래스
static 변수에 대해 알아본다

클래스 변수는 인스턴스 생성과는 별개이므로 인스턴스보다 먼저 생성되어
인스턴스가 아닌 클래스 이름으로도 참조해 사용할 수 있음
*/
public class StudentTest {

	public static void main(String[] args) {
		System.out.println(Student.serialNum);
		Student mon = new Student("mon");
		System.out.println(mon.getStudentId());
		System.out.println(Student.serialNum);
		Student anotherMon = new Student("mon2");
		System.out.println(anotherMon.getStudentId());
		System.out.println(Student.serialNum);
	}

}
