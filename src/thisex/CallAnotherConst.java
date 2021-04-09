package thisex;
/*
thisex ��Ű���� CallAnotherConst Ŭ����
this �� ���ؼ� �˾ƺ���

Ŭ������ �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� �Լ��� this �� ����� �� �ִ�.

this �� ��ȯ�� �ν��Ͻ� �ּҰ��� ��ȯ�� �� �ִµ�, �̶� ��ȯ �ڷ����� Ŭ���� �ڷ����̴�
*/

class Person {
	String name;
	int age;
	
	Person() {
		this("�̸�����", 1); 
		// Person(String name, int age) �����ڸ� ȣ���Ѵ�, �̶� ������ �Լ��� ȣ���ϱ� ���� �ٸ� �ڵ带 ������ �� ����
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
