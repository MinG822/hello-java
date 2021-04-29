package generics;
/*
 * generics 패키지의 ThreeDPrinter 클래스
 * 제네릭에 대해 알아본다
 * 
 * 변수나 메서드의 매개변수의 자료형이 필요에 따라 여러 자료형을 사용할 수 있도록 프로그래밍하는 것이 제네릭 프로그래밍
 * 제네릭 프로그램은 참조 자료형이 변환될 때 이에 대한 검증을 컴파일러가 함
 * 
 * Powder 와 Plastic 을 매개변수로 받는 ThreeDPrinter 의 메서드를 구현하려면
 * 각각의 자료형을 받는 메서드와 변수들을 만들어주거나
 * Object 형으로 받아서 나중에 형변환을 해주거나
 * 또는 제네릭을 사용할 수 있다
 * 
 * 제네릭을 사용하면 형변환을 할 필요도, 코드를 반복하지 않아도 된다.
 * <> 다이아몬드 연산자에 넣는 것이 자료형 매개변수(type parameter) 이며
 * 제네릭 자료형이 필요한 모든 부분에 이후 사용할 수 있다.
 * T 의 자료형이 정해지는 순간은 제네릭 클래스의 인스턴스가 생성되는 시점이다.
 * static 변수나 메서드는 인스턴스가 생성되기 전에 생성되기 때문에 T를 사용할 수 없다
 * 
 * <T extends 자료형>과 같이 T 자료형에 사용할 자료형을 제한할 수 있다
 * 한편 컴파일러가 생략된 부분을 유추할 수 있을 때는 다이아몬드연산자에 자료형을 넣지 않아도된다
 * 
 */

public class ThreeDPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}

}
