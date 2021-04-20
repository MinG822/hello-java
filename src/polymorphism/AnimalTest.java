package polymorphism;

import java.util.ArrayList;

/*
 polymorphism 패키지의 AnimalTest 클래스
 
 다형성은 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
 같은 코드에서 여러 실행 결과가 나온다는 뜻
 
 moveAnimal은 어떤 인스턴스던지 Animal 형으로 변환해 move 메서드를 호출한다
 가상메서드로 코드는 변함 없지만 매개변수에 따라 출력문이 달라지는것
 
 유연, 구조화, 확장성, 유지보수 하기 좋은 프로그램을 만들 수 있음
 
 다운 캐스팅: 하위 클래스로 형변환
 다운 캐스팅 하기 전에 상위 클래스로 형 변환된 인스턴스의 원래 자료형을 확인해야할 때 instanceof 를 사용할 수 있다
 
 */

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 하늘 멀리 날아갑니다");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Human());
		animals.add(new Tiger());
		animals.add(new Eagle());
		
		for (int i = 0; i < animals.size(); i++ ) {
			moveAnimal(animals.get(i));
			testCasting(animals.get(i));
		}
	}
	
	 public static void moveAnimal(Animal animal) {
		 animal.move();
	 }
	 
	 public static void testCasting(Animal animal) {
		 if(animal instanceof Human) {
			 ((Human) animal).readBook();
		 }
		 else if(animal instanceof Tiger) {
			 ((Tiger) animal).hunting();
		 }
		 else if(animal instanceof Eagle) {
			 ((Eagle) animal).flying();
		 }
		 else {
			 System.out.println("지원되지 않은 형입니다");
		 }
	 }

}
