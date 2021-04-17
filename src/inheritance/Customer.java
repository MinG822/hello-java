package inheritance;
/*
 inheritance ��Ű���� Customer Ŭ����
 
 protected ��������� ����ϸ� �ܺ� Ŭ���������� ����� �� ������ ���� Ŭ���������� ����� �� ����
 */
public class Customer {
	protected int customerId; 
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
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
		return customerName + "���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�";
	}
}
