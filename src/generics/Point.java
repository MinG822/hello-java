package generics;
/*
 * generics 패키지의 Point 클래스
 * 제네릭 타입의 매개변수들을 사용하는 제니릭 메서드를 활용하기
 * 
 * public <,로 구분된 매개변수들의 제네릭 타입> 반환형 메서드 이름(제네릭 타입들) {}
 * 이때 제네릭 타입은 메서드 내에서만 유효하다
 */
public class Point<T,V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	

}