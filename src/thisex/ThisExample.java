package thisex;
/*
 thisex 패키지의 ThisExample 클래스
 this 에 대해서 알아본다
 
 this 는 생성된 인스턴스 자신을 가리키는 역할
 this.year = year; 은 동적 메모리(힙 메모리)에 생성된 인스턴스의 year 변수 위치를 가리키고 , 그 변수의 위치에 매개변수 값을 대입함 
 클래스의 생성자에서 다른 생성자를 호출하는 함수로 this 를 사용할 수 있다.
 */
class BirthDay {
	// 한 파일 내에 여러 클래스가 존재 할 수 있지만 public 은 자바 파일명과 같을 때 사용할 수 있다
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay); // 참조변수 출력 -> 클래스이름@메모리주소
		bDay.printThis(); // this 출력 메서드 호출 -> 클래스이름@메모리주소
	}
}
