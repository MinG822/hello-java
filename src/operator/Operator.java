package operator;
/*
 operator 패키지의 Operator 클래스
 기본 연산자에 대해서 알아본다.
 
 연산자는 연산에 사용하는 기호, 항은 연산에 사용하는 값
 필요로 하는 항의 개수에 따라 단항 연산자, 이항 연산자, 삼항 연산자로 나눌 수 있음
 연산자 우선순위는 단항 > 이항 > 삼항 연산자
 
 대입 연산자 = 는 이항 연산자로 이항 연산자 중 가장 순위가 낮음
 부호 연산자는 +, -로 단항 연산자
 산술 연산자는 사칙 연산에서 사용하는 +, -, *, /, %
 
 증감 연산자 ++, -- 는 단항 연산자로 연산자의 앞이나 디에 사용해 값을 1만틈 늘리거나 줄이는데, 사용하는 위치에 따라 결과가 달라진다.
 증감 연산자가 피연산자 앞에 있으면 문장이 끝나기 전에 (; 전에) 증감되고, 뒤에 있으면 문장이 끝나고 나서 증감된다.
 
 관계 연산자 >, <, >=, <=, !=, == 는 이항 연산자이다
 관계 연산자의 결과 값은 true 또는 false 로 반환된다.
 
 논리 연산자 &&, ||, !는 두 명제의 참거짓을 판단하며 이항 연산자이다.
 우선순위 관계 연산자 > 논리 연산자
 
 복합 대입 연산자 +=, -= 등은 대입 연산자와 다른 연산자를 조합해 하나의 연산자처럼 사용하는 이항 연산자이다.
 
 조건 연산자는 삼항 연산자로 주어진 조건식이 참인 경우와 거짓인 경우에 다른 결과 값이 나온다
 */

public class Operator {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 97;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0; 
		// double avgScore = totalScore / 3; int 형으로 나누게 되면 int / int 가 되어 소수점 자리의 값을 잃는다. 
		System.out.println(avgScore);
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		int value = 10;
		int num = ++value;
		System.out.println(num);
		System.out.println(value);
		
		int num2 = value++;
		System.out.println(num2);
		System.out.println(value);
		
		int myAge = 27;
		boolean isOlderThan25 = (myAge > 25);
		System.out.println(isOlderThan25);
		
		boolean isAllTrue = (5>3) && (5>2);
		boolean isOneTrue = (5>3) || (5<2); // 두번째 항은 첫번째 항이 참일 경우 실행 되지 않는다
		boolean isNotBigger = !(5>3);
		
		int i = 10;
		boolean firstTrue = isAllTrue || ((i = i - 5) < 10 );
		System.out.println(i);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char isFatherOlderThanMother = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(isFatherOlderThanMother);
	}
}
