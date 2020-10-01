package factorialcalculator.calculator;

import java.io.File;
import java.io.IOException;
import factorialcalculator.calculator.BaseClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FactorialCalc extends BaseClass { 
	
	public static void main(String[] args) {
	
		//set up chromedriver for automation testing
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aardhya\\Documents\\ChromeDriver\\chromedriver.exe");  
				
		//launch chromedriver and navigate to required URL 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
	
		
		//find input box using by.id and the enter input to calculate factorial
		WebElement number = driver.findElement(By.id("number"));
		number.sendKeys("95");
		
		
		//find the calculate button using by.id and then click on element using Actions class
		WebElement calculate = driver.findElement(By.id("getFactorial"));
		Actions act = new Actions(driver);
		act.moveToElement(calculate).click().build().perform();
		
		//Capture the screenshot using TakesScreenshot
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile method
		FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		//driver.close();
		}
}



