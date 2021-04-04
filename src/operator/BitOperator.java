package operator;
/*
 operator 패키지의 BitOperator 클래스
 비트 연산자에 대해 알아본다.
 
 비트 연산자는 비트 값을 기반으로 한다
 암호화, 마스킹(어떤 변수의 특정 비트를 꺼내봄), 메모리 용량이 부족하거나 계산이 복잡해서 속도가 느려질 때 빠르게 하기 위해서, 또는 특정 값을 만들거나 연산할 때 사용한다.
 
 비트 논리 연산자는 비트 단위로 &,|,^,~ 연산이 이루어진다.
 ^ (XOR) 연산자는 같은 값이면 0, 다른 값이면 1
 ~ (반전) 연산자는 비트 0을 1로, 1을 0으로 바꾸는 연산자
 
 비트 이동 연산자(shift)는 <<, >>, >>> 세 가지가 있다
 << 왼쪽으로 비트를 이동하는 연산자
 >> 오른쪽으로 비트를 이동하는 연산자, 왼쪽에 채워지는 비트 값은 기존 값의 부호 비트
 >>> >>와 동일하지만 부호비트와 관계 없이 왼쪽에 채워지는 비트 값은 무조건 0
 */
public class BitOperator {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 10;
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		int result = num1 & num2;
		System.out.println(result);
		
		int result2 = num1 | num2;
		System.out.println(result2);
		
		int result3 = num1 ^ num2;
		System.out.println(result3);
		
		System.out.println(~num1); // 부호비트가 0에서 1로 바뀌어 음수가 됨
		System.out.println(-(~num1)); // 음수로 바뀐값에서 부호만 바꾸면 원래의 num1 과 달라지게 됨
		System.out.println(~num2);
		
		System.out.println(num1 << 3); // num1 * 2^3 
		System.out.println(num1 >> 3); // num1 / 2^3
		System.out.println(Integer.toBinaryString(-num1));
		System.out.println(-num1 >> 3);
		System.out.println(Integer.toBinaryString(-num1 >> 3));
		System.out.println(-num1 >>> 3);
		System.out.println(Integer.toBinaryString(-num1 >>> 3));
	}

}
