package inheritance;
/*
inheritance ��Ű���� VIP Customer Ŭ����

Customer Ŭ������ ��ӹް� VIP Customer ���Ը� �ʿ��� �߰� �Ӽ��� ����� �����Ѵ�.

����� extends ���� ����Ѵ�.

VIPCustomer �����ڰ� ȣ��Ǳ� ���� Customer() �����ڰ� ���� ȣ��ȴ�.

���� Ŭ������ �ν��Ͻ��� ������ �� 
���� Ŭ������ �����ڰ� ȣ��Ǿ� (�����Ϸ��� �ڵ����� super()�� �߰��Ѵ�) 
���� Ŭ������ ��� ����(private ����)�� �޸𸮿� �����ǰ���
���� Ŭ������ ��� ������ �޸𸮿� �����ȴ�.
�׷��� ���� Ŭ���������� �� ������ public �� protected �� ��� ��� ����� �� ���� 

super ������ ���� Ŭ�������� ���� Ŭ������ ������ �� �����
super �� ����Ŭ������ �ּ�(���� ��)�� ������ ����

�޼��� �������̵��� ���� Ŭ�������� ������ �޼��带 ���� Ŭ�������� ������
�������̵��� �ϱ� ���ؼ� ��ȯ��, �޼����̸�, �Ű����� ����, �Ű����� �ڷ����� �ݵ�� ���ƾ��Ѵ�. �׷��� ������ �ٸ� �޼���� �ν�
@override �� ������� �ʾƵ� ������ ���� �ʴ´�

*/
public class VIPCustomer extends Customer {
	private int agentId;
	double saleRatio;
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName); // �����Ϸ��� �������� �߰��ϴ� �ڵ�, ����Ŭ������ Customer() �� ȣ���
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + ". ��� ���� ���̵��" + agentId + "�Դϴ�";
	}
	
	public void showSuperHash() {
		System.out.println(super.hashCode());
	}
	
}
