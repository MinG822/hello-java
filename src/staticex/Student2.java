package staticex;
/*
 staticex 패키지의 Student2 클래스
 static 메서드에 대해 알아본다
 
 static 변수는 static 메서드에서 사용할 수 있다
 static 메서드 setSerialNum 에서 this.serialNum 로 부를 수 없다. this 는 생성된 인스턴스의 메모리 주소를 가리키기 때문
 마찬가지로 static 메서드에서 인스턴스 변수 역시 사용할 수 없다
 static 변수 및 메서드는 인스턴스를 생성하지 않아도 사용할 수 있다 System.out.println() 처럼

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
		serialNum = newSerialNum; // 크
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
}
