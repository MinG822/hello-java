package reference;

public class TestStudent {
	public static void main(String args[]) {
		Student mon = new Student(1, "mon");
		mon.showStudent();
		
		Subject kor = new Subject("korean", 100);
		Subject eng = new Subject("english", 100);
		Subject math = new Subject("math", 100);
		
		mon.setSubjects(kor, eng, math);
		mon.showStudnetSubjectScore();
	}
}
