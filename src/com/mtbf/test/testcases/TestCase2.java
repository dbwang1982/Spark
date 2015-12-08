package com.mtbf.test.testcases;

import com.mtbf.test.BasicTestCase;

public class TestCase2 extends BasicTestCase{
	
	public void testTestCase2(){
		getUiDevice().pressBack();
		getUiDevice().pressHome();
		//打开应用
		//UiObjectHelper.getInstance().clickDesc("Apps");
		
		
		sleep(2000);	
		/*UiObject object = new UiObject (new UiSelector().description("Apps"));
		object.clickAndWaitForNewWindow();*/
		getuiObjectHelper().clickDesc("Apps");
		sleep(2000);	
		getuiObjectHelper().clickText("Calculator");
		//auto().scrollClick(true, "Music");
	}
}
