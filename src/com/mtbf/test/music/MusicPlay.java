package com.mtbf.test.music;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.mtbf.test.UiObjectHelper;

public class MusicPlay {
	/**
	 * 获取第一首歌曲的ClassName和Index
	 * @return
	 * @throws UiObjectNotFoundException
	 */
/*	public static UiObject getTouchSongs() throws UiObjectNotFoundException{
		return UiObjectHelper
				.getUiObjectByClassNameAndInstanceIndex("android.widget.TextView", 2);
	}*/
/*	public static UiObject getTouchSongs() throws UiObjectNotFoundException{
		return UiObjectHelper
				.getUiObjectByClassNameAndInstanceIndex("android.widget.TextView", 2);
		
	}*/
	
	public void gotoSongs(UiObjectHelper auto) throws Exception{
		auto.clickText("Songs");

	}
	/**
	 * 点击TouchSongs的方法
	 */
/*	public static void gotoTouchSongs(){
		try {
			getTouchSongs().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}*/

}
