package template;
/*
 template ��Ű���� Car Ŭ����
 �߻�Ŭ������ Ȱ���� ���ø� �޼��带 �˾ƺ���
 
 ���ø� �޼��� run
 final ���� ����Ѵ�
 ���� ������ �ó������� �����ϴ� ����
 ��� ���� Ŭ�������� �������� ����� �� ������
 ����Ŭ���������� ���ø� �޼��带 �������� �� ����.
 
 ���ø� �޼���� �ϳ��� �ڵ尡 �پ��� �ڷ����� ������� �����ϴ� �������� Ȱ���� �� ����
 
 */
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	// ���ø� �޼��� run
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
