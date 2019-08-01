package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	static WebDriver driver;
	public static void datepicker(String date) {
		WebElement table = driver.findElement(By.xpath("(//*[@class='rb-monthTable first last'])[2]"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		//iterate
		for (int i = 0; i < tRows.size(); i++) {
			WebElement eachrow = tRows.get(i);
			List<WebElement> tData = eachrow.findElements(By.tagName("td"));
			for (int j = 0; j < tData.size(); j++) {
				String text = tData.get(j).getText();
				System.out.println(text);
				
				if(text.equals(date)) {
					tData.get(j).click();
				}
			}
		}
		}
		public static void click(String name) {
			try {

				driver.findElement(By.xpath(name)).click();
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
		}

	}
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\Table\\dri\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("https://www.redbus.in");
			driver.manage().window().maximize();
			
			
			
			
		click ("//*[text()='Onward Date']");
		datepicker("1");
		}
}
