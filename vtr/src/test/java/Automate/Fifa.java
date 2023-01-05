package Automate;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fifa {

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
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<points.size();i++)
		{
			
			String name = names.get(i).getText();
			String point = points.get(i).getText();
			 try {
				 int p = Integer.parseInt(point);
					map.put(name, p);
				
			} catch (NumberFormatException e) {
				
			}
				
		}	
		
		
		Set<Entry<String,Integer>> set =map.entrySet();
		for(Entry<String, Integer> entry:set)
		{
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+ " "+ value);
		}
		driver.close();

	}
	}


