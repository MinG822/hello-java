package cooperation;
/*
cooperation 패키지의 Subway 클래스
객체 간 협력을 알아본다
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
		System.out.println(this.lineNumber + "의 승객은 "+ this.passengerCount+"명이고, 수입은"+ revenue+"입니다");
	}
}
