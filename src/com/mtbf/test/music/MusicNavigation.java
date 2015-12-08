package com.mtbf.test.music;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.mtbf.test.BasicTestCase;
import com.mtbf.test.UiObjectHelper;
/**
 * 获取页面控件是否要抛异常?
 * @author Administrator
 *
 */
public class MusicNavigation extends BasicTestCase{
	
	/**
	 * 获取艺术家Artists页
	 * @return
	 * @throws UiObjectNotFoundException
	 */
/*	public UiObject getArtists() {
		return UiObjectHelper.getUiObjectByText("Artists");
	}
	
	*//**
	 * 获取专辑Albums页
	 * @return
	 * @throws UiObjectNotFoundException
	 *//*
	public UiObject getAlbums() throws UiObjectNotFoundException {
		return UiObjectHelper.getUiObjectByText("Albums");
	}
	
	*//**
	 * 获取歌曲Songs页
	 * @return 
	 * @throws UiObjectNotFoundException
	 *//*
	public UiObject getSongs() throws UiObjectNotFoundException {
		return UiObjectHelper.clickText("Songs");
		
	}
	
	*//**
	 * 获取播放清单Playlists页
	 * @return 
	 * @throws UiObjectNotFoundException
	 *//*
	public UiObject getPlaylists() throws UiObjectNotFoundException {
		//return UiObjectHelper.getUiObjectByText("Playlists");
		
	}
	
	*//**
	 * 切换到Artists的方法
	 *//*
	public void gotoArtists(){
		try {
			getArtists().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	*//**
	 * 切换到Albums的方法
	 *//*
	public void gotoAlbums(){
		try {
			getAlbums().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	*/
	/**
	 * 切换到Songs的方法
	 */
	public void gotoSongs(){
		//auto = new UiObjectHelper();
		UiObjectHelper.clickText("Songs");
	}
	
	/**
	 * 切换到Playlists的方法
	 */
/*	public void gotoPlaylists(){
		try {
			getPlaylists().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}*/
	
}
