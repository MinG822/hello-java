package wrapper;
/*
 * wrapper ��Ű��
 * Integer.valueOf(��:int, String) �� �ش簪�� ���� Integer �� ������ ������ �� �ִ�
 * 
 * ���� ���� ���� Integer �� ��� ��� ���� ��ü�̸� int 100 ���� ����
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
