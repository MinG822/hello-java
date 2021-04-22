package gamelevel;

public class SuperLevel extends PlayerLevel {
	public void run() {
		System.out.println("빨리 달립니다.");
	}
	
	public void jump() {
		System.out.println("점프 합니다.");
	}
	
	public void turn() {
		System.out.println("한바퀴 돕니다");
	}
	
	public void showLevelMessage() {
		System.out.println("고급자 레벨입니다");
	}
}
