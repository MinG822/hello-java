package cooperation;
/*
cooperation ��Ű���� Subway Ŭ����
��ü �� ������ �˾ƺ���
*/
public class Subway {
	String lineNumber;
	int passengerCount;
	int revenue;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int fare) {
		this.revenue += fare;
		this.passengerCount ++;
	}
	
	public void showCurrentState() {
		System.out.println(this.lineNumber + "�� �°��� "+ this.passengerCount+"���̰�, ������"+ revenue+"�Դϴ�");
	}
}
