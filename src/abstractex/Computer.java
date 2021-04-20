package abstractex;
/*
 abstractex 패키지의 추상클래스 Computer
 
 추상클래스(abstract class)는 구체적이지 않은 클래스 <-> concrete class
 추상클래스는 추상 메서드를 포함함
 추상 메서드는 구현부가 없이 선언부만 있음
 메서드 설계만 만들어두는 것
 
 추상클래스와 추상메서드를 만들땐 예약어 abstract 를 사용
 
 추상 클래스에서도 하위 클래스에서 공통으로 사용할 코드는 메서드를 구현한다
 하위클래스에 따라 구현 코드가 달라지는 경우는 추상메서드로 남겨둔다
 */
public abstract class Computer {
	public abstract void display();
	public abstract void typing();
}
