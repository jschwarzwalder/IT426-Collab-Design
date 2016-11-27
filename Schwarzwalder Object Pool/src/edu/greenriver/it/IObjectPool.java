/**
 * Jami Schwarzwalder
 * Nov 26, 2016
 * IObjectPool.java
 * [Description Here]
 */
package edu.greenriver.it;


/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface IObjectPool<T> {
		
	public T getObject ();
	
	public void returnObject(T object);

}
