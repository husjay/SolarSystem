package com.hsjay.util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	
	public void launchFrame(){
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		setLocation(100,100);
		setVisible(true);
		
		new paintThread().start();	//启动重画线程
		
		addWindowListener(new WindowAdapter() {		//关闭按钮
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});	
	}
	
	/**
	 * 重画线程，定义一个重画窗口的内部类，引用外部类的方法repaint()
	 * @author hsj
	 *
	 */
	class paintThread extends Thread {
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
