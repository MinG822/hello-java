package hiding.studenttest;

import hiding.student.Student;

public class studentTest {

	public static void main(String args[]) {
		Student mon = new Student();
//		mon.studentName = "monjimon"; // private 변수 : field studentName is not visible error
		
		System.out.println(mon.getStudentName()); // null 
		mon.setStudentName("mon");
		System.out.println(mon.getStudentName()); // null 
//		mon.address = "default 변수"; // default 변수 : Student.address is not visible error
		mon.studentId = 3; // public 변수 : 외부에서 접근 가능
//		mon.grade = 2; // protected 변수 : 같은 패키지 내부가 아니라 not visible error 발생
	}
}
