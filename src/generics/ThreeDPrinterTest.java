package generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class ThreeDPrinterTest {

	@Test
	void materialTest() {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		assertEquals(powder.doPrinting(), "Powder ���� ����մϴ�");
		assertEquals(powder.toString(), "���� Powder �Դϴ�");
		
		assertEquals(plastic.doPrinting(), "Plastic ���� ����մϴ�");
		assertEquals(plastic.toString(), "���� Plastic �Դϴ�");
	}
	
	@Test
	void printerTest() {
		Powder powder = new Powder();
		ThreeDPrinter printer = new ThreeDPrinter();
		printer.setMaterial(powder);
		assertEquals(printer.getMaterial(), powder);
		assertEquals(printer.toString(), "���� Powder �Դϴ�");
		
		Plastic plastic = new Plastic();
		printer.setMaterial(plastic);
		assertEquals(printer.getMaterial(), plastic);
		assertEquals(printer.toString(), "���� Plastic �Դϴ�");
	}
	
	@Test
	void extendsTest() {
		class Water {};
		Water water = new Water();
		ThreeDPrinter printer = new ThreeDPrinter();
//		printer.setMaterial(water);
	}

}
