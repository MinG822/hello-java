package inheritance;
/*
inheritance ��Ű���� CustomerTest Ŭ����
Customer �� �׽�Ʈ�Ѵ�.
*/
public class CustomerTest {
	
	public static void main(String[] args) {
		Customer mong = new Customer();
		mong.setCustomerId(1010);
		mong.setCustomerName("mong");
		mong.bonusPoint = 1000; // ���ʽ� ����Ʈ�� protected �� �����ؾ����� �ʳ�
		System.out.println(mong.showCustomerInfo());
		
		
		VIPCustomer vmong = new VIPCustomer();
		vmong.setCustomerId(1020);
		vmong.setCustomerName("vip mong");
		vmong.bonusPoint = 10000;
		System.out.println(vmong.showCustomerInfo());
		
	}

}
