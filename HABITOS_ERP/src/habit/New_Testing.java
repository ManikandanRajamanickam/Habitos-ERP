package habit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New_Testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d;
		
		System.setProperty("webdriver.chrome.driver", "C:\\MANIKANDAN\\chromedriver_win32\\chromedriver.exe");

		d = new ChromeDriver();

		//	logger.info("browser gets open");

		Thread.sleep(1000);

		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(500);

//		d.manage().window().maximize();

		Thread.sleep(200);

		d.get("http://192.168.1.73:3004/");

		WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
		WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
		//	WebElement Rme = d.findElement(By.xpath("//*[@id=\"new_kitchen_user\"]/div/div[2]/span/input"));
		WebElement submit = d.findElement(By.name("commit"));
		
		Thread.sleep(200);
		
		uname.sendKeys("vivek");

		Thread.sleep(200);

		pwd.sendKeys("vivek");

		Thread.sleep(200);

		submit.click();
		
		Thread.sleep(200);
		
		d.get("http://192.168.1.73:3004/tenants");
		
		Select dropdown = new Select(d.findElement(By.xpath("//*[@id=\"tenant\"]/thead/tr/th[1]")));

	    //Get all options
	    
		List<WebElement> dd = dropdown.getOptions();

	    //Get the length
	    
	    System.out.println(dd.size());

	    // Loop to print one by one
	
	    for (int j = 0; j < dd.size(); j++) {

	    	System.out.println(dd.get(j).getText());

	    }
	}
}
