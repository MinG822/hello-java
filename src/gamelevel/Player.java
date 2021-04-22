package gamelevel;
/*
 * gamelevel 패키지의 Player 클래스
 * 템플릿 메서드를 응용해본다
 */
public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
