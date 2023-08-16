package ScriptAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank 
{
	public static void main(String[] args)
	{
				//  1.launch the chrome browser 
				ChromeDriver driver=new ChromeDriver();
				//  2.launch the application url
				driver.get("https://uibank.uipath.com/register-account");
				//  3.maximize the window
				driver.manage().window().maximize();
				//4.add implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//5. enter the name
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nandhitha");
				//6.select your title
				WebElement state=driver.findElement(By.xpath("//select[@id='title']"));
				Select state1=new Select(state);
				state1.selectByVisibleText("Ms");
				//enter the initial
				driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("R");
				//enter the last name
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ramesh");
				//select gender
				WebElement state2=driver.findElement(By.xpath("//select[@id='sex']"));
				Select state3=new Select(state2);
				state3.selectByVisibleText("Female");
				//select employee status
				WebElement state4=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
				Select state5=new Select(state4);
				state5.selectByVisibleText("Full-time");
				//enter your email address
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("20g113nandhitha@gmail.com");
				//enter the password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nandhitha@2003");
				//close the browser
				driver.close();
	}
}

