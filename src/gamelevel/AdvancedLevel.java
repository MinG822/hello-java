package gamelevel;

public class AdvancedLevel extends PlayerLevel {
	public void run() {
		System.out.println("빨리 달립니다.");
	}
	
	public void jump() {
		System.out.println("점프 합니다.");
	}
	
	public void turn() {
		System.out.println("턴 할 수 없습니다");
	}
	
	public void showLevelMessage() {
		System.out.println("중급자 레벨입니다");
	}
}
