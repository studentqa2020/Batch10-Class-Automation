package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {

	public static  String getConfigValue(String value) throws Throwable {

		String path = "./Config.properties";
		FileInputStream fis = new FileInputStream(path);

		Properties obj = new Properties();
		obj.load(fis);

	return obj.getProperty(value);

	}

	public static void main(String[] args) throws Throwable {

		System.out.println(BaseConfig.getConfigValue("pass"));
	}

}
