package config;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("pass");
				
	}

}
