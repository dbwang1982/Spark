package com.mtbf.test;

public class Country {
	
    String name="China";
    //private String name="China";//不能定义为私有成员变量，否则在子类中就不能玩耍了

    String value(String name) {
    	this.name = name;
    	return this.name;
    }
    
}
