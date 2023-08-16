package ScriptAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony 
{
	public static void main(String[] args) 
	{
	//  1.launch the chrome browser 
				ChromeDriver driver=new ChromeDriver();
				//  2.launch the application url
				driver.get("https://www.tamilmatrimony.in");
				//  3.maximize the window
				driver.manage().window().maximize();
				//4.add implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//5.select the matrimony profile for yourself
				WebElement state =driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
				Select state1=new Select(state); 
				state1.selectByVisibleText("Myself");
				//enter the name
				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("nandhitha");
				//click on gender
				driver.findElement(By.xpath("//input[@id='genderfemale']")).click();
				//select your date of birth
				WebElement state2 =driver.findElement(By.xpath("//select[@id='DOBDAY']"));
				Select state3=new Select(state2); 
				state3.selectByValue("10");
				WebElement state4 =driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
				Select state5=new Select(state4); 
				state5.selectByVisibleText("July");
				WebElement state6 =driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
				Select state7=new Select(state6); 
				state7.selectByValue("2003");
				//select your religion
				WebElement state8 =driver.findElement(By.xpath("//select[@id='RELIGION']"));
				Select state9=new Select(state8); 
				state9.selectByVisibleText("Hindu");
				//select the mother tongue
				WebElement state10 =driver.findElement(By.xpath("//select[@name='MOTHERTONGUE']"));
				Select state11=new Select(state10); 
				state11.selectByVisibleText("Tamil");
				//select the country
				WebElement country =driver.findElement(By.xpath("//select[@id='COUNTRY']"));
				Select country1=new Select(country); 
				country1.selectByVisibleText("India");
				//enter the mobile no
				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9941666604");
				//enter the email id
				driver.findElement(By.xpath("//input[@name='EMAIL']")).sendKeys("20g113nandhitha@gmail.com");
				//close the browser
				driver.close();
	}

}
