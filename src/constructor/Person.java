package constructor;
/*
 constructor 패키지의 Person 클래스
 생성자에 대해서 알아본다
 */
public class Person {
	String name;
	float height;
	float weight;
	
	public Person( ) {}; // 자바 컴파일러가 자동으로 제공하는 디폴트 생성자
	
	public Person(String pname) { // 인스턴스를 생성할 때 멤벼변수를 초기화시켜주는 생성자
		name = pname;
	}
	
	public Person(float pheight) {
		height = pheight;
	}
}
