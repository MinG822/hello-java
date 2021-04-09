package staticex;
/*
staticex 패키지의 StudentTest 클래스
static 변수에 대해 알아본다

클래스 변수는 인스턴스 생성과는 별개이므로 인스턴스보다 먼저 생성되어
인스턴스가 아닌 클래스 이름으로도 참조해 사용할 수 있음
*/
public class StudentTest2 {

	public static void main(String[] args) {
		System.out.println(Student2.getSerialNum());
		Student2 mon = new Student2("mon");
		System.out.println(mon.getStudentId());
		System.out.println(Student2.getSerialNum());
		Student2.setSerialNum(3000);
		System.out.println(Student2.getSerialNum());
		Student2 anotherMon = new Student2("mon2");
		System.out.println(anotherMon.getStudentId());
		System.out.println(Student2.getSerialNum());
	}

}
