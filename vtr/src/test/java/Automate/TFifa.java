package Automate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TFifa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get("https://www.fifa.com/");
		
		driver.findElement(By.xpath("//button[text()='Reject All' and @id='onetrust-reject-all-handler']")).click();
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//h5[text()='Women']/ancestor::div[@class='col-12 col-lg-6 ff-mb-64 ff-mb-lg-0']/descendant::div[@class='row_countryContainer__p2ZPi']"));
		List<WebElement> points = driver.findElements(By.xpath("//h5[text()='Women']/ancestor::div[@class='col-12 col-lg-6 ff-mb-64 ff-mb-lg-0']/descendant::div[@class='d-flex align-items-center']"));
		
		ArrayList<String> list = new ArrayList<String>();
		
			
		}
		

	}


