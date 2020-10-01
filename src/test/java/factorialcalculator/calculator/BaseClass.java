package factorialcalculator.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class BaseClass {

	public String filePath;

	public static void main(String[] args) {
		
		//WebDriver driver1 =  new ChromeDriver();
		//set up chromedriver for automation testing
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aardhya\\Documents\\ChromeDriver\\chromedriver.exe");
			
		//launch chromedriver and navigate to required URL 
		WebDriver driver = new ChromeDriver();
		
		//Create an object of File class to open xlsx file

	  //  File xlsxfile  =  new File("Factorial Calc.xlsx");

	    //Create an object of FileInputStream class to read excel file

	  /*  try {
			FileInputStream inputStream = new FileInputStream(xlsxfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    
	   
	}}
	

	

