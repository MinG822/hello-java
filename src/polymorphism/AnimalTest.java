package polymorphism;

import java.util.ArrayList;

/*
 polymorphism ��Ű���� AnimalTest Ŭ����
 
 �������� �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
 ���� �ڵ忡�� ���� ���� ����� ���´ٴ� ��
 
 moveAnimal�� � �ν��Ͻ����� Animal ������ ��ȯ�� move �޼��带 ȣ���Ѵ�
 ����޼���� �ڵ�� ���� ������ �Ű������� ���� ��¹��� �޶����°�
 
 ����, ����ȭ, Ȯ�强, �������� �ϱ� ���� ���α׷��� ���� �� ����
 
 �ٿ� ĳ����: ���� Ŭ������ ����ȯ
 �ٿ� ĳ���� �ϱ� ���� ���� Ŭ������ �� ��ȯ�� �ν��Ͻ��� ���� �ڷ����� Ȯ���ؾ��� �� instanceof �� ����� �� �ִ�
 
 */

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �ϴ� �ָ� ���ư��ϴ�");
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
			 System.out.println("�������� ���� ���Դϴ�");
		 }
	 }

}
