package reference;
/*
reference ��Ű���� Subject Ŭ����
�����ڷ����� ���ؼ� �˾ƺ���

*/
public class Subject {
	String subjectName;
	int scorePoint;
	
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	public void showSubject() {
		System.out.println(this.subjectName + " ������ ������ "+ this.scorePoint + "�Դϴ�");
	}
}
