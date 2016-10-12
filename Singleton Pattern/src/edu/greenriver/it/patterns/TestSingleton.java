package edu.greenriver.it.patterns;

@SuppressWarnings("unused")
public class TestSingleton 
{
	public static void main(String[] args) 
	{
		testThreads();
	}
	
	public static void testThreads()
	{
		Thread[] threads = new Thread[5];
		
		for (int i = 0; i < threads.length; i++)
		{
			threads[i] = new TestThread();
		}
		
		for (int i = 0; i < threads.length; i++)
		{
			threads[i].start();
		}
	}
	
	public static void testSingleton()
	{
		ApplicationStatistics stats = ApplicationStatistics.getInstance();
		stats.startApp();
		
		String word = "Hello";
		stats.objectCreated();
		
		stats.endApp();
		System.out.println(stats.toString());
	}
}
