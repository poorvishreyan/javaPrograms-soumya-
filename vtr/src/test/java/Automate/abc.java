package Automate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.Cookie;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abc {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/51523/9th-match-plunket-shield-2022-23");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> names = driver.findElements(By.xpath("//span[text()='Otago 2nd Innings']/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::a[@class='cb-text-link']"));
		List<WebElement> runs = driver.findElements(By.xpath("(//span[text()='Otago 2nd Innings']/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/descendant::div[@class='cb-col cb-col-8 text-right text-bold'])[position()>1]"));

	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<runs.size();i++)
		{
			String name = names.get(i).getText();
			String run = runs.get(i).getText();
			try {
				int r = Integer.parseInt(run);
				map.put(name, r);
				
			} catch (NumberFormatException e) {
				
			}
			
		System.out.println(map);
		
		Collection value = map.values();
		ArrayList<Integer> list = new ArrayList<Integer>(value);
		Collections.sort(list);
		System.out.println(list);
		
		}
	
	}
	
		
	}

