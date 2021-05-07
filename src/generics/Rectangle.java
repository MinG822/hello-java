package generics;
/*
 * int, double, float, short, long, byte 자료들을 업캐스팅한 뒤 double 타입으로 변환
 * 왜 Number 형으로 바꾸지?
 * 넓이를 구하는 연산 및 반환이 double 형으로 정해져 있기 때문에, 주어진 입력을 double 로 변환해야하는데,
 * int -> double, float -> double 과같은 경우에는 에러가 발생한다 (variables 패키지 참고)
 * 따라서 Number 로 바꾼다음에 doubleValue 메서드를 호출해야 더블 자료형으로 연산하고 반환할 수 있다
 * (자동으로 타입을 추론하는 파이썬이나 자바스크립트와 다른 지점)
 */
public class Rectangle {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
}
