package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstcrypage {
	
	WebDriver driver;
	By searchbox=By.xpath("//*[@id=\"search_box\"]");
	
	By boysfashion=By.xpath("/html/body/div[1]/div[8]/div/div/div[1]/ul/li[2]/a");

	By toys=By.xpath("/html/body/div[1]/div[8]/div/div/div[1]/ul/li[5]/a");
	By tshirt=By.xpath("/html/body/div[1]/div[8]/div/div/div[2]/div[3]/div/div/ul[1]/li[3]/a");
	
    

public Firstcrypage(WebDriver driver)
{

this.driver=driver;
}

public void logoTest()
{
	

	boolean logo=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[1]/a/img")).isDisplayed();
	if(logo)
	{
	System.out.println("logo is present");
	}
	else
		System.out.println("logo is not present");

	
}
public void testPresent()

{
String src=driver.getPageSource();
if(src.contains("Support"))
{
	System.out.println("text is present");
	
}
else
{
	System.out.println("text is not present");
}
}
public void titleTest()
{

String actualtitle=driver.getTitle();
System.out.println(actualtitle);
}
public void searchvalue(String toy)
{
	driver.findElement(searchbox).sendKeys(toy);
    driver.findElement(boysfashion).click();

	
  
}

public void setup()
{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 
	WebElement TOYS = driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div/div[1]/ul/li[5]"));
    Actions act=new Actions(driver);
    act.moveToElement(TOYS);
    act.perform();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[8]/div/div/div[2]/div[6]/div/div/ul[1]/li[4]/a")));
	driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div/div[2]/div[6]/div/div/ul[1]/li[4]/a"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)","");
   driver.findElement(toys).click();
  
	
	
}
    	
    	
}
