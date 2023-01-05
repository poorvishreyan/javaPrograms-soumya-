package Automate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartExcel {

	public static void main(String[] args) throws Throwable {
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
		//}
		
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Sdet37TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(1);
		cell.setCellValue(k);
		Cell cell1 = row.createCell(2);
		cell1.setCellValue(v);
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\Sdet37TestData.xlsx");
		workbook.write(fos);
		}		

	}

}
