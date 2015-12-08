package com.mtbf.test;

import com.mtbf.test.music.MusicNavigation;
import com.mtbf.test.music.MusicPlay;

public class MusicManager {
	MusicNavigation musicNavigation;
	MusicPlay musicPlay;
	
	/**
	 * 获取Music导航页对象的引用
	 * @return
	 */
	public MusicNavigation getMusicNavigation(){
		/**
		 * 判断对象引用是否为空，若为空，则new一个对象出来
		 */
		if (musicNavigation == null) {
			musicNavigation = new MusicNavigation();
		}
		return musicNavigation;
	}
	
	/**
	 * 获取Music导航页对象的引用
	 * @return
	 */
	public MusicPlay getMusicPlay(){
		if (musicPlay == null)
			musicPlay = new MusicPlay();
		return musicPlay;
	}

}
