package com.test.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nivethaa1Guru99 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/Nivethaa/Documents/chromedriver");
	WebDriver d = new ChromeDriver();
	d.get("https://www.guru99.com");
	System.out.println("SubTopics under Testing : ");
	List<WebElement> e1 = d.findElements(By.xpath("(//ul[@id='java_technologies'])[1]//a"));
	for (WebElement string : e1) {
		System.out.println(string.getText());
	}
	System.out.println("SubTopics under Big data : ");
	List<WebElement> e2 = d.findElements(By.xpath("(//ul[@id='java_technologies'])[10]//a"));
	for (WebElement string : e2) {
		System.out.println(string.getText());
	}
	d.quit();
}
}
