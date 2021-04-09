package staticex;
/*
 staticex ��Ű���� Student2 Ŭ����
 static �޼��忡 ���� �˾ƺ���
 
 static ������ static �޼��忡�� ����� �� �ִ�
 static �޼��� setSerialNum ���� this.serialNum �� �θ� �� ����. this �� ������ �ν��Ͻ��� �޸� �ּҸ� ����Ű�� ����
 ���������� static �޼��忡�� �ν��Ͻ� ���� ���� ����� �� ����
 static ���� �� �޼���� �ν��Ͻ��� �������� �ʾƵ� ����� �� �ִ� System.out.println() ó��

 */
public class Student2 {
	private static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2(String name) {
		this.studentName = name;
		this.studentId = serialNum++;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public static void setSerialNum(int newSerialNum) {
		serialNum = newSerialNum; // ũ
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
}
