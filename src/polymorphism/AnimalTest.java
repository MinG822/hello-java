package polymorphism;
/*
 polymorphism 패키지의 AnimalTest 클래스
 다형성에 대해 알아본다
 
 다형성은 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
 같은 코드에서 여러 실행 결과가 나온다는 뜻
 
 moveAnimal은 어떤 인스턴스던지 Animal 형으로 변환해 move 메서드를 호출한다
 가상메서드로 코드는 변함 없지만 매개변수에 따라 출력문이 달라지는것
 
 유연, 구조화, 확장성, 유지보수 하기 좋은 프로그램을 만들 수 있음
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
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		moveAnimal(new Human());
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}
	
	 public static void moveAnimal(Animal animal) {
		 animal.move();
	 }

}
