package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	List<WebElement> names = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	for(int i=0;i<prices.size();i++)
	{
		String name = names.get(i).getText();
		String price = prices.get(i).getText().replaceAll("[^0-9]", "");
		int p = Integer.parseInt(price);
		map.put(name, p);
		
	}
	Set<Entry<String, Integer>> set = map.entrySet();
	for(Entry<String, Integer> ab:set)
	{
		String key = ab.getKey();
		Integer value = ab.getValue();
		System.out.println(key + " " + value);
	}
	
	Set<String> k = map.keySet();
	Collection<Integer> v = map.values();
	System.out.println(k + " "+ v);
	
	System.out.println("================");
	
	LinkedList<Integer> productPrice = new LinkedList<Integer>(v);
	Collections.sort(productPrice);
	LinkedList<String> productName = new LinkedList<String>(k);
	System.out.println(productName + "-----" + productPrice);
	
	
		
	}
	}


