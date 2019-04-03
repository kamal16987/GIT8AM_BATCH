package com.test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AshokDay5Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok 555\\eclipse-workspace\\Project\\Ashok\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		WebElement a = driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']//ul[@class='menu'][1]"));
		WebElement b = driver.findElement(By.xpath("//div[@style='height: 820px;']//ul[@class='menu'][1]"));
		String A = a.getText();
		String B = b.getText();
		System.out.println(A);
		System.out.println(B);
		driver.close();
		}
}
