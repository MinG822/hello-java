package interfaceex;
/*
 * interfaceex 패키지의 Calc 클래스
 * 인터페이스에 대해 알아본다
 * 
 * 인터페이스는 클래스의 제공 기능을 선언하는 역할 (명세 역할)
 * 인터페이스을 사용해 확장성 있는 프로그램을 만들 수 있음
 * 추상메서드와 상수로만 이루어짐
 * 
 * 인터페이스에서 선언한 변수와 메서드는 컴파일 과정에서 각각 상수와 추상 메서드로 변환됨
 * 
 * 디폴트 메서드는 기본으로 제공하는 메서드로 default 예약어를 사용한다
 * 이미 구현되어있으므로 클래스에서 구현할 필요가 없다
 * 재정의는 할 수 있다
 * 클래스의 인스턴스의 디폴트 메서드를 호출하면 재정의된 메서드가 호출되며,
 * 인터페이스 형으로 대입한 클래스의 인스턴스의 경우에도 마찬가지이다. (가상메서드)
 * 
 * 정적 메서드는 static 예약어를 사용해 선언하며 클래스 생성과 무관하게 사용할 수 있음
 * 정적 메서드를 사용할 때 인터페이스 이름으로 직접 참조
 * 인스턴스로나 구현 클래스로는 참조할 수 없다
 * 
 * private 메서드는 구현 클래스에서 사용하거나 재정의할 수 없다
 * private 와 static 예약어를 함께 사용해 메서드를 구현할 수 있다
 */

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default String description() {
		return getOwner() + " 정수 계산기 인터페이스";
	}
	
	private String getOwner() {
		return "mong";
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
	
	static double[] getCircleAreas(int[] arr) {
		double[] circleAreas = new double[arr.length];
		for(int i = 0; i < arr.length ; i++) {
			circleAreas[i] = getCircleArea(arr[i]);
		}
		return circleAreas;
	}
	
	private static double getCircleArea(int radius) {
		return (radius*radius) * PI;
	}
}
