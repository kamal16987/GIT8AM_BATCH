package  src.org.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ss\\Swati\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement t1=driver.findElement(By.xpath("//b[text()='Testing']"));
		String s1=t1.getText();
		System.out.println(s1);
		
		
		WebElement t2=driver.findElement(By.xpath("//a[text()='JUnit']"));
		String s2=t2.getText();
		System.out.println(s2);
		
		driver.quit();
}
}

