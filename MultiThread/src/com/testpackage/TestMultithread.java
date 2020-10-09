package com.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMultithread {
	
	
	public static void main(String[] args) {

		ThreadOne obj1 = new ThreadOne();
		ThreadTwo obj2 = new ThreadTwo();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//obj1.start();
		//try{Thread.sleep(2000);}catch(Exception e) {}
		//obj2.start();
		
		t1.start();
		try{Thread.sleep(2000);}catch(Exception e) {}
		t2.start();
				
	}

}


class ThreadOne implements Runnable
{
	public void run()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspaces\\MultiThread\\MultiThreadSeleniumTest\\src\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.javatpoint.com/");
	driver.manage().window().maximize(); 
	JavascriptExecutor js = (JavascriptExecutor)driver;  
    js.executeScript("scrollBy(0, 5000)");
    driver.findElement(By.linkText("Core Java")).click();
	}
}


class ThreadTwo implements Runnable
{
	public void run()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspaces\\MultiThread\\MultiThreadSeleniumTest\\src\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.javatpoint.com/");
	driver.manage().window().maximize(); 
	JavascriptExecutor js = (JavascriptExecutor)driver;  
    js.executeScript("scrollBy(0, 5000)");
    driver.findElement(By.linkText("EJB")).click();
	}
}