package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\ss\\Swati\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver .get("https://www.guru99.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	WebElement t1=driver.findElement(By.xpath("//b[text()='Testing']"));
	String s1=t1.getText();
	System.out.println(s1);
	
	WebElement t2=driver.findElement(By.xpath("//b[text()='Live Projects']"));
	String s2=t2.getText();
	System.out.println(s2);
	
	WebElement t3=driver.findElement(By.xpath("//b[text()='Performance Testing']"));
	String s3=t3.getText();
	System.out.println(s3);
	
	WebElement t4=driver.findElement(By.xpath("//b[text()='SAP']"));
	String s4=t4.getText();
	System.out.println(s4);
	
	WebElement t5=driver.findElement(By.xpath("//b[text()='Defect Tools']"));
	String s5=t5.getText();
	System.out.println(s5);
	
	WebElement t6=driver.findElement(By.xpath("//b[text()='Enterprise Testing']"));
	String s6=t6.getText();
	System.out.println(s6);
	
	WebElement t7=driver.findElement(By.xpath("//b[text()='AI']"));
	String s7=t7.getText();
	System.out.println(s7);
	
	WebElement t8=driver.findElement(By.xpath("//b[text()='Web']"));
	String s8=t8.getText();
	System.out.println(s8);
	
	WebElement t9=driver.findElement(By.xpath("//b[text()='Test Management']"));
	String s9=t9.getText();
	System.out.println(s9);
	
	WebElement t10=driver.findElement(By.xpath("//b[text()='Big Data']"));
	String s10=t10.getText();
	System.out.println(s10);
	
	WebElement t11=driver.findElement(By.xpath("//b[text()='Must Learn!']"));
	String s11=t11.getText();
	System.out.println(s11);
	
	driver.quit();
	
	
	
}
}
