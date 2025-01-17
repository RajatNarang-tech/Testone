package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classone
{
  public static void main(String[] args) throws InterruptedException
  {
	//
	//System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/drivers/chromedriver.exe");
    WebDriver driver;//intalize webdriver variable
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://account.box.com/login");
	//Using Attribute-Based XPath
	driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("abctest539@gmail.com");
	driver.findElement(By.xpath("//button[@id='login-submit']")).click();
	driver.findElement(By.xpath("//input[@id='password-login']")).sendKeys("test@12345");
	driver.findElement(By.xpath("//button[@id='login-submit-password']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='CollapsibleSidebarMenuItem__StyledMenuItemLabel-sc-1fmdq8m-2 dXGbkW bdl-CollapsibleSidebar-menuItemLabel' and text()='All Files']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[contains(text(),'Upgrade Plan')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='More Plans'])[1]")).click();
	//Create Xpath with Partial match with contains:
	Thread.sleep(8000);
	//driver.findElement(By.xpath("//button[contains(@aria-label,'Close Modal')]")).click();
	System.out.println(driver.getTitle());
	driver.quit();
  }
}
