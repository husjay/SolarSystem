package com.hsjay.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 * 
 * @author hsj
 *
 */
public class GameUtil {
	public static Image getImage(String path) {
		URL u = GameUtil.class.getClassLoader().getResource(path);
		Image img = null;
		img = Toolkit.getDefaultToolkit().getImage(u);
		return img;
	}
}
