package abstractex;
/*
 abstractex 패키지의 구체클래스 Desktop
 
 추상클래스를 상속받기 위해서는 추상클래스에서 만들어둔 모든 추상메서드를 구현해야한다
 모든 추상메서드를 구현할 수 없다면 그 클래스도 추상클래스로 만들어아햔다
 
 */
public class Desktop extends Computer {
	public void display() {
		System.out.println("Desktop display()");
	}
	
	public void typing() {
		System.out.println("Desktop typing()");
	}
}
