package test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Firstcrypage;


public class Firstcrytest{
		WebDriver driver;

			

			@BeforeTest
			public void setFirst()
			{
		

					
					ChromeOptions options=new ChromeOptions();
					driver=new ChromeDriver(options);
					driver.get("https://www.firstcry.com/");
			}
			
			@Test
			public void fstCryhome()
			{
				Firstcrypage ob=new Firstcrypage(driver);
				ob.logoTest();
				ob.testPresent();
				ob.titleTest();
				ob.searchvalue("shirts");
				ob.setup();
			//	ob.scrollDwn();

			
	
}

			
}
