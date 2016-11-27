package edu.greenriver.it;
import java.awt.Image;
import java.awt.geom.Point2D;

/**
 * Jami Schwarzwalder
 * Nov 25, 2016
 * Bullet.java
 * Example of Object you would want to pool
 */

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class Bullet {
	
	private int velocity;
	private Point2D postion;
	private int lifeSpan;
	private int damage;
	private Image bulletImage;
	
	/**
	 * Creates a new Bullet
	 *
	 * @param velocity
	 * @param postion
	 * @param lifeSpan
	 * @param damage
	 * @param bulletImage
	 */
	public Bullet(int velocity, Point2D postion, int lifeSpan, int damage, Image bulletImage) {
		
		this.velocity = velocity;
		this.postion = postion;
		this.lifeSpan = lifeSpan;
		this.damage = damage;
	}
	
	public void  shoot(Ship weapon, Canvas gameScreen){
		this.velocity = weapon.velocity;
		this.postion = weapon.position;
		
		while(this.position != otherObject){
			
		}
		
		
		
	}
	
	
	

}
