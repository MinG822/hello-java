package variable;
/*
 variable 패키지의 Variable1 클래스
 변수를 선언하고 값을 대입해 해당 변수를 화면에 출력한다.
 '자료형 변수이름' 과 같은 형식으로 변수를 선언한다.
 선언된 자료형에 맞는 값만 대입할 수 있다.
 */
public class Variable {
	
	public static void main(String[] args) {
		int level;
		level = 10;
		System.out.println(level);
		
		int age;
		age = 27;
		System.out.println(age);
		
		// 선언과 동시에 값을 대입(초기화)할 수 있다.
		int myLevel = 10;
		System.out.println(myLevel);
	}

}
