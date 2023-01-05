package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricubuzzpTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		List<WebElement> names = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		List<WebElement> ratings = driver.findElements(By.xpath("//td[@class='table-body__cell u-text-right rating']"));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<ratings.size()-1;i++)
		{
			String name = names.get(i).getText();
			String rating = ratings.get(i).getText();
			int n = Integer.parseInt(rating);
			map.put(name, n);
		}
		
		Collection<Integer> value = map.values();
		
		ArrayList<Integer> list = new ArrayList<Integer>(value);
		Collections.sort(list);
		System.out.println(list);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> entry:set)
		{
			String key = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(key+"  "+v);
		}
		
	}

}
