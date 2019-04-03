package com.test.test;
import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MeiXpath {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meiyappan\\eclipse-workspace\\facebook\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com");
		List<WebElement> topics = driver.findElements(By.xpath("//div [@class='row featured-boxes']//b"));
		for (WebElement string : topics) {
			System.out.println(string.getText());
		}
		driver.quit();
	}
}
