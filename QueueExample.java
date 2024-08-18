package programs.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<String> q=new LinkedList<>();
		
		q.add("Pushpa");
		
		q.add("Latha");
		
		q.add("Naga");
		
		q.add("Kotcherla");
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		
		System.out.println(q);
	
		
		
		
		
	}

}
