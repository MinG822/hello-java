package template;
/*
 template 패키지의 Car 클래스
 추상클래스를 활용한 템플릿 메서드를 알아본다
 
 템플릿 메서드 run
 final 예약어를 사용한다
 실행 순서와 시나리오를 정의하는 역할
 모든 하위 클래스에서 공통으로 사용할 수 있으며
 하위클래스에서는 템플릿 메서드를 재정의할 수 없다.
 
 템플릿 메서드는 하나의 코드가 다양한 자료형을 대상으로 동작하는 다형성을 활용할 수 있음
 
 */
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	// 템플릿 메서드 run
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
