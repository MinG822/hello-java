package collection.linkedlist;

import java.util.LinkedList;

import collection.linkedlist.Log;

public class History {
	private LinkedList<Log> logs = new LinkedList<Log>();
	private int cursor = 0;
	final private int MAX_SIZE = 5;
	
	
	public int visit(String website) {
		if (cursor == 0) {
			if (logs.size() == MAX_SIZE) {
				logs.removeLast();
			}
		} else {
			for (int i = 0; i < cursor; i++) {
				logs.removeFirst();
			}
			cursor = 0;
		}
		logs.addFirst(new Log(website));
		return logs.size();
	}
	
	
	public void refresh() {
		logs.clear();
		cursor = 0;
	}
	
	
	public String forward() {
		if (cursor == 0) {
			return null;
		}
		cursor --;
		return logs.get(cursor).path;
	}
	
	
	public String back() {
		if (cursor == logs.size() - 1) {
			return null;
		}
		cursor ++;
		return logs.get(cursor).path;
	}
	
	public String go(int i) {
		if (cursor - i < 0 ) {
			cursor = 0;
		} else if (cursor - i > logs.size() - 1) {
			cursor = logs.size() - 1;
		} else {
			cursor -= i;
		}
		return logs.get(cursor).path;
	}
	
	
	public String getCurrent() {
		if (logs.isEmpty()) {
			return null;
		}
		return logs.get(cursor).path;
	}
}