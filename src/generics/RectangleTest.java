package generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void test() {
		Point<Float, Double> p1 = new Point<Float, Double>(0.0f, 0.0);
		Point<Float, Double> p2 = new Point<Float, Double>(10.0f, 10.0);
		
		double rectSize = Rectangle.makeRectangle(p1, p2);
		assertEquals(rectSize, 100.0);
	}

}
