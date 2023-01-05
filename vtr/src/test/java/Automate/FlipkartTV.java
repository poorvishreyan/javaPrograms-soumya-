package Automate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTV {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("TV");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<names.size();i++)
		{
			String name = names.get(i).getText();
			String price = prices.get(i).getText().replaceAll("[^0-9]", "");
			int p = Integer.parseInt(price);
			map.put(name, p);
		}
		Set<Entry<String,Integer>> set= map.entrySet();
		for(Entry<String, Integer> entry:set)
		{
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k+" "+v);
		}
		
		Set<String> keys = map.keySet();
		Collection<Integer> values = map.values();
		System.out.println(keys+" "+ values);
		ArrayList<Integer> productPrice = new ArrayList<Integer>(values);
		Collections.sort(productPrice);
		
		ArrayList<String> productName = new ArrayList<String>(keys);
		
		System.out.println(productName  + "  " +  productPrice);
		
		Integer highestPrice = productPrice.get(productPrice.size()-1);
		Integer lowestPrice = productPrice.get(0);
		
		System.out.println(highestPrice+" "+lowestPrice);

	}

	
}
