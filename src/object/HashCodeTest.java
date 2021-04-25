package object;

import java.util.HashSet;
/*
 * object 패키지의 HashCodeTest 클래스
 * object 클래스의 메서드 중 hashCode() 메서드를 알아본다
 * 
 * hash 는 정보를 저장하거나 검색할 때 사용하는 자료구조
 * hash함수(객체의 특정정보) = 객체저장위치
 * 객체 저장위치를 빠르게 검색할 수 있다는게 장점
 * 자바에서 인스턴스를 힙 메모리에 생성해 관리할 때 해시 알고리즘을 사용한다
 * 
 * 두 인스턴스가 논리적으로 같도록 equals 를 정의했다면 부작용을 피하기 위해 hashCode 메서드를 재정의하는 게 좋다
 * 예를 들어 equals true 인 두 인스턴스를 HashSet 에 넣었을 땐 두 인스턴스를 서로 다른 객체로 인식하지만
 * hashCode 메서드 반환값이 일치하도록 만들어두면 두 인스턴스를 같은 객체로 인식한다.
 * 아래는 hashCode 메서드에 대한 자바 코멘트이다
 * hashCode : Indicates whether some other object is "equal to" this one.
 * 
 * 주의) 그렇지만 실제 두 인스턴스의 물리적 위치는 다른데, == 로 비교해보면 false 로 나오는 것에서 확인할 수 있고
 * System.identityHashCode 로도 확인할 수 있다
 */

class HashStudent extends Student {
	public HashStudent(int studentId, String studentName) {
		super(studentId, studentName);
	}
	
	public int hashCode() {
		return studentId;
	}
}

public class HashCodeTest {

	public static void main(String[] args) {
		HashSet<Student> hsset = new HashSet<Student>();
		
		Student studentA = new Student(123, "a");
		Student studentB = new Student(123, "a");
		Student studentC = studentA;
		
		System.out.println(studentA.equals(studentB));
		System.out.println(studentA == studentB);
		
		hsset.add(studentA);
		hsset.add(studentB);
		System.out.println(hsset.size());
		hsset.add(studentC);
		System.out.println(hsset.size());
		
		HashStudent studentD = new HashStudent(123, "a");
		HashStudent studentE = new HashStudent(123, "a");
		
		System.out.println(studentD.equals(studentE));
		System.out.println(studentD == studentE);
		hsset.add(studentD);
		hsset.add(studentE);
		System.out.println(hsset.size());
		
		System.out.println(System.identityHashCode(studentE));
		System.out.println(System.identityHashCode(studentD));
	}

}
