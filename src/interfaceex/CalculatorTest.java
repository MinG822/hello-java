package interfaceex;
import java.lang.Error;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void calcMethodsTest() {
		int n1 = 1;
		int n2 = 2;
		
		Calculator calc = new Calculator();
		assertEquals(calc.add(n1, n2), 3);
		assertEquals(calc.subtract(n1, n2), -1);
		assertEquals(calc.times(n1, n2), 2);
		assertEquals(calc.divide(n1, n2), 0);
		assertEquals(calc.divide(n1, 0), Calc.ERROR);

	}
	
	@Test
	void calcDefaultMethodTest() {
		Calculator calc = new Calculator();
		assertEquals(calc.description(), "���� ���� Ŭ����");
		
		Calc calc2 = new Calculator();
		assertEquals(calc2.description(), "���� ���� Ŭ����");
		
		SimpleCalc calc3 = new SimpleCalc();
		assertEquals(calc3.description(), "mong ���� ���� �������̽�");
	}
	
	@Test
	void calcStaticMethodTest() {
		Calculator calc = new Calculator();
		int[] targetArr = new int[] {1, 2, 3};
		assertEquals(Calc.total(targetArr), 6);
//		assertEquals(calc.total(targetArr), 6);
//		assertEquals(Calculator.total(targetArr), 6);
		assertEquals(Calc.getCircleAreas(new int[] {1})[0], new double[] {3.14}[0]);
	}
	
	// �Ʒ��� ��� ������ ���� �ȵǰ� �����ϱ� ������ catch ���� �ɸ��� �ʴ´�
//	@Test()
//	void calcConversionTest() {
//		Calc calc = new Calculator();
//		try {
//			calc.showInfo();
//		} catch (Error e) {
//			System.out.println("passed");
//		}
//	}

}
