package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditFields {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		String attributevalue=driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("The attribute value is"+attributevalue);
		boolean enabled=driver.findElement(By.xpath("//input[@value='TestLeaf']")).isEnabled();
		System.out.println(enabled);
		boolean disabled=driver.findElement(By.xpath("//input[@disabled='true'")).isEnabled();
		System.out.print(disabled);
		driver.close();
	}
		
	

}
