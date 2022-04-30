package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/page/Button.html");
		System.out.println(driver.findElement(By.id("color")).getText());
		System.out.println(driver.findElement(By.id("size")).getSize());
		String webElementColor=driver.findElement(By.id("color")).getCssValue("background_color");
		System.out.println("wwebElement color is" + webElementColor);
		driver.close();
	}
	
	

}
