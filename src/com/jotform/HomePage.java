package com.jotform;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HomePage {
	

	public static void main(String[] args) {
		   WebDriver driver=new ChromeDriver(); 	
		   driver.navigate().to("https://www.jotform.com/form-templates/class-registration-3");
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS) ;
			WebElement firstName= driver.findElement(By.id("first_4"));
			Assert.assertEquals(true,firstName.isDisplayed());
			System.out.println("First Name field is present");
			firstName.sendKeys("Test");	
			
			WebElement middleName= driver.findElement(By.xpath("//input[@id='middle_4']"));
			Assert.assertEquals(true,middleName.isDisplayed());
			System.out.println("Middle Name field is present");
			middleName.sendKeys("demo");
			
			WebElement lastName= driver.findElement(By.xpath("//input[@id='last_4']"));
			Assert.assertEquals(true,lastName.isDisplayed());
			System.out.println("Last Name field is present");
			lastName.sendKeys("Prod"); 
			
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,1200)");
			WebElement Emailid= driver.findElement(By.xpath("/html/body/form/div/ul/li[6]/div/span/input"));
			Assert.assertEquals(true,Emailid.isDisplayed());
			System.out.println("E-mail field is present");
			Emailid.sendKeys("Test@demo.com");
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,500)");
			WebElement Courses= driver.findElement(By.xpath("/html/body/form/div/ul/li[11]/div"));
			Courses.click();
			WebElement Coursesoption= driver.findElement(By.xpath("/html/body/form/div/ul/li[11]/div/select/option[10]"));
			Select select =new Select(Coursesoption);
			String Math101 = select.getFirstSelectedOption().getText();
			Assert.assertEquals("Math101", Math101);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,500)");
			WebElement Submit= driver.findElement(By.xpath("/html/body/form/div/ul/li[11]/div/select/option[10]"));
			Submit.click();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			
			WebElement Studentregform= driver.findElement(By.xpath("/html/body/form/div/ul/li[1]/div/div/h2"));
			Assert.assertEquals(true,Studentregform.isDisplayed());
			System.out.println("Student registration form is present");
			
			
		}
}


