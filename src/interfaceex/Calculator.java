package interfaceex;
/*
 * interfaceex 패키지의 Calculator 클래스
 * 인터페이스 Calc 를 구현한다
 * 
 * 인터페이스를 구현할 때는 implements 예약어를 사용해야 한다
 * 이때 인터페이스의 추상 메서드를 모두 구현하거나
 * 또는 클래스를 추상 클래스로 선언해야한다 
 * 
 * Calc 타입으로 선언한 변수에 Calculator 인스턴스를 대입하면 showInfo 메서드를 사용할 수 없다
 */
public class Calculator implements Calc {
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public int subtract(int n1, int n2) {
		return n1 - n2;
	}
	
	public int times(int n1, int n2) {
		return n1 * n2;
	}
	
	public int divide(int n1, int n2) {
		if (n2 != 0) return n1/n2;
		else return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현한 Calculator 클래스");
	}
	
	public String description() {
		return "정수 계산기 클래스";
	}

}
