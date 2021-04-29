package generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class ThreeDPrinterTest {

	@Test
	void materialTest() {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		assertEquals(powder.doPrinting(), "Powder 재료로 출력합니다");
		assertEquals(powder.toString(), "재료는 Powder 입니다");
		
		assertEquals(plastic.doPrinting(), "Plastic 재료로 출력합니다");
		assertEquals(plastic.toString(), "재료는 Plastic 입니다");
	}
	
	@Test
	void printerTest() {
		Powder powder = new Powder();
		ThreeDPrinter printer = new ThreeDPrinter();
		printer.setMaterial(powder);
		assertEquals(printer.getMaterial(), powder);
		assertEquals(printer.toString(), "재료는 Powder 입니다");
		
		Plastic plastic = new Plastic();
		printer.setMaterial(plastic);
		assertEquals(printer.getMaterial(), plastic);
		assertEquals(printer.toString(), "재료는 Plastic 입니다");
	}
	
	@Test
	void extendsTest() {
		class Water {};
		Water water = new Water();
		ThreeDPrinter printer = new ThreeDPrinter();
//		printer.setMaterial(water);
	}

}
