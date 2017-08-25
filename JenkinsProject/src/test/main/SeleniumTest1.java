package test.main;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
	
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\jenkinsworkspace\\JenkinsProject\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.calculator.net/");
		driver.findElement(By.partialLinkText("Mortgage Calculator")).click();
		
	}
	

}
