package classpart;
/*
 classpart ��Ű���� Student Ŭ����
 ��ü���� ���α׷��ְ� Ŭ������ ���� �˾ƺ���.
 
 ��ü�� �ǻ糪 ������ ��ġ�� ���
 ��ü���� ���α׷����� ��ü�� ������� �ϴ� ���α׷���
 ��ü�� �����ϰ�, �� ��ü�� ����� �����ϰ�, ��ü �� ������ ���α׷��� �Ѵ�
 
 Ŭ������ ��ü�� ������ �� �ִ�.
 Ŭ���� ���ο� ��ü�� �Ӽ��� ��Ÿ���� ������ �������, ����� ������ �Լ��� �޼���(��� �Լ�)�� ��
 ���� ���� Ŭ������ ��ü�� �����ϴ� ���� Ŭ������ �����Ѵٶ�� ǥ��
 
 Ŭ���� �̸��� �빮�ڷ�
 Ŭ������ ��ü�̸��� classpart.Student �� 
 Ŭ������ �̸��� ���Ƶ� �ٸ� ��Ű���� ���� ������ ������ ����
 Ŭ���� ���� �ȿ� ���� Ŭ���� �� ���� �� ������ public Ŭ������ �� �ϳ������ϰ� public Ŭ������ �̸��� �ڹ� ���� �̸��� ���ƾ��Ѵ�
 classpart ��Ű�� �Ʒ� �� ���� Ŭ���� ������ �������
 ��Ű���� Ŭ���� ������ ��������
 �ҽ��ڵ带 ���������� ������ �� �ֵ��� �Ѵ�
 
 main �Լ��� �ڹٰ���ӽ�(JVM)�� ���α׷��� �����ϱ� ���� ȣ���ϴ� �Լ�, Ŭ���� ���ο� ��������Ŭ������ �޼��尡 �ƴϴ�
 �Ʒ�ó�� Ŭ���� ���ο� main �Լ��� ����� �� Ŭ������ ���α׷��� ����Ŭ������ ��
 �̿� ���� Ŭ���� ���ο� main �Լ��� ȣ���� �׽�Ʈ�� �����ϸ� ��� Ŭ������ main �Լ��� ���� �ؾ� �ϴµ�,
 �׷� �ʿ� ���� ���� �׽�Ʈ�� Ŭ������ ������ �� �ִ� 
 */
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	
	public String getStudentName( ) {
		return studentName;
	};
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "����";
		
		System.out.println(studentKim.studentName);
		studentKim.setStudentName("������");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}
	
}
