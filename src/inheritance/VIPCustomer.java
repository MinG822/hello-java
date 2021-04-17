package inheritance;
/*
inheritance 패키지의 VIP Customer 클래스

Customer 클래스를 상속받고 VIP Customer 에게만 필요한 추가 속성과 기능을 구현한다.
상속은 extends 예약어를 사용한다.

*/
public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentID;
	}
	
}
