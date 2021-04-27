package bookshelf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookShelfTest {

	@Test
	void test() {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("mong 1");
		shelfQueue.enQueue("mong 2");
		shelfQueue.enQueue("mong 3");
		
		assertEquals(shelfQueue.deQueue(), "mong 1");
		assertEquals(shelfQueue.deQueue(), "mong 2");
		assertEquals(shelfQueue.deQueue(), "mong 3");
	}

}
