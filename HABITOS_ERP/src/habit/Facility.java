package habit;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Facility {
	
	static WebDriver d;
	static org.apache.log4j.Logger logger;
	
	// Valid User name & Password
	
	@Test
	public void Login_valid() {

		String un = "vivek";
		String pw = "vivek";

		WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
		WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
		WebElement Rme = d.findElement(By.xpath("//*[@id=\"new_kitchen_user\"]/div/div[2]/span/input"));
		WebElement submit = d.findElement(By.name("commit"));

		if (uname.isDisplayed()) 
		
		{
			
			System.out.println("is correct");
		
			logger.info("Verify that if the User Name field is present ");

		} else {

			logger.error("Verify that if the User Name field is present ");

		}

		if (uname.equals(d.switchTo().activeElement())) {

			logger.info("Verify that if the username fields get autofocus");

			uname.sendKeys(un);
			
			uname.sendKeys(Keys.TAB);

		} else {

			logger.error("Verify that if the username fields get autofocus");

		}

		if (pwd.isDisplayed()) {

			logger.info("Verify that if the Password  field is present ");

		} else {

			logger.error("Verify that if the Password  field is present ");

		}

		if (pwd.equals(d.switchTo().activeElement())) {

			logger.info("Verify that if the password fields get focused");

			pwd.sendKeys(pw);

		} else {

			logger.error("Verify that if the password fields get focused");
		}

		
		if (submit.isEnabled()) {
			
			logger.info("Verify that user can able to login the valid credentials");
			
			submit.click();
			
						
		} else {

			logger.error("Verify that user can able to login the valid credentials");
			
		}
		
	}
  
	// Valid Username & Invalid Password
	
	@Test
	public void Login_invalid() {

		String un = "vivek";
		String pw = "vivek kumar";

		logger.info("********** Verify that use can able to login with correct username & incorrect password***********");
		
		WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
		WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
		WebElement Rme = d.findElement(By.xpath("//*[@id=\"new_kitchen_user\"]/div/div[2]/span/input"));
		WebElement submit = d.findElement(By.name("commit"));

		if (uname.isDisplayed()) {

			logger.info("Verify that if the User Name field is present ");

		} else {

			logger.error("Verify that if the User Name field is present ");

		}

		if (uname.equals(d.switchTo().activeElement())) {

			logger.info("Verify that if the username fields get autofocus");

			uname.sendKeys(un);
			
			uname.sendKeys(Keys.TAB);

		} else {

			logger.error("Verify that if the username fields get autofocus");

		}

		if (pwd.isDisplayed()) {

			logger.info("Verify that if the Password  field is present ");

		} else {

			logger.error("Verify that if the Password  field is present ");

		}

		if (pwd.equals(d.switchTo().activeElement())) {

			logger.info("Verify that if the password fields get focused");

			pwd.sendKeys(pw);

		} else {

			logger.error("Verify that if the password fields get focused");
		}

		
		if (submit.isEnabled()) {
			
			
			submit.click();
			

			String url = "http://192.168.1.73:4000";
			
			String curl = d.getCurrentUrl();
			
			if (d.getCurrentUrl().equals(url)) {
				
				logger.info("Verify that if the user can't able to login with correct un & incorrect password");
								
			} else {				

				logger.error("Verify that if the user can't able to login with correct un & incorrect password");
				
			}
									
		} else {

			logger.error("Verify that user can't able to click the submit");
			
		}
		
	}	
	
	
	public void facilitymngmnt() throws InterruptedException {
		
		Thread.sleep(200);

		try {
			

			WebElement collapse = d.findElement(By.id("sidebarCollapse"));
			collapse.click();

			Thread.sleep(500);

			WebElement faclitymanage = d.findElement(By.xpath("//*[@id=\"accordion\"]/div[4]/div[1]/h4/a"));
			faclitymanage.click();

			Thread.sleep(500);

			logger.info("Verify that if click facility management it should collpase to open the menu");

		}
		
		catch (Exception e) {

			logger.error("Verify that if click facility management it should collpase to open the menu");

		}
				
		
		try {
			
			Thread.sleep(200);
			
			WebElement facility = d.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[1]/a"));
			facility.click();
					
			String url = "http://192.168.1.73:3004/kitchens";

			if (d.getCurrentUrl().equals(url)) {

			logger.info("Verify that if click facility menu it should redirect to related screen");
			
		} else {

			logger.error("Verify that if click facility menu it should redirect to related screen");
						
		}
			
		} catch (Exception e) 
		
		{
			
			logger.error("Verify that if click facility menu it should redirect to related screen");

		}
		
		
		// NEW FACILITY
		
		try {
			
			
			WebElement add = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[1]/div[1]/h3/span/a"));
			add.click();
			
			Thread.sleep(200);
			
			logger.info("Verify that if click add new button it should redirect to related screen");
			
			
			// Facility Name
			
			WebElement kname = d.findElement(By.id("kitchen_name"));
			kname.sendKeys("          ");
			Thread.sleep(200);
			
			// Facility Person
			
			WebElement kperson = d.findElement(By.id("kitchen_responsible_person"));
			kperson.sendKeys("          ");
			Thread.sleep(200);
			
						
			// Address
			
			WebElement kaddress = d.findElement(By.id("kitchen_name"));
			kaddress.sendKeys("          ");
			Thread.sleep(200);
			
			
			// Submit
			
			WebElement submit = d.findElement(By.id("enable"));
			submit.click();
			
			
			String url = "http://192.168.1.73:3004/kitchens";
			
			if (d.getCurrentUrl().equals(url)) {
				
				logger.error("Verify that if click submit button by enter empty values it should not allow to create the facility");
					
			} else {

				logger.info("Verify that if click submit button by enter empty values it should not allow to create the facility");
				
			}
									
		} catch (Exception e) {
			
			logger.error("Verify that if click submit button by enter empty values it should not create the facility");
			
		}
		
		// NEW FACILITY_2
		
				try {
					
					
					WebElement add = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[1]/div[1]/h3/span/a"));
					add.click();
					
					Thread.sleep(200);
					
					logger.info("Verify that if click add new button it should redirect to related screen");
					
					
					// Facility Name
					
					WebElement kname = d.findElement(By.id("kitchen_name"));
					kname.sendKeys("Habitos_test");
					Thread.sleep(200);
					
					// Facility Person
					
					WebElement kperson = d.findElement(By.id("kitchen_responsible_person"));
					kperson.sendKeys("Manikandan");
					Thread.sleep(200);
					
								
					// Address
					
					WebElement kaddress = d.findElement(By.id("kitchen_name"));
					kaddress.sendKeys(" 56 c bharathi nagar cbe ");
					Thread.sleep(200);
					
					
					// Submit
					
					WebElement submit = d.findElement(By.id("enable"));
					submit.click();
					
					
					String url = "http://192.168.1.73:3004/kitchens";
					
					if (d.getCurrentUrl().equals(url)) {
						
						logger.info("Verify that if click submit button by enter empty values it should not allow to create the facility");
							
					} else {

						logger.error("Verify that if click submit button by enter empty values it should not allow to create the facility");
						
					}
											
				} catch (Exception e) {
					
					logger.error("Verify that if click submit button by enter empty values it should not create the facility");
					
				}
				
}
			
	
	
		
	/*	@Test
		public void boundary_valus() {

			String un = "vivekamanikandfa q34q1431241mnassdjkf maiandnanf manikandann manikandann ";
			String pw = "vivek kumarkamanikandfa q34q1431241mnassdjkf maiandnanf manik nf manikandann manikan";

		//	logger.info(" Verify that use can able to login with correct username & incorrect password");
			
			WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
			WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
			WebElement Rme = d.findElement(By.xpath("//*[@id=\"new_kitchen_user\"]/div/div[2]/span/input"));
			WebElement submit = d.findElement(By.name("commit"));
			
			if (uname.isDisplayed()) {
				

			//	logger.info("Verify that if the User Name it only allow the maximum character of 25");

			} else {

			//	logger.error("Verify that if the User Name field is present ");

			}

			if (uname.equals(d.switchTo().activeElement())) {

				logger.info("Verify that if the username fields get autofocus");

				uname.sendKeys(un);
				
				logger.info("Verify that if the User Name it only allow the maximum character of 25");
			
				uname.sendKeys(Keys.TAB);

			} else {

				logger.error("Verify that if the username fields get autofocus");

			}

			if (pwd.isDisplayed()) {

			//	logger.info("Verify that if the Password  field is present ");

			} else {

			//	logger.error("Verify that if the Password  field is present ");

			}

			if (pwd.equals(d.switchTo().activeElement())) {

				pwd.sendKeys(pw);
				
				logger.info("Verify that if the User Name it only allow the maximum character of 16");

			} else {

				logger.error("Verify that if the password fields get focused");
			}

	}
  
	*/	
	
	public static void main(String[] args) throws InterruptedException {

		logger = logger.getLogger(" BramHope Website Portal");

		PropertyConfigurator.configure("log4jproperties.txt");

		// DOMConfigurator.configure("logging.xml");

		Facility hts = new Facility();

		hts.beforeTest();
		hts.Login_invalid();
		hts.Login_valid();
		
	
		
		
	}
  
	@BeforeTest
	public void beforeTest() {

		try {

			System.setProperty("webdriver.chrome.driver","..\\HABITOS_ERP\\resources\\chromedriver.exe");

			d = new ChromeDriver();

			logger.info("browser gets open fine");

			Thread.sleep(1000);

			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(500);

		//	d.manage().window().maximize();

			logger.info("if the browser gets correct ip address");
			
			String ip = "http://192.168.1.18:85/";

			d.get(ip);

			logger.info("browser gets valid ip address");

		}

		catch (Exception e) {

			logger.error("isn't working");

			System.out.println("isn't working");

		}

	}

  @AfterTest
  public void afterTest() {
  }

}
