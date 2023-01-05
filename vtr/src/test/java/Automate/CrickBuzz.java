package Automate;

import java.time.Duration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickBuzz {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/51523/9th-match-plunket-shield-2022-23");
		
		
		List<WebElement> names = driver.findElements(By.xpath("//span[text()='OTG 1st Innings']/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::a[@class='cb-text-link']"));
		
		List<WebElement> runs = driver.findElements(By.xpath("//span[text()='OTG 1st Innings']/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::div[@class='cb-col cb-col-8 text-right text-bold'][position()>1]"));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<runs.size();i++)
		{
			String name = names.get(i).getText();
			String run = runs.get(i).getText();
			int r = Integer.parseInt(run);
			map.put(name, r);
		}
		
		Set<Entry<String,Integer>> set = map.entrySet();
		for(Entry<String, Integer> entry:set)
		{
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" = "+" " +value);
		}
		
		System.out.println("==============");
		
		//Iterating Map using keySet()
		Set<String> ks = map.keySet();
		for(String k:ks)
		{
			System.out.println("key ="+" "+k);
		}
		
		
		System.out.println("============");
		
		//Iterating Map using values()
		Collection<Integer> vs = map.values();
		for(Integer v:vs)
		{
			System.out.println("value ="+" "+v);
		}
	}

}
