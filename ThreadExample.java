package programs.com;

public class ThreadExample extends Thread{
	
	public void run() 
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Value of I :"+i);
				
				Thread.sleep(1000);
			}
		}
		catch(Exception ie)
		{
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args) 
	{
		ThreadExample t=new ThreadExample();
		
		t.setName("Pushpa");
		
		System.out.println(t.getName());
		
		t.setPriority(MAX_PRIORITY);
		
		System.out.println(t.getPriority());
		
		System.out.println("IS ALIVE BEFORE START :"+t.isAlive());
		
		t.start();
		
		System.out.println("IS ALIVE AFTER START :"+t.isAlive());	
	}

}
