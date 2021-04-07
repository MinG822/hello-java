package classpart;
/*
classpart 패키지의 StudentTest 클래스
Student 클래스를 테스트하기 위한 클래스

같은 패키지의 클래스를 사용하기 때문에 import 가 필요없다

new 예약어로 생성자를 호출해 대입하면 클래스를 실제 사용할 수 있도록 메모리 공간(힙 메모리)을 할당받는다는 뜻
인스턴스를 가르키는 클래스형 변수에 실제 대입 되는 것을 인스턴스라고 하며, 변수를 참조변수라고 함

참조변수에 도트연산자를 사용해 인스턴스의 멤버변수와 메서드를 참조해 사용할 수 있음
인스턴스가 생성되면 힙메모리에 해당 인스턴스의 공간이 생긴다.
멤버변수는 인스턴스의 변수이기 때문에 인스턴스 변수라고도 불림

아래 main 함수 스택메모리의 studentKim 변수는 힙메모리에 저장된 메모리를 가리키게된다
즉 studentKim 변수에 대입된 것은 힙메모리의 해당 인스턴스의 주소

참조변수를 출력하면 클래스이름@주소값(해시코드) 의 형태
해시코드는 자바가상머신에서 객체가 생성되었을 때 할당하는 가상 주소 값
이를 통해 참조변수에 대입된 인스턴스를 참조할 수 있음, 그래서 주소값을 참조값이라고도 함

*/
public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "먼지";
		
		System.out.println(studentKim.studentName);
		studentKim.setStudentName("먼지몬");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
		
		Student studentMon = new Student();
		studentMon.studentName = "몬";
		
		System.out.println(studentKim);
		System.out.println(studentMon);
	}

}
