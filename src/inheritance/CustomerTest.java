package inheritance;
/*
inheritance ��Ű���� CustomerTest Ŭ����
Customer �� �׽�Ʈ�Ѵ�.

VIPCustomer �� showSuperHash �� showHash �� ������
���� Ŭ�������� super�� ���� ����Ŭ������ ������ ��
���޸𸮿��� ����Ŭ������ ���� �� ���� Ŭ������ �κ��� �����Ѵٴ� �� ��Ȯ�� �� ����.

����Ŭ������ �����ϸ� ����Ŭ���� ������ ������ ����
����Ŭ���� �����ڰ� ȣ��Ǳ� ���� ���� Ŭ���� �����ڰ� ȣ��Ǵ� �ͱ��� ������
������� ����Ŭ������ ��������� �޼��忡 ������ �� ���� �ȴ�.

*/
public class CustomerTest {
	
	public static void main(String[] args) {
		Customer mong = new Customer(1010, "mong");
		mong.bonusPoint = 1000; // ���ʽ� ����Ʈ�� protected �� �����ؾ����� �ʳ�
		System.out.println(mong.showCustomerInfo());
		
		
		VIPCustomer vmong = new VIPCustomer(1010, "vip mong", 1004);
		vmong.bonusPoint = 10000;
		System.out.println(vmong.showVIPInfo());
		
		mong.showHash();
		vmong.showSuperHash();
		vmong.showHash();
		
		Customer vvmong = new VIPCustomer(1011, "vvip mong", 1004); // ��ĳ����
		vvmong.showCustomerInfo();
//		vvmong.showSuperHash(); ������ �� ����
//		VIPCustomer mmong = new Customer(1011, "mmong"); ����Ŭ������ �����ϸ� ����Ŭ���� ������ ������ �� ����.
	}

}
