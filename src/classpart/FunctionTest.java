package classpart;
/*
 classpart 패키지의 FunctionTest 클래스
 클래스 메서드를 구현한다
 
 함수의 반환값의 자료 형을 함수 이름 앞에 붙인다. 
 만약 함수가 반환하지 않으면 void 를 써 반환값이 없음을 나타낸다
 
 함수가 호출되면 그 함수만으 위한 메모리 공간이 할당 되며, 그 메모리 공간을 스택이라고 부른다
 아래 클래스에선 main 함수가 호출되어 main 함수에서 사용할 메모리 공간이 스택에 생성되며,
 main 함수에서 add 함수가 호출 되어 스택에 새롭게 생성된다.
 add 함수가 수행이 끝나면, 해당 함수에게 할당했던 메모리공간을 해제한다.
 add 함수에 넘겨주는 매개변수와 main 에서 사용하는 변수는 서로 다른 메모리 공간을 사용한다
 함수 내부에서만 사용하는 변수를 지역변수라 하고, 지역변수는 스택 메모리에 생성된다
 
 스코프는 파이썬과 다르다. 
 하위 함수에서 상위 함수의 변수를 쓸 수 있는 파이썬과 달리
 자바에서는 하위 함수가 상위 함수의 변수를 전혀 참고 할 수 없다.
 메모리 사용 방법이 전혀 다른 듯 하다
 
 int 형 변수의 메모리 주소는 결국 상수 풀에서의 해당 값의 메모리 주소이고
 따라서 변수의 값을 증가시키거나 하면 해당 변수의 메모리 주소가 달라진다
 파이썬에서는 int 형 변수의 값을 변경시켰을 때 마찬가지로 메모리 주소가 달라지나?
 
 메서드는 클래스 내에서 사용하는 함수로 멤벼 변수를 사용할 수 있다
 
 하나의 함수에는 하나의 기능을 구현해야한다.
 함수 이름은 캐멀케이스
 */
public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다");
		System.out.println("10 의 메모리 주소"+ System.identityHashCode(10));
		System.out.println("n1의 메모리 주소" + System.identityHashCode(num1));
		int test = 1;
		scopeTest(test);
		System.out.println(test);
	}
	
	public static int add(int n1, int n2) {
		System.out.println("n1 의 메모리 주소 "+System.identityHashCode(n1));
		int result = n1 + n2;
		n1 += 1;
		System.out.println("n1 의 값이 증가한 후 메모리 주소 "+System.identityHashCode(n1));
		return result;
	}
	
	public static void scopeTest(int tnum) {
		tnum += 1;
	}

}
