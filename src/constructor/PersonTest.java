package constructor;
/*
constructor ��Ű���� PersonTest Ŭ����
�����ڿ� ���ؼ� �˾ƺ���

Person() �� ���� �Լ��� �����ڶ�� ��
�����ڸ� ���� ó�� Ŭ������ ������ �� ���� �ʱ�ȭ �� �� �ִ�
������ �̸��� Ŭ���� �̸��� ���� �����ڴ� ��ȯ ���� ����

������ �����ε�
�ƿ� �����ڰ� ������ �����Ϸ��� �ڵ����� ����Ʈ �����ڸ� ��������
���� ��쿡�� ����Ʈ �����ڰ� �־�� new Person() �� ���� �ν��Ͻ��� �����ϴµ� ������ �߻����� ����
Ŭ������ �����ڰ� �� �� �̻� �����Ǵ� ��츦 ������ �����ε�����
�ν��Ͻ��� ������ �� ���ϴ� �����ڸ� �����ؼ� ����� �� ����

��������, �ڵ� ����ȭ ���� ������ �Ű������� �ִ� �����ڸ� ������ ����ϴ� ���� ������ ��찡 ����
*/
public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person(); // �ƿ� �����ڰ� ���ų� �Ǵ� �����ڸ� �߰��� ��� ����Ʈ �����ڸ� �߰��ؾ� ������ ���� �ʴ´�, 
		Person person2 = new Person(46.0f);
		Person person3 = new Person("person3");
		
		person2.name = "person2";
		person2.height = 100.0f;
	}
}