package thisex;
/*
thisex 패키지의 CallAnotherConst 클래스
this 에 대해서 알아본다

클래스의 생성자에서 다른 생성자를 호출하는 함수로 this 를 사용할 수 있다.

this 를 반환해 인스턴스 주소값을 반환할 수 있는데, 이때 반환 자료형은 클래스 자료형이다
*/

class Person {
	String name;
	int age;
	
	Person() {
		this("이름없음", 1); 
		// Person(String name, int age) 생성자를 호출한다, 이때 생성자 함수를 호출하기 전에 다른 코드를 수행할 수 없다
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnSelf() {
		return this;
	}
	
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName.returnSelf());
	}
}
