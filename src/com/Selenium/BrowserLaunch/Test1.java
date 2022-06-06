package com.Selenium.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) {
		
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\VIRAT\\eclipse-workspace\\SeleniumMay\\SeleniumFiles1\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
	}

}
