package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://Leaftabs.com/opentaps/control/main");
   driver.manage().window().maximize();
   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
   driver.findElement(By.name("Password")).sendKeys("crmsfa");
   driver.findElement(By.className("decorativeSubmit")).click();
   driver.findElement(By.linkText("CRM/SFA")).click();
   driver.findElement(By.linkText("Leads")).click();
   driver.findElement(By.linkText("Create Lead")).click();
   driver.findElement(By.id("createLeadForm_CompanyName")).sendKeys("TestLeaf");
   driver.findElement(By.id("createLeadForm_FirstName")).sendKeys("Cibi");
   driver.findElement(By.id("createLeadForm_LastName")).sendKeys("Cibi");
   driver.findElement(By.name("submitButton")).click();
   String Text=driver.findElement(By.id("viewLead_company name_cibi")).getText();
   System.out.println("Company Name is:" +Text);
   driver.close();







		

}

}



