package com.test.test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NivethaaGuru99 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/Nivethaa/Documents/chromedriver");
	WebDriver d = new ChromeDriver();
	d.get("https://www.guru99.com");
	List<WebElement> topics = d.findElements(By.xpath("//div [@class='row featured-boxes']//b"));
	for (WebElement string : topics) {
		System.out.println(string.getText());
	}
	d.quit();
}
}
