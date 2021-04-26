package interfaceex;
/*
 * interfaceex ��Ű���� Calculator Ŭ����
 * �������̽� Calc �� �����Ѵ�
 * 
 * �������̽��� ������ ���� implements ���� ����ؾ� �Ѵ�
 * �̶� �������̽��� �߻� �޼��带 ��� �����ϰų�
 * �Ǵ� Ŭ������ �߻� Ŭ������ �����ؾ��Ѵ� 
 * 
 * Calc Ÿ������ ������ ������ Calculator �ν��Ͻ��� �����ϸ� showInfo �޼��带 ����� �� ����
 */
public class Calculator implements Calc {
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public int subtract(int n1, int n2) {
		return n1 - n2;
	}
	
	public int times(int n1, int n2) {
		return n1 * n2;
	}
	
	public int divide(int n1, int n2) {
		if (n2 != 0) return n1/n2;
		else return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� ������ Calculator Ŭ����");
	}
	
	public String description() {
		return "���� ���� Ŭ����";
	}

}
