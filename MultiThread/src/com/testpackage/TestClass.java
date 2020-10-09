package com.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspaces\\MultiThread\\MultiThreadSeleniumTest\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.javatpoint.com/");
		driver.manage().window().maximize(); 
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");
        driver.findElement(By.linkText("Core Java")).click();
	}

}
