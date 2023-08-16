package ScriptAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook 
{
	public static void main(String[] args)
	{
			//  1.launch the chrome browser 
			ChromeDriver driver=new ChromeDriver();
			//  2.launch the application url
			driver.get("https://www.facebook.com");
			//  3.maximize the window
			driver.manage().window().maximize();
			//4.add implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// 5. click on create new button
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			// 6. enter first name
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nandhitha");
			//7.enter the last name
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
			//8. enter the mobile no
			driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9941666604");
			//9. enter the new password
			driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("nandhitha@2003");
			//10.select date
			WebElement state =driver.findElement(By.xpath("//select[@id='day']"));
			Select state1=new Select(state); 
			state1.selectByValue("10");
			//11. Select month
			WebElement state2=driver.findElement(By.xpath("//select[@id='month']"));
			Select state3=new Select(state2);
			state3.selectByVisibleText("Jul");
			//select year
			WebElement state4=driver.findElement(By.xpath("//select[@id='year']"));
			Select state5=new Select(state4);
			state5.selectByValue("2003");
			//click on female
			driver.findElement(By.xpath("//label[text()='Female']")).click();
			//close the browser
			driver.close();
			
			
	}

}
