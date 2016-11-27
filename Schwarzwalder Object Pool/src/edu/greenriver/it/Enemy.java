/**
 * Jami Schwarzwalder
 * Nov 25, 2016
 * Enemy.java
 * [Description Here]
 */
package edu.greenriver.it;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class Enemy {

	private Point2D position;
	private BufferedImage appearance;

	public Enemy(Point2D position, String apperanceLocation) {

		this.position = position;
		try {
			this.appearance = ImageIO.read(new File(apperanceLocation));
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public void start() {
		
		//begin animation
		//move toward hero
	}

	public void destroy() {
		
		//add points to score
		//destroy child objects
		
	}

	public void SetPosition(Point2D position) {
		this.position = position;
	}
	
	public Point2D GetPosition(){
		return position;
	}
	
	public BufferedImage GetAppearance()
	{
		return appearance;
	}

}
