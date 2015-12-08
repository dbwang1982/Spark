package com.mtbf.test;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
/**
 * 1、添加了点击操作：Text、Description、ResourceId、Class
 * 2、
 * @author Administrator
 *
 */
public class UiObjectHelper {
	
	private static UiObjectHelper sUiObjectHelper;	
	public UiObjectHelper (){	// reference to self
		//hide constructor 		
	}	
    /**
     * Retrieves a singleton instance of UiObjectHelper
     *
     * @return UiObjectHelper instance
     * @since API Level 16
     */
	public static UiObjectHelper getInstance(){
		if (sUiObjectHelper == null) {
			sUiObjectHelper = new UiObjectHelper();
		}
		return sUiObjectHelper;
	}
	/**
	 * 通过文本定位的方法
	 * @param text 
	 */
/*	public void click (int x, int y){
		UiDevice.this.click(x, y);
	}*/
	
	/**
	 * 通过文本定位的方法
	 * @param text 
	 */
	public void clickText(String text){
		UiObject object = new UiObject(new UiSelector().text(text));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 结合文本和index一起定位的方法
	 * @param text
	 * @param index
	 */
	public void clickText(String text,int index){
		UiObject object = new UiObject(new UiSelector().text(text).instance(index));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过文本定位的方法(包含)
	 * @param text
	 */
	public void clickTextContains(String text){
		UiObject object = new UiObject(new UiSelector().textContains(text));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过文本定位的方法(以**开始)
	 * @param text
	 */
	public void clickTextStartsWith(String text){
		UiObject object = new UiObject(new UiSelector().textStartsWith(text));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过文本定位的方法(Matches)
	 * @param regex 
	 */
	public void clickTextMatches(String regex){
		UiObject object = new UiObject(new UiSelector().textMatches(regex));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过ID定位的方法
	 * @param resourceId 
	 */
	public void clickResourceId(String resourceId){
		UiObject object = new UiObject(new UiSelector().resourceId(resourceId));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 拥有相同id的不同控件的获取方法
	 * @param id
	 * @param index
	 * @return
	 */
	public void clickResourceId(String resourceId, int index){
		UiObject object = new UiObject(new UiSelector().resourceId(resourceId).index(index));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 通过ID定位的方法(Matches)
	 * @param regex 
	 */
	public void clickResourceIdMatches(String regex){
		UiObject object = new UiObject(new UiSelector().resourceIdMatches(regex));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过Content Description定位的方法
	 * @param des
	 */

	public void clickDesc(String desc){
		UiObject object = new UiObject(new UiSelector().description(desc));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过Content Description定位的方法
	 * @param des
	 * @param index 
	 */
	public void clickDesc(String desc, int index){
		UiObject object = new UiObject(new UiSelector().description(desc).instance(index));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过Content Description定位的方法(Contains)
	 * @param des
	 */
	public void clickDescContains(String desc){
		UiObject object = new UiObject(new UiSelector().descriptionContains(desc));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过Content Description定位的方法(StartsWith)
	 * @param des
	 */
	public void clickDescStartsWith(String desc){
		UiObject object = new UiObject(new UiSelector().descriptionStartsWith(desc));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过类名定位的方法
	 * @param className 
	 * @return
	 */
	public void clickClass(String className){
		UiObject object = new UiObject(new UiSelector().className(className));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过类名定位的方法
	 * @param className 
	 * @param index 
	 */
	public void clickClass(String className, int index ){
		UiObject object = new UiObject(new UiSelector().className(className).instance(index));
		try {
			object.clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取滚动对象的方法，可以指定水平或者竖直滚动，true表示水平滚动，false表示竖直滚动
	 * className可以定义也可放参数中，本方式使用定义在内容中
	 * @param isHorizontal
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public void scrollClick(boolean isHorizontal, String text) throws UiObjectNotFoundException{
		UiScrollable scrollView = new UiScrollable(new UiSelector().scrollable(true));
		if(scrollView.exists()){
			if (isHorizontal) {
				scrollView.setAsHorizontalList();
			} else {
				scrollView.setAsVerticalList();
			}
			UiObject clickApps = scrollView.getChildByText(new UiSelector().className("android.widget.TextView"), text);
			clickApps.clickAndWaitForNewWindow();		
		}
		else{			
			UiObject clickApps = new UiObject(new UiSelector().className("android.widget.TextView").text(text));
			clickApps.clickAndWaitForNewWindow();
		}
		//UiObject clickApps = scrollView.getChildByText(new UiSelector().className(android.widget.TextView.class.getName()), text);
		//与上面2中方式都可以
	}
	/**
	 * 获取滚动对象的方法，可以指定水平或者竖直滚动，true表示水平滚动，false表示竖直滚动
	 * @param isHorizontal 水平的
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public static UiScrollable getScrollList(boolean isHorizontal) throws UiObjectNotFoundException{
		UiScrollable scrollView = new UiScrollable(new UiSelector().scrollable(true));
		if(isHorizontal)
			scrollView.setAsHorizontalList();
		else
			scrollView.setAsVerticalList();
		return scrollView;
	}
	
	/**
	 * 获取滚动对象下的子对象的方法
	 * @param scrollView
	 * @param text
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public static UiObject scrollToGetChild(UiScrollable scrollView, String text) throws UiObjectNotFoundException{
		return scrollView.getChild(new UiSelector().text(text));
	}

}
