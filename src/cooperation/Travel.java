package cooperation;
/*
cooperation 패키지의 Travel 클래스
객체 간 협력을 알아본다
*/
public class Travel {

	public static void main(String[] args) {
		Student littleMon = new Student("littleMon", 5000);
		Student bigMon = new Student("bigMon", 10000);
		
		Bus bus100 = new Bus(100);
		littleMon.takeBus(bus100);
		littleMon.showLeftOvers();
		bus100.showCurrentState();
		
		Subway subwayGreen = new Subway("2호선");
		bigMon.takeSubway(subwayGreen);
		bigMon.showLeftOvers();
		subwayGreen.showCurrentState();

	}

}
