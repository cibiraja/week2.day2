package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opoencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstName")).sendKeys("Cibi");
		driver.findElement(By.id("input-lastName")).sendKeys("Cibi");
		driver.close();
	}

}
