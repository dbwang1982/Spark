package com.mtbf.test;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class BasicTestCase extends UiAutomatorTestCase{
	protected MusicManager music = null;
	private UiObjectHelper mUiObjectHelper;

	
/*	public BasicTestCase(){
		auto = new UiObjectHelper();
	} */ 

	protected void setUp() throws Exception{
		super.setUp();
		/*auto = new UiObjectHelper();
		music =new MusicManager();*/
	}
	
	    @Override
    protected void tearDown() throws Exception {
/*        if (mShouldDisableIme) {
            restoreActiveIme();
        }*/
        super.tearDown();
    }
	   
  
    /**
     * Get current instance of {@link UiObjectHelper}. Works similar to calling the static
     * {@link UiObjectHelper#getInstance()} from anywhere in the test classes.
     * @since API Level 16
     */
	public UiObjectHelper getuiObjectHelper(){
		mUiObjectHelper = new UiObjectHelper();
		return mUiObjectHelper;		
	}
	    
	
    /**
     * package private
     * @param uiObjectHelper
     */
/*	void setUiObjectHelper(UiObjectHelper uiObjectHelper){
		mUiObjectHelper = uiObjectHelper;
	}*/
	/**
	 * 通过aapt dump badging apkname获得这两个信息
	 */
/*	String packageName = "com.netease.newsreader.activity";
	String activityName = "com.netease.nr.biz.ad.AdActivity";*/
/*	protected void setUp(boolean isNeedLogin) throws Exception {
		super.setUp();
		*//**
		 * 通过am start命令启动被测试应用，这样可以确保在不同的手机或者OS上用统一的代码启动测试应用
		 *//*
		//Runtime.getRuntime().exec("am start -n " + packageName + "/" + activityName);
		auto = new AutoAction();
		Thread.sleep(1000);	
		if (isNeedLogin) {
			pm.getPageNavigation().goToMySettingsTab();
			pm.getPageMy().clickLoginImageView();
			//pm.getPageLogin().login("robotium2016@163.com", "uiautomator");
			pm.getPageLogin().login("m15811296203@163.com", "byd@usesr");
		}
		
	}*/

}
