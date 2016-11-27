/**
 * Jami Schwarzwalder
 * Nov 26, 2016
 * EnemyPool.java
 * [Description Here]
 */
package edu.greenriver.it;

import java.awt.geom.Point2D;
import java.util.LinkedList;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class EnemyPool implements IObjectPool<Enemy> {
	// starting values for Enemy Object
	private Point2D startingPosition;
	private String appearanceLocation;

	// Option 1 is to generate objects when initialized
	private int poolSize = 15;

	// Option 2 is to generate objects when requested and none are available
	private int maxPoolSize = 50;

	// create list to store objects
	private LinkedList<Enemy> waitingObjectPool = new LinkedList<Enemy>();
	private Enemy[] enemyPool = new Enemy[maxPoolSize];

	public EnemyPool(Point2D startingPosition, String appearanceLocation) {
		this.startingPosition = startingPosition;
		this.appearanceLocation = appearanceLocation;

		for (int i = 0; i < poolSize; i++) {
			createEnemy(startingPosition, appearanceLocation, i);
		}
	}

	private void createEnemy(Point2D startingPosition, String appearanceLocation, int i) {
		enemyPool[i] = new Enemy(startingPosition, appearanceLocation);
		waitingObjectPool.add(enemyPool[i]);
	}

	@Override
	public Enemy getObject() {
		if (waitingObjectPool.isEmpty()) {
			if (poolSize < maxPoolSize) {
				createEnemy(startingPosition, appearanceLocation, poolSize);
				poolSize += 1;
			} else {
				return null;
			}

		}
		return waitingObjectPool.removeFirst();

	}

	@Override
	public void returnObject(Enemy object) {
		object.SetPosition(startingPosition);
		waitingObjectPool.add(object);

	}

}
