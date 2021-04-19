package polymorphism;
/*
 polymorphism ��Ű���� AnimalTest Ŭ����
 �������� ���� �˾ƺ���
 
 �������� �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
 ���� �ڵ忡�� ���� ���� ����� ���´ٴ� ��
 
 moveAnimal�� � �ν��Ͻ����� Animal ������ ��ȯ�� move �޼��带 ȣ���Ѵ�
 ����޼���� �ڵ�� ���� ������ �Ű������� ���� ��¹��� �޶����°�
 
 ����, ����ȭ, Ȯ�强, �������� �ϱ� ���� ���α׷��� ���� �� ����
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
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
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
