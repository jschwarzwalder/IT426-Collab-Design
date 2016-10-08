package edu.greenriver.it.patterns;

@SuppressWarnings("unused")
public class TestSingleton {

	public static void main(String[] args) {
		
		testThreads();
	}
	
	public static void testThreads() {
		TestThread[] threads = new TestThread[5];
		
		for (int i = 0; i < threads.length; i++){
			threads[i] = new TestThread();
		}
		
		for (int i = 0; i < threads.length; i++){
			threads[i].start();
		}
	}

}
