package  src.org.test;


	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Topics {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ss\\Swati\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		List<WebElement> v = driver.findElements(By.xpath("(//b[text()='Testing']//following::ul)[1]"));
		
		for(WebElement web : v)
				{
		            System.out.println(web.getText());

				}
		driver.quit();
}
}
	
	
