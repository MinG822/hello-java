package constructor;
/*
 constructor ��Ű���� Person Ŭ����
 �����ڿ� ���ؼ� �˾ƺ���
 */
public class Person {
	String name;
	float height;
	float weight;
	
	public Person( ) {}; // �ڹ� �����Ϸ��� �ڵ����� �����ϴ� ����Ʈ ������
	
	public Person(String pname) { // �ν��Ͻ��� ������ �� �⺭������ �ʱ�ȭ�����ִ� ������
		name = pname;
	}
	
	public Person(float pheight) {
		height = pheight;
	}
}
