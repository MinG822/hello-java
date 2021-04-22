package finalex;
/*
 * finalex 패키지의 Constant 클래스
 * 
 * final 예약어는 변수, 메서드, 클래스에서 사용할 수 있음
 * 
 */
public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
//		cons.NUM = 100; // final 변수는 다시 대입할 수 없다
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
