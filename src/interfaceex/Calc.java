package interfaceex;
/*
 * interfaceex ��Ű���� Calc Ŭ����
 * �������̽��� ���� �˾ƺ���
 * 
 * �������̽��� Ŭ������ ���� ����� �����ϴ� ���� (�� ����)
 * �������̽��� ����� Ȯ�强 �ִ� ���α׷��� ���� �� ����
 * �߻�޼���� ����θ� �̷����
 * 
 * �������̽����� ������ ������ �޼���� ������ �������� ���� ����� �߻� �޼���� ��ȯ��
 * 
 * ����Ʈ �޼���� �⺻���� �����ϴ� �޼���� default ���� ����Ѵ�
 * �̹� �����Ǿ������Ƿ� Ŭ�������� ������ �ʿ䰡 ����
 * �����Ǵ� �� �� �ִ�
 * Ŭ������ �ν��Ͻ��� ����Ʈ �޼��带 ȣ���ϸ� �����ǵ� �޼��尡 ȣ��Ǹ�,
 * �������̽� ������ ������ Ŭ������ �ν��Ͻ��� ��쿡�� ���������̴�. (����޼���)
 * 
 * ���� �޼���� static ���� ����� �����ϸ� Ŭ���� ������ �����ϰ� ����� �� ����
 * ���� �޼��带 ����� �� �������̽� �̸����� ���� ����
 * �ν��Ͻ��γ� ���� Ŭ�����δ� ������ �� ����
 * 
 * private �޼���� ���� Ŭ�������� ����ϰų� �������� �� ����
 * private �� static ���� �Բ� ����� �޼��带 ������ �� �ִ�
 */

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default String description() {
		return getOwner() + " ���� ���� �������̽�";
	}
	
	private String getOwner() {
		return "mong";
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
	
	static double[] getCircleAreas(int[] arr) {
		double[] circleAreas = new double[arr.length];
		for(int i = 0; i < arr.length ; i++) {
			circleAreas[i] = getCircleArea(arr[i]);
		}
		return circleAreas;
	}
	
	private static double getCircleArea(int radius) {
		return (radius*radius) * PI;
	}
}
