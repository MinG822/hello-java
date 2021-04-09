package cooperation;
/*
cooperation 패키지의 Bus 클래스
객체 간 협력을 알아본다
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
		System.out.println("버스 " + this.busNumber + "번의 승객은 "+ this.passengerCount+"명이고, 수입은"+ revenue+"입니다");
	}

}
