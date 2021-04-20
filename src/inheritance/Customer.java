package inheritance;
/*
 inheritance 패키지의 Customer 클래스
 
 protected 멤버변수를 사용하면 외부 클래스에서는 사용할 수 없지만 하위 클래스에서는 사용할 수 있음
 
 상속은 IS-A 관계 에서 사용하는 것이 효율적
 상속을 하면 하위클래스가 상위 클래스형에 종속되기 때문에 이질적인 클래스 간에는 사용하지 않기
 HAS-A 관계, 한 클래스가 다른 클래스를 소유한 관계에서도 상속대신 멤벼변수로 사용하는 것이 적절하다
 상속은 일반적인 클래스 -> 구체적인(확장되는) 클래스 관계에서 구현하는 것이 맞다
 */
public class Customer {
	protected int customerId; 
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "Silver";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price* bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";
	}
	
	public void showHash() {
		System.out.println(this.hashCode());
	}
}
