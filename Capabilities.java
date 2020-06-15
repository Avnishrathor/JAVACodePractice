package com.utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	public static AndroidDriver<AndroidElement> connection() throws MalformedURLException {
		
		File f=new File("src");
		File fs=new File(f,"Amazon_shopping.apk");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Avnish");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://192.168.43.85:4723/wd/hub"),cap);
        return driver;
		
	}
	

}



