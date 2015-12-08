package com.mtbf.test.testcases;

import java.io.IOException;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.mtbf.test.BasicTestCase;
import com.mtbf.test.UiObjectHelper;
import com.mtbf.test.music.MusicNavigation;




/**
 * 预置歌曲
 *1.进入默认音乐播放器
 *2.验证是否进入
 *3.选择本地音乐
 *4.后台播放30分钟
 *5.退出音乐播放器
 *
 * 检查点:此用例在执行新闻阅读类用例的同时在后台执行。即执行“网易/浏览新闻”用例前打开音乐，在执行完“看书软件（i阅读）”后退出音乐。
 * @author Administrator
 *
 */

public class TestCase1 extends BasicTestCase{
	
	public void testTestCase1() throws UiObjectNotFoundException, Exception{
		String packageName = "com.netease.newsreader.activity";
		String activityName = "com.netease.nr.biz.ad.AdActivity";
		Runtime.getRuntime().exec("am start -n " + packageName + "/" + activityName);
		getUiDevice().pressBack();
		getUiDevice().pressHome();
		//打开应用
		//UiObjectHelper.getInstance().clickDesc("Apps");
		
		
		sleep(2000);	
		/*UiObject object = new UiObject (new UiSelector().description("Apps"));
		object.clickAndWaitForNewWindow();*/
		getuiObjectHelper().clickDesc("Apps");
		sleep(2000);	
		getuiObjectHelper().clickText("Music");
		//auto().scrollClick(true, "Music");
		
		
		
		//在导航栏点击Songs
		//music.getMusicNavigation().gotoSongs();
		//music.getMusicNavigation().gotoSongs();
		//auto.clickText("Songs");
		
		//点击列表中第一首歌曲
		//music.getMusicPlay().gotoTouchSongs();
		
	}
}
