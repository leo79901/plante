package com.qlgydx.planet;

import java.awt.Graphics;
import java.awt.Image;

import com.qlgydx.util.GameUtil;

public class Star {
	Image img;
	double x,y;
	int width,height;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public Star(){
	}
	
	public Star(Image img){
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		
	}
	
	public Star(Image img,double x,double y){
		this(img);
		this.x = x;
		this.y = y;
		
	}
	
	public Star(String imgpath,double x,double y){
		this(GameUtil.getImage(imgpath), x, y);   //通过this调用另一个构造方法
	}
}
