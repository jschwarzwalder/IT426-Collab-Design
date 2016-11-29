/**
 * Jami Schwarzwalder
 * Nov 25, 2016
 * ObjectPool.java
 * [Description Here]
 */
package edu.greenriver.it;

import java.util.LinkedList;

/**
 * Singleton Generic Object Pool
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class ObjectPool<T>  implements IObjectPool{

	// create list to store objects
	private LinkedList objectPool = new LinkedList();

	// Option 1 is to generate objects when initialized
	private int poolSize = 15;

	// Option 2 is to generate objects when requested and none are available
	private int maxPoolSize = 50;
	
	private 

	public ObjectPool(Class<T> clazz) {
		
		for (int i = 0; i < poolSize; i++) {
			
		}
		private static class SomeContainer<T> 
		T createContents(Class<T> clazz){
			return clazz.newInstance();
		}
	}
		
	}

	public T getObject() {

	}

	public void returnObject(T object) {

	}

}
