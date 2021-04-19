package inheritance;
/*
inheritance 패키지의 VIP Customer 클래스

Customer 클래스를 상속받고 VIP Customer 에게만 필요한 추가 속성과 기능을 구현한다.

상속은 extends 예약어를 사용한다.

VIPCustomer 생성자가 호출되기 전에 Customer() 생성자가 먼저 호출된다.

하위 클래스의 인스턴스가 생성될 때 
상위 클래스의 생성자가 호출되어 (컴파일러가 자동으로 super()를 추가한다) 
상위 클래스의 멤버 변수(private 포함)가 메모리에 생성되고나서
하위 클래스의 멤버 변수가 메모리에 생성된다.
그래서 하위 클래스에서도 이 값들을 public 과 protected 인 경우 모두 사용할 수 있음 

super 예약어는 하위 클래스에서 상위 클래스로 접근할 때 사용함
super 는 상위클래스의 주소(참조 값)를 가지고 있음

메서드 오버라이딩은 상위 클래스에서 정의한 메서드를 하위 클래스에서 재정의
오버라이딩을 하기 위해서 반환형, 메서드이름, 매개변수 개수, 매개변수 자료형이 반드시 같아야한다. 그렇지 않으면 다른 메서드로 인식
@override 를 사용하지 않아도 에러가 나지 않는다

*/
public class VIPCustomer extends Customer {
	private int agentId;
	double saleRatio;
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName); // 컴파일러가 ㅈ동으로 추가하는 코드, 상위클래스의 Customer() 가 호출됨
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + ". 담당 상담원 아이디는" + agentId + "입니다";
	}
	
	public void showSuperHash() {
		System.out.println(super.hashCode());
	}
	
}
