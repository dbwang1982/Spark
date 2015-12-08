package com.mtbf.test;

public class City extends Country{
	
	String name = "Shijiazhuang";
    String value(String name) {
     System.out.println(super.name);
     super.value("Fail");
     System.out.println(name);
     System.out.println(super.name);
     return name;
   }
 
    public static void main(String[] args) {
       City c=new City();
       c.value("Sucess");
    }

}
