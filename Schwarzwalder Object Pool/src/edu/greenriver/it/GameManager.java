/**
 * Jami Schwarzwalder
 * Nov 26, 2016
 * GameManager.java
 * [Description Here]
 */
package edu.greenriver.it;

import java.awt.geom.Point2D;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class GameManager {

	public static void main(String[] args) {
		
		String goombaImage = "Goomba.png";
		
		Enemy[] enemies = new Enemy[10];
		
		//Create a line of 10 goombas at ground level
		for (int i = 0; i < enemies.length; i++){
			enemies[i] = new Enemy(new Point2D.Float(i * 10, 10), goombaImage);
		}
		
		//Hero engages with enemy and kills them all
		
		for (int i = 0; i < enemies.length; i++)
		{
			enemies[i] = null;
		}
		
		//Hero continues in game and encounters more enemies
		//This time we have decided we want to reuse enemies
		//so we will use an object pool of enemies
		
		IObjectPool<Enemy> enemyPool = new EnemyPool(new Point2D.Float(-10, -10), goombaImage);
		
		for (int i = 0; i < enemies.length; ++i)
		{
			enemies[i] = enemyPool.getObject();
			enemies[i].SetPosition(new Point2D.Float(i *10, 10));
		}
		
		//Hero engages with the first enemy and destroys it
		//enemy will not be destroyed but will be moved offscreen and made available for reuse later
		
		enemyPool.returnObject(enemies[0]); 
		
		//There was one more enemy lurking offscreen
		//Object pool will reuse the destroyed enemy so that the image doesn't need to be reloaded
		
		Enemy supriseEnemy = enemyPool.getObject();
		supriseEnemy.SetPosition(new Point2D.Float(100, 10));
		
		
	}

}
