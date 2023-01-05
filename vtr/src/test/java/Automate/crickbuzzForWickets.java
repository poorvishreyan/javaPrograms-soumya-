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

public class crickbuzzForWickets {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/51523/9th-match-plunket-shield-2022-23");
		
		List<WebElement> names = driver.findElements(By.xpath("//span[text()='OTG 1st Innings']/following::div[text()='Bowler'][1]/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::a[@class='cb-text-link']"));
		List<WebElement> wickets = driver.findElements(By.xpath("//span[text()='OTG 1st Innings']/following::div[text()='Bowler'][1]/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::div[@class='cb-col cb-col-8 text-right text-bold']"));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<wickets.size();i++)
		{
			String name = names.get(i).getText();
			String wicket = wickets.get(i).getText();
			int w = Integer.parseInt(wicket);
			map.put(name, w);
			
		}
			Set<Entry<String,Integer>> set=map.entrySet();
			for(Entry<String, Integer> entry:set)
			{
			 String key = entry.getKey();
			 Integer value = entry.getValue();
			System.out.println(key+" "+ value);
	
			}
	}

}
