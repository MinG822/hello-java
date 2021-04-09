package staticex;
/*
 staticex ��Ű���� Student Ŭ����
 static ������ ���� �˾ƺ���
 
 �ν��Ͻ����� ���� �����Ǵ� ������ �ƴ�,
 Ŭ���� �������� ����ϴ� ������ static ����(���� ����)�� �����Ѵ�
 
 static ������ �ν��Ͻ��� ������ �� �����Ǵ� ������ �ƴ϶�
 ���α׷��� ����Ǿ� �޸𸮿� �ö� �� �޸� ����(�����Ϳ���)�� �Ҵ�Ǹ� ���α׷��� ����� �� ���� �޸𸮿� �����Ѵ�
 static ������ ��� �ν��Ͻ��� �����Ѵ�
 */
public class Student {
	public static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student(String name) {
		this.studentName = name;
		this.studentId = serialNum++;
	}
	
	public int getStudentId() {
		return studentId;
	}
}
