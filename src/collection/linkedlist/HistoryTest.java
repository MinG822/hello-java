package collection.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HistoryTest {

	@Test
	void test() {
		History history = new History();
		
		assertEquals(history.visit("Tistory"), 1);
		assertEquals(history.visit("Google"), 2);
		assertEquals(history.visit("Naver"), 3);
		assertEquals(history.getCurrent(), "Naver");
		
		assertEquals(history.visit("Daum"), 4);
		assertEquals(history.visit("Youtube"), 5);
		assertEquals(history.visit("Netflix"), 5);

		history.back();
		assertEquals(history.back(), "Daum");
		assertEquals(history.go(-2), "Google");
		assertEquals(history.back(), null);
		
		history.forward();
		history.go(1);
		assertEquals(history.visit("Tiving"), 4);
		assertEquals(history.getCurrent(), "Tiving");
		
		assertEquals(history.go(-10), "Google");
		assertEquals(history.go(10), "Tiving");
		
	}

}
