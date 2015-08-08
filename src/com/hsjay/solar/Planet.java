package com.hsjay.solar;

import java.awt.Color;
import java.awt.Graphics;

public class Planet extends Star{
	//除了图片和位置，行星还在绕椭圆飞行，有长轴和短轴，还有速度，还有它的Star
	Star star;
	double longAxis, shortAxis;	//椭圆的长轴和短轴
	double speed;	//速度
	double degree;	//角度
	boolean satellite;
	
	public Planet(String imgpath, Star star,
			double longAxis, double shortAxis, double speed, boolean satellite) {
		super(imgpath, star.x + longAxis, star.y + shortAxis);
		this.star = star;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.satellite = satellite;
	}

	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics g) {
		if(!satellite) {
			drawTrace(g);
		}
		super.draw(g);
		move();
	}
	
	public void move() {
		x = (star.x + star.wight/2) + (longAxis + this.wight/2) * Math.cos(degree);
		y = (star.y + star.height/2) + (shortAxis + this.height/2) * Math.sin(degree);
		degree += speed;
	}
	
	public void drawTrace(Graphics g) {
		int ovalX, ovalY, ovalWidth , ovalHeight;
		ovalX = (int) ((star.x + star.wight/2) - longAxis);
		ovalY = (int) ((star.y + star.height/2) - shortAxis);
		ovalWidth = (int) (2 * longAxis);
		ovalHeight = (int) (2 * shortAxis);
		
		Color oldColor = g.getColor();
		g.setColor(Color.blue);
		g.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
		g.setColor(oldColor);
	}
}

