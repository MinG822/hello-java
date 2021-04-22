package gamelevel;

public class BeginerLevel extends PlayerLevel {
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	
	public void jump() {
		System.out.println("점프 할 수 없습니다.");
	}
	
	public void turn() {
		System.out.println("턴 할 수 없습니다");
	}
	
	public void showLevelMessage() {
		System.out.println("초보자 레벨입니다");
	}
}
