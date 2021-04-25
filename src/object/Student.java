package object;

public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student targetStudent = (Student)obj;
			if (this.studentId != targetStudent.studentId) {
				return false;
			}
			else if (this.studentName != targetStudent.studentName) {
				return false;
			} 
			else return true;
		} 
		else return false;
	}
	
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	} 
}
