package com.hsjay.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.hsjay.util.GameUtil;

public class Star {
	Image img;
	double x, y;	//位置坐标
	double wight, height;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Star() {
		
	}
	public Star(String imgpath) {
		this.img = GameUtil.getImage(imgpath);
		this.wight = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	public Star(String imgpath, double x, double y) {
		this(imgpath);
		this.x = x + wight/2;
		this.y = y + height/2;
		}
	
}
