package com.utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseClass  extends Capabilities{

	static AndroidDriver<AndroidElement> driver=null;
	@BeforeClass

	public void setUp() throws Exception
	{
		driver=Capabilities.connection();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@BeforeMethod

	public static void login()
	{
		driver.findElement(By.xpath("Xyz.View[@content='des'")).click();
		driver.findElement(By.xpath("Xyz.View[@content='Acount'")).click();
		driver.findElement(By.xpath("Xyzt.editText[@index='0'")).sendKeys("xxxx@gmail.com");
		driver.findElement(By.xpath("Xyz.Button[@content-des='Continue'")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("Xyz.editText[@index='2'")).sendKeys("password");
		driver.findElement(By.xpath("Xyz.Button[@content-des='login'")).click();

	}
	
	
	@Test
	
	public static void searchItem() throws IOException
	{
		String product=GetProductName.getItem("TV");
		driver.findElement(By.xpath("Xyzt.editText[@index='0'")).sendKeys(product);
		
	}


}
