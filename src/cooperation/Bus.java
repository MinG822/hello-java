package cooperation;
/*
cooperation ��Ű���� Bus Ŭ����
��ü �� ������ �˾ƺ���
*/
public class Bus {
	int revenue;
	int passengerCount;
	int busNumber;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int fare) {
		this.revenue += fare;
		this.passengerCount += 1;
	}
	
	public void showCurrentState() {
		System.out.println("���� " + this.busNumber + "���� �°��� "+ this.passengerCount+"���̰�, ������"+ revenue+"�Դϴ�");
	}

}
