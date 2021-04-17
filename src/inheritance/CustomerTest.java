package inheritance;
/*
inheritance 패키지의 CustomerTest 클래스
Customer 를 테스트한다.
*/
public class CustomerTest {
	
	public static void main(String[] args) {
		Customer mong = new Customer();
		mong.setCustomerId(1010);
		mong.setCustomerName("mong");
		mong.bonusPoint = 1000; // 보너스 포인트를 protected 로 설정해야하지 않나
		System.out.println(mong.showCustomerInfo());
		
		
		VIPCustomer vmong = new VIPCustomer();
		vmong.setCustomerId(1020);
		vmong.setCustomerName("vip mong");
		vmong.bonusPoint = 10000;
		System.out.println(vmong.showCustomerInfo());
		
	}

}
