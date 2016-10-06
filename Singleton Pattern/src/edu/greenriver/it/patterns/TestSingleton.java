package edu.greenriver.it.patterns;

public class TestSingleton {

	public static void main(String[] args) {
		ApplicationStatistics stats = ApplicationStatistics.getInstance();
		stats.startApp();
		
		String word = "Hello";
		stats.objectCreated();
		
		stats.endApp();
	}

}
