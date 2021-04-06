package classpart;
/*
classpart 패키지의 StudentTest 클래스
Student 클래스를 테스트하기 위한 클래스

같은 패키지의 클래스를 사용하기 때문에 import 가 필요없다
*/
public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "먼지";
		
		System.out.println(studentKim.studentName);
		studentKim.setStudentName("먼지몬");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}

}
