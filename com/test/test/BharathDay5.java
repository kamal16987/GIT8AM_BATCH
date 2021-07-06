package com.test.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BharathDay5 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baru\\Desktop\\git_8am\\GIT8AM_BATCH\\driver\\chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		
		
		List <WebElement> title =  driver.findElements(By.xpath("//div[@class = 'row featured-boxes']//b"));
		
		for (WebElement t : title) {
			String x = t.getText();
			System.out.println(x);
			
			List<WebElement> content = driver.findElements(By.xpath("//div[@class='row featured-box coloumnsize1']//ul[@class = 'menu'][1]"));
			for (WebElement c : content) {
				String c1 = c.getText();
				System.out.println(c1);
				
			}
			
		}
			
		}

}
