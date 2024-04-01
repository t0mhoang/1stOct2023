package variousConcepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//What is Java associated with?
	//Classes
	//Objects

public class LaunchBrowser {
	
	//Class associations
		//Statements
			//class contains methods
			//variables // Attribute(s) // Field
	

	
	public static void main(String[] args) throws InterruptedException {
		
//		Scanner scn = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
}

