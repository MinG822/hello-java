package collection.linkedlist;

import java.time.LocalDateTime;

public class Log {
	public String path;
	public LocalDateTime visitTime;
	
	public Log(String path) {
		this.path = path;
		visitTime = LocalDateTime.now();
	}
}
