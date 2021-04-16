package array;
/*
array ��Ű���� Subject Ŭ����
�迭�� ������ �������� �̸��� ������ �˷��ִ� ��ü�� ������
*/
public class Subject {
	String name;
	int score;
	
	public Subject(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		System.out.println("Subject "+ name+"�� ������ ����մϴ� : "+score + " ��");
		this.score = score;
	}
	
	public void showScore() {
		if (score == 0) {
			System.out.println("Subject "+ name+"�� ������ ���� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("Subject "+ name+"�� ������ "+score + " ���Դϴ�.");
		}
	}

}
