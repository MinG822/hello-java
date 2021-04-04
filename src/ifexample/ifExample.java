package ifexample;
/*
 ifexample 패키지의 ifExample 클래스
 조건문 if else 문을 연습한다
 */
public class ifExample {
	public static void main(String args[]) {
		int age = 7;
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else if (age >= 3) {
			System.out.println("유치원에 다닙니다.");
		} else {
			System.out.println("학교와 유치원에 다니지 않습니다");
		}
		
		char isPreSchoolAge = (age >= 8) ? 'F': (age >= 3) ? 'T' : 'F';
		System.out.println(isPreSchoolAge);
	}
}
