package inheritance;
/*
inheritance ��Ű���� VIP Customer Ŭ����

Customer Ŭ������ ��ӹް� VIP Customer ���Ը� �ʿ��� �߰� �Ӽ��� ����� �����Ѵ�.
����� extends ���� ����Ѵ�.

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