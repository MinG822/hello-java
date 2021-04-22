package gamelevel;
/*
 * gamelevel ��Ű���� Player Ŭ����
 * ���ø� �޼��带 �����غ���
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
