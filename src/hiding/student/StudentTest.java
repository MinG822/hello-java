package hiding.student;
/*
hiding.student 패키지의 StudentTest 클래스
정보 은닉에 대해 알아본다

private 로 선언된 변수를 외부 코드에서 사용하기 위해선 studentName 을 조작할 수 있는 public 메서드가 제공되어야함

정보은닉은 멤버변수에 대한 검증이 필요할 때 유용하다
지정해둔 세터를 통해서만 변수가 대입될 수 있다면 유효하지 않는 값이 멤버변수로 설정되는 것을 막을 수 있다 

*/
public class StudentTest {
	public static void main(String args[]) {
		Student mon = new Student();
//		mon.studentName = "monjimon"; // field studentName is not visible error
		
		System.out.println(mon.getStudentName()); // null 
		mon.setStudentName("mon");
		System.out.println(mon.getStudentName()); // null 
		mon.address = "default 변수";
	}
}
