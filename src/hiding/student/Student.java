package hiding.student;
/*
 hiding.student ��Ű���� Student Ŭ����
 ���� ���п� ���� �˾ƺ���

 Ŭ���� ������ ������ �޼���, �����ڿ� ���� ������ ������ �� �ִ� ���� ���� �����ڶ�� ��
 private �� ������ ������ �޼���� �ܺ� Ŭ�������� ����� �� ����
 public �� ������ ������ �޼���� �ܺ� Ŭ�������� ����� �� ����
 
 */
public class Student {
	public int studentId; // public �ܺ� Ŭ���� ��𼭳� ������ �� ����
	private String studentName; // private ���� Ŭ���� ���ο����� ������ �� ����
	protected int grade; // protected ���� ��Ű�� ���� & ��� ������ Ŭ���������� ������ �� ����
	String address; // deafult ���� ��Ű�� ���ο����� ������ �� ����
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
