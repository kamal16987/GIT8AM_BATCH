package com.test.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VickeybalaXpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Day4\\GIT8AM_BATCH\\Git_8AM-Batch\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.guru99.com/");
	List<WebElement> list = driver.findElements(By.tagName("b"));
	
	for (WebElement x : list) {
		System.out.print("\t"+ x.getText());
	}
	
	Thread.sleep(3000);
	List<WebElement> list2 = driver.findElements(By.xpath("(//ul[@class='menu'])[1]"));
	
	for (WebElement y : list2) {

		System.out.println();
		System.out.println(y.getText());
	}
	
	}

}
