package collection.linkedlist;

import java.util.LinkedList;

import collection.linkedlist.Log;

public class History {
	LinkedList<Log> logs = new LinkedList<Log>();
	int cursor = 0;
	final int MAX_SIZE = 5;
	
	
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
	
	
	public String goForward() {
		if (cursor == 0) {
			return null;
		}
		cursor --;
		return logs.get(cursor).path;
	}
	
	
	public String goBack() {
		if (cursor == MAX_SIZE - 1) {
			return null;
		}
		cursor ++;
		return logs.get(cursor).path;
	}
	
	
	public String getCurrent() {
		if (logs.isEmpty()) {
			return null;
		}
		return logs.get(cursor).path;
	}
}