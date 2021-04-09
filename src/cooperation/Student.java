package cooperation;
/*
 cooperation 패키지의 Student 클래스
 객체 간 협력을 알아본다
 */
public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(10000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showLeftOvers() {
		System.out.println(studentName + "님의 남은 돈은 "+ money + "입니다");
	}
	
}
