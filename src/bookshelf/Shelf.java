package bookshelf;

import java.util.ArrayList;
/*
 * interface 연습용 패키지
 */
public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf( ) {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
