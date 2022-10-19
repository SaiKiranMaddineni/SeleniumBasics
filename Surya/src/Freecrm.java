import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Freecrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikiran\\OneDrive\\Desktop\\saim\\Surya\\drive\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
       Thread.sleep(5000);
       driver.manage().window().maximize();
       Thread.sleep(5000);
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       Thread.sleep(5000);
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       Thread.sleep(5000);
       driver.findElement(By.id("login-button")).click();
       
       
      
	}

}
