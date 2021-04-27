package wrapper;
/*
 * wrapper 패키지
 * Integer.valueOf(값:int, String) 로 해당값을 가진 Integer 형 변수에 대입할 수 있다
 * 
 * 같은 값을 가진 Integer 인 경우 모두 같은 객체이며 int 100 과도 같다
 * 
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WrapperTest {

	@Test
	void test() {
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		Integer num3 = Integer.valueOf("100");
		
		assertEquals(System.identityHashCode(num1), System.identityHashCode(num2));
		assertEquals(num1, num2);
		assertEquals(num3, num2);
		assertEquals(100, num2);
		assertEquals(System.identityHashCode(100), System.identityHashCode(num2));
		
		assertEquals(Integer.parseInt("100"), 100);
	}

}
