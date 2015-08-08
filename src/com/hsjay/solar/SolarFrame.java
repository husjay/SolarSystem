package com.hsjay.solar;

import java.awt.Graphics;
import java.awt.Image;
import com.hsjay.util.Constant;
import com.hsjay.util.GameUtil;
import com.hsjay.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author hsj
 *
 */

public class SolarFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH/2, 
			Constant.GAME_HEIGHT/2);
	Planet earth = new Planet("images/Earth.jpg", sun, 
			100, 60, 0.1, false);
	Planet mars = new Planet("images/Mars.jpg", sun, 
			200, 100, 0.05, false);
	Planet moon = new Planet("images/moon.jpg", earth, 
			20, 10, 0.5, true);
	Planet jupiter = new Planet("images/Jupiter.jpg", sun, 
			300, 200, 0.3, false);
	
	public static void main(String[] args) {
		SolarFrame gf = new SolarFrame();
		gf.launchFrame();
	}
	
	public void paint(Graphics g) {
	
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
		jupiter.draw(g);
		
	}
}
