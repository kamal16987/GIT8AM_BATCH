package com.test.test;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AshokDay5Task1 {
	public static void main(String[] args)throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok 555\\eclipse-workspace\\Project\\Ashok\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List<WebElement> a = driver.findElements(By.xpath("//div[@class='row featured-boxes']//b"));
		for (WebElement string : a) {
			System.out.println(string.getText());
		}
		driver.close();
	}
}
