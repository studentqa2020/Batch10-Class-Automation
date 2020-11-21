package com.unit;

import java.io.FileInputStream;

import java.util.Properties;

public class BaseConfig {

public static  String getConfigValue(String value) throws Throwable{

	
String	Filepath="./ConfigProperties";	
FileInputStream fis=new FileInputStream(Filepath);

Properties pro= new Properties();	
pro.load(fis);

return pro.getProperty(value);
}

public static void main(String[] args) throws Throwable {

System.out.println(BaseConfig.getConfigValue("Url"));
System.out.println(BaseConfig.getConfigValue("Email"));
System.out.println(BaseConfig.getConfigValue("Pass"));
}



}
