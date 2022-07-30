package habit;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class CRM {
  
	static WebDriver d;
	
	static org.apache.log4j.Logger logger;
	

	// Valid Username & Invalid Password 
		
	@Test
	
		public void Login_invalid() 
		
		{

			String un = "vivek";
			String pw = "vivek kumar";

			logger.info("********** Verify that use can able to login with correct username & incorrect password***********");
			
			WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
			WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
			// WebElement Rme = d.findElement(By.name("remember"));
			WebElement submit = d.findElement(By.name("commit"));

			
			if (uname.isDisplayed()) {

				logger.info("Verify that if the User Name field is present ");

			} else {

				logger.error("Verify that if the User Name field is present ");

			}
			

			if (uname.equals(d.switchTo().activeElement())) {

				logger.info("Verify that if the username fields get autofocus");

				uname.sendKeys("vivek");
				
				uname.sendKeys(Keys.TAB);

			} else {

				logger.error("Verify that if the username fields get autofocus");

			}
			System.out.println("TESTNGINGIN");
			System.out.println("TESTNGINGIN");
			System.out.println("TESTNGINGIN");
 
			System.out.println("TESTNGINGIN");
 
			System.out.println("TESTNGINGIN");
 
			System.out.println("TESTNGINGIN");
 
			if (pwd.isDisplayed()) {

				logger.info("Verify that if the Password  field is present ");

			} else {

				logger.error("Verify that if the Password  field is present ");

			}
			System.out.println("TESTNGINGIN");
			System.out.println("TESTNGINGIN");
			System.out.println("TESTNGINGIN");
			System.out.println("TESTNGINGIN");
			

			if (pwd.isDisplayed()) {

				logger.info("Verify that if the Password  field is present ");

			} else {

				logger.error("Verify that if the Password  field is present ");

			}

			if (pwd.equals(d.switchTo().activeElement())) {

				logger.info("Verify that if the password fields get focused");

				pwd.sendKeys("vivek kumar");

			} else {

				logger.error("Verify that if the password fields get focused");
			}

			
			if (submit.isEnabled()) {
				
				
				submit.click();
				

				String url = "http://192.168.1.73:4000";
				
				String curl = d.getCurrentUrl();
				
				if (d.getCurrentUrl().equals(url)) {
					
					logger.error("Verify that if the user can't able to login with correct un & incorrect password");
									
				} else {				

					logger.info("Verify that if the user can't able to login with correct un & incorrect password");
					
				}
										
			} else {

				logger.error("Verify that user can't able to click the submit");
				
		}
			
		}	

	@Test
	public void Login_valid() throws InterruptedException {

		String un = "vivek";
		String pw = "vivek";

		WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
		WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
	// 	WebElement Rme = d.findElement(By.xpath("//*[@id=\"new_kitchen_user\"]/div/div[2]/span/input"));
		WebElement submit = d.findElement(By.name("commit"));

		if (uname.isDisplayed()) 
		
		{
			
			Thread.sleep(2000);
			
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
  
	/*
		
		// Boundary_Values
		
		@Test
		public void Remeber_me() {

			String un = "vivek";
			String pw = "vivek";

			//	 logger.info(" Verify that use can able to login with correct username & incorrect password");
			
			WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
			WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
			WebElement Rme = d.findElement(By.name("remember"));
			WebElement submit = d.findElement(By.name("commit"));
			
		
			if (uname.equals(d.switchTo().activeElement())) {

				uname.sendKeys(un);
				
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
		
	
	@Test
	public void Crminfo_Add() throws InterruptedException {
				
		logger = logger.getLogger(" Habitos - CRM Info");

		try {
		
			
			//  WebElement collapse = d.findElement(By.id("sidebarCollapse"));
		
			//	  collapse.click();

			Thread.sleep(500);
			
			WebElement crm = d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/a[2]"));
			crm.click();
			
			Thread.sleep(500);

			WebElement crminfo = d.findElement(By.xpath("//*[@id=\"menu1\"]/a[1]"));
			crminfo.click();

			logger.info("Verify that if click CRM info it should redirect to crm info index screen ");

		} catch (Exception e) {

			logger.error("Verify that if click CRM info it should redirect to crm info index screen ");

		}
		
		Thread.sleep(200);

		try {

			WebElement Add = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[1]/div[1]/h3/span/a"));
			Add.click();

			logger.info("Verify that if click add new button it should redirect to add new screen");

		} catch (Exception e) {

			logger.error("Verify that if click add new button it should redirect to add new screen");

		}
		
	}
	
	public void info_add() {

		try {
			
			// customer name

			WebElement cname = d.findElement(By.xpath("//*[@id=\"tenant_name\"]"));

			if (cname.isDisplayed()) {

				cname.sendKeys("Bharathiar Met Hr Sec School CBE");

				logger.info("User can enter the name in name field");

				cname.sendKeys(Keys.TAB);
				
				//d.close();

			} else {

				logger.error("User can't enter the name");

		}

			// Client Type

			WebElement category = d.findElement(By.id("tenant_site_category_id"));

			if (category.isDisplayed()) {

				// category.click();

				Thread.sleep(300);

				category.sendKeys("s");

				logger.info("User can able to select the client type");						
			
		} else {
			
			logger.error("user can't able to select the client type");

		}
		
		// email
			
		WebElement cemail = d.findElement(By.id("tenant_email"));
	
		if (cemail.isDisplayed()) {
			
			cemail.sendKeys("manikandan.rajamanickam@adcltech.com");
				
			cemail.sendKeys(Keys.TAB);
			
			logger.info("User can enter the email id");
			
		} else {

			logger.error("user can't able to enter the email");
			
		}
		
		try {
			
			
			WebElement clogo = d.findElement(By.id("tenant_image_attributes_image_path"));
			
			clogo.sendKeys("C:\\Users\\altius\\Desktop\\images.jpg");
		
			logger.info("Verify that if the customer logo image getting to upload");
			
			
		} catch (Exception e) {
	
			logger.info("Verify that if the customer logo image getting to upload");
	
		}		
		
		
		// Address
		
		WebElement cadd = d.findElement(By.id("tenant_address"));
		if (cadd.isDisplayed()) {

			cadd.sendKeys("56c bharathi park road 2nd cross SB Colony");

			logger.info("User can enter the address in address field");

			cadd.sendKeys(Keys.TAB);

		} else {

			logger.error("user can't able to enter the addresses");

		}

		// facilitys
		
		WebElement cfacility = d.findElement(By.id("tenant_kitchen_id"));
		
		if (cfacility.isDisplayed()) {

		//	cfacility.click();

			Thread.sleep(200);

			cfacility.sendKeys("i");

			logger.info("User can able to select the facilities");

			cfacility.sendKeys(Keys.TAB);

		} else {

			logger.error("user can't able to select the kitchen");

		}
		
		
		// Lat value
		
			WebElement clat = d.findElement(By.id("tenant_latitude"));

			if (clat.isDisplayed())

			{
				clat.sendKeys("11.074820");

				logger.info("user can enter the lat value");

				clat.sendKeys(Keys.TAB);

			} else {

				logger.error("user can't able enter the lat value");

			}
					
	
		// Long Values
			
		WebElement clong = d.findElement(By.id("tenant_longitude"));
		
		if (clong.isDisplayed()) {

			clong.sendKeys("77.002160");

			logger.info("user can enter the longtitue values");

			clong.sendKeys(Keys.TAB);

		} else {

			logger.error("user can't able to enter the longtitude values");

	
		}		
		
		
		/*
		
		// From date
		
		WebElement cfdate = d.findElement(By.id("txtFrom"));		
	
		if (cfdate.isDisplayed()) {

			cfdate.click();

			WebElement cdate = d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a"));

			cdate.click();

			logger.info("user can able to select the from date");

		} else {

			logger.error("user can't able to select the from date");

		}

		
		// To Date
		
		WebElement cldate = d.findElement(By.id("txtTo"));
		
		if (cldate.isDisplayed()) {

			cldate.click();
			
			WebElement cld = d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a"));
			
			cld.click();
			  
			logger.info("Verify that user can able to click the to date");
			
		} else {

			logger.error("Verify that user can able to click the to date");
			
		}
		
		*/
		
		
		// Contact person
		
		WebElement cperson1 = d.findElement(By.id("tenant_contact_person1"));
	
		if (cperson1.isDisplayed()) {
			
			cperson1.click();
			
			cperson1.sendKeys("Manikandan Manickam");
			
			logger.info("Verify that if user can enter the contact person name");
			
		} else {

			logger.error("Verify that if user can enter the contact person name");
			
		}
		
		// contact no
		
		WebElement cmobile= d.findElement(By.id("tenant_phone1"));
		
		
		if (cmobile.isDisplayed()) {
			
			cmobile.click();
			
			cmobile.sendKeys("9360254870");
			
			logger.info("Verify that user can enter the mobile number in mobile field");
						
		} else {

			logger.error("Verify that user can enter the mobile number in mobile field");
			
			}

		}

		catch (Exception e) {

		}

			}
		

	
	@Test
	
	public void Crminfo_Add_meal() throws InterruptedException {

		logger = logger.getLogger(" Habitos - CRM Info");


		// Meal Time
		
		try

		{

			WebElement mtime = d.findElement(By.id("tenant_tenant_details_attributes_0_meal_time"));

			Select time = new Select(mtime);

			time.selectByIndex(1);

			logger.info("Verify that user can able to select the meal time");

		} catch (Exception e) {

			logger.error("Verify that user can able to select the meal time");

		}

		 // Client Category
		
		try {
						
			WebElement mtype = d.findElement(By.id("student_type_"));

			Select type = new Select(mtype);
			
			type.selectByIndex(1);

			logger.info("Verify that user can able to select meal type");

		} catch (Exception e) {

			logger.error("Verify that user can able to select meal type");

		}
		
		// Spread Type 
		
		try {
			
			WebElement stype = d.findElement(By.id("spread_type_"));
			Select studenttype = new Select(stype);	
			studenttype.selectByIndex(2);

			logger.info("Verify that user can able to select Student type");

		} catch (Exception e) {

			logger.error("Verify that user can able to select Student type");

		}

		
		// Total Count
		
		try {
		
			WebElement tcount = d.findElement(By.id("tenant_tenant_details_attributes_0_quantity"));
			
			if (tcount.isDisplayed()) {

				tcount.sendKeys("75");

				logger.info("Verify that user can able to enter the total count");

			} else {
				
										
			}

		} catch (Exception e) {

			logger.error("Verify that user can able to enter the total count");

		}
		
		
		// Consume time
		
		
		try {
			
			WebElement ctime = d.findElement(By.id("tenant_tenant_details_attributes_0_meal_plan"));

			ctime.click();
			
			Thread.sleep(200);

			WebElement counsume = d
					.findElement(By.xpath("//*[@id=\"consuming_time\"]/option[19]"));
			counsume.click();

			logger.info("Verify that user can able to select the consume time");

		} catch (Exception e) {

			logger.info("Verify that user can able to select the consume time");

		}
				

		// Dispatch Time 
		
		try {
			
			WebElement distime = d.findElement(By.id("tenant_tenant_details_attributes_0_dispatch_time"));
			distime.click();

			WebElement dispatch = d
					.findElement(By.xpath("//*[@id=\"consuming_time\"]/option[40]"));
			dispatch.click();

			logger.info("Verify that user can able to select the dispatch time");

		} catch (Exception e) {

			logger.info("Verify that user can able to select the dispatch time");

		}
		
		// Delivery Time
		
		try {
			
			WebElement deltime = d.findElement(By.id("tenant_tenant_details_attributes_0_delivery_time"));
			
			deltime.click();

			WebElement delivery = d
					.findElement(By.xpath("//*[@id=\"delivery_time\"]/option[42]"));
			delivery.click();

			logger.info("Verify that user can able to select the delivery time");

		} catch (Exception e) {

			logger.info("Verify that user can able to select the delivery time");

		}
		
		
		
		// Add Row
		
		try {
			
			WebElement add = d.findElement(By.xpath("//*[@id=\"dashboard-container\"]/div[2]/div[2]/div/div[2]/div/a[2]"));
			
			Thread.sleep(200);
			
			add.click();
			
			logger.info("If click Add button it should create a new row");
			
			
		} catch (Exception e) {
			
			
			logger.error("If click Add button it should create a new row");
						
		}
			
				
		//LUNCH PLANNING
		
			
	// Meal Time
		
		try

		{

			WebElement mtime = d.findElement(By.id("tenant_tenant_details_attributes_1549695103853_meal_time"));

			Select time = new Select(mtime);

			time.selectByIndex(1);

			logger.info("Verify that user can able to select the meal time");

		} catch (Exception e) {

			logger.error("Verify that user can able to select the meal time");

		}
		
		 // Client Category
		
		try {
			
			
			WebElement mtype = d.findElement(By.id("student_type_"));

			Select type = new Select(mtype);
			
			type.selectByIndex(1);

			logger.info("Verify that user can able to select meal type");

		} catch (Exception e) {

			logger.error("Verify that user can able to select meal type");

		}
		
		// Spread Type 
		
		try {
			
			WebElement stype = d.findElement(By.id("spread_type_"));
			
			Select studenttype = new Select(stype);	
			
			studenttype.selectByIndex(1);

			logger.info("Verify that user can able to select Student type");

		} catch (Exception e) {

			logger.error("Verify that user can able to select Student type");

		}

		
		// Total Count
		
		try {
		
			WebElement tcount = d.findElement(By.id("tenant_tenant_details_attributes_0_quantity"));
			
			if (tcount.isDisplayed()) {

				tcount.sendKeys("75");

				logger.info("Verify that user can able to enter the total count");

			} else {
				
										
			}

		} catch (Exception e) {

			logger.error("Verify that user can able to enter the total count");

		}
		
		
		// Consume time
		
		
		try {
			
			WebElement ctime = d.findElement(By.id("consuming_time"));

			ctime.click();
			
			Thread.sleep(200);

			WebElement counsume = d
					.findElement(By.xpath("//*[@id=\"dispatch_time\"]/option[28]"));
			counsume.click();

			logger.info("Verify that user can able to select the consume time");

		} catch (Exception e) {

			logger.info("Verify that user can able to select the consume time");

		}
				

		// Dispatch Time 
		
		try {
			
			WebElement distime = d.findElement(By.id("dispatch_time"));
			distime.click();

			WebElement dispatch = d
					.findElement(By.xpath("//*[@id=\"consuming_time\"]/option[26]"));
			dispatch.click();

			logger.info("Verify that user can able to select the dispatch time");

		} catch (Exception e) {

			logger.info("Verify that user can able to select the dispatch time");

		}
		
		// Delivery Time
		
		try {
			
			WebElement deltime = d.findElement(By.id("delivery_time"));
			
			deltime.click();

			WebElement delivery = d.findElement(By.xpath("//*[@id=\"delivery_time\"]/option[27]"));
			delivery.click();

			logger.info("Verify that user can able to select the delivery time");

		} catch (Exception e) {

			logger.info("Verify that user can able to select the delivery time");

		}
		
		
				
		
		Thread.sleep(500);
		
		WebElement submit = d.findElement(By.name("commit"));
	
		if (submit.isEnabled()) {

			submit.click();

			logger.info("Verify that user can able to click the  submit button");

		} else {

			logger.error("Verify that user can able to click the  submit button");

		}
		
		
		String url = "http://192.168.1.18:4007/tenants";

		d.getCurrentUrl();

		if (url.equals(d.getCurrentUrl())) {

			logger.info("Verify that after creating a new tenent it should redirect to index screen");

		} else {

			logger.error("Verify that after creating a new tenent it should redirect to index screen");

		}
		
		}
	
	public void CRM_update() throws InterruptedException {

		try {

			Thread.sleep(500);

			WebElement srch = d.findElement(By.xpath("//*[@id=\"tenant_filter\"]/label/input"));
			srch.sendKeys("Bharathi");

			Thread.sleep(500);

			WebElement select = d.findElement(By.xpath("//*[@id=\"41\"]/td[2]"));
			select.click();

			Thread.sleep(500);

			WebElement edit = d.findElement(By.id("edit"));

			if (edit.isDisplayed()) {

				edit.click();

				logger.info("User can able to click edit button");

			} else {

				logger.error("User can able to click edit button");

			}

		} catch (Exception e) {

			logger.error("User can able to click edit button");

		}
		
		
		
		Thread.sleep(500);
		
		WebElement cmobile= d.findElement(By.id("tenant_phone1"));
		
		
		if (cmobile.isDisplayed()) {
			
			cmobile.click();
			
			cmobile.clear();		
			
			cmobile.sendKeys("936055290");
			
			logger.info("Verify that user can update the mobile number in mobile field");
						
		} else {

			logger.error("Verify that user can update the mobile number in mobile field");
			
			}
		
		Thread.sleep(500);
		
		WebElement submit = d.findElement(By.name("commit"));
		
		if (submit.isEnabled()) {

			submit.click();

			logger.info("Verify that user can able to click the  submit button");

		} else {

			logger.error("Verify that user can able to click the  submit button");

		}

			
	}
	
	
	public void CRM_view() throws InterruptedException {
		
		try {

			Thread.sleep(500);

			WebElement srch = d.findElement(By.xpath("//*[@id=\"tenant_filter\"]/label/input"));
			srch.sendKeys("Bharathi");

			Thread.sleep(500);

			WebElement select = d.findElement(By.xpath("//*[@id=\"41\"]/td[2]"));
			select.click();

			Thread.sleep(500);

			WebElement show = d.findElement(By.id("show"));

			if (show.isDisplayed()) {

				show.click();

				logger.info("User can able to click show  button");

			} else {

				logger.error("User can able to click show button");

			}

		} catch (Exception e) {

			logger.error("User can able to click show button");

		}
		
		
		try {
			
			Thread.sleep(500);
			
			WebElement mobile = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div/article/div/div/div/div[10]/div"));
			
			String mble = "936055290";
			
			if (mobile.getText().equals(mble)) {
				
				logger.info("Mobile number gets updated successfully");
				
			} else {

				logger.error("Mobile number gets updated successfully");
				
				d.get("http://192.168.1.73:4000/tenants");
				
			}
			
		} catch (Exception e) {
						
			logger.info(e);
		}
		
	}
	
	public void Software_setup() {
		
		logger = logger.getLogger(" Habitos - Software Setup");

		try {
			
		
			Thread.sleep(500);
			
			WebElement crm = d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/a[2]"));
			crm.click();
			
			Thread.sleep(500);

			WebElement setup = d.findElement(By.xpath("//*[@id=\"collapseone\"]/div/ul/li[2]/a"));
			setup.click();

			logger.info("Verify that if click software setup it should redirect to software setup index screen ");

		} catch (Exception e) {

			logger.error("Verify that if click software setup it should redirect to software setup index screen ");

		}
		
		

		// Software Setup Add 
		
		
		try {

			WebElement Addsetup = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[1]/div[1]/h3/span/a"));

			if (Addsetup.isDisplayed()) {

				Addsetup.click();

				String url = "http://192.168.1.18:85/software_setups/new";

				d.getCurrentUrl().equals(url);

				logger.info("if click add setup it should redirect to add setup screen");

			} else {

				logger.error("User can't enter the name");

			}
		}

		catch (Exception e) {

		}		
			
			
		try {

			WebElement customer = d.findElement(By.id("select2-software_setup_user_tenant_id-container"));

			customer.click();

			Thread.sleep(300);

			WebElement srch = d.findElement(By.xpath("/html/body/span/span/span[1]/input"));

			srch.sendKeys("KG");

			WebElement kg = d
					.findElement(By.xpath("//*[@id=\"select2-software_setup_user_tenant_id-result-fmol-41\"]"));
			kg.click();
		
			kg.sendKeys(Keys.TAB);
		
			logger.info("User can able to select the tenant");
								
			} catch (Exception e) {

				logger.error("User can able to select the tenant");
			}
					
			
			// User Name
		
		try {
			
			WebElement name = d.findElement(By.id("software_setup_user_name"));
	
			if (name.isDisplayed()) {
			
				name.sendKeys("Manikandan Rajamanickam");
				
				name.sendKeys(Keys.TAB);
			
			logger.info("User can enter the Name in Name field");
			
		} else {

			logger.error("user can't able to enter the email");
			
		}
			
			WebElement clogo = d.findElement(By.id("tenant_image_attributes_image_path"));
			
			clogo.sendKeys("D:\\habitos\\lft.png");
			
		} catch (Exception e) {
			
	
		}
		
		
		// E - Mail

		try {
			

			WebElement email = d.findElement(By.id("software_setup_user_email"));

			if (email.isDisplayed()) {

				email.sendKeys("manikandan.rajamanickam@adcltech.com");

				email.sendKeys(Keys.TAB);

				logger.info("User can enter the email in email field");

			} else {

				logger.error("User can enter the email in email field");

			}

		}

		catch (Exception e) {

			logger.error("User can enter the email in email field");

		}
			
		
		// Mobile number

		try {

			WebElement mobile = d.findElement(By.xpath("software_setup_user_mobile_number"));

			mobile.isDisplayed();

			mobile.sendKeys("8945458761");

			logger.info("Verify that user can able to enter the mobile number");

		} catch (Exception e) {

			logger.info("Verify that user can able to enter the mobile number");
		}

		
		// Role 

		try {

			WebElement role = d.findElement(By.id("select2-software_setup_user_role_id-container"));

			role.click();

			Thread.sleep(300);

			WebElement srch = d.findElement(By.xpath("/html/body/span/span/span[1]/input"));

			srch.sendKeys("Ad");

			WebElement admin = d.findElement(By.xpath("select2-software_setup_user_role_id-result-2u56-7"));
			admin.click();

			admin.sendKeys(Keys.TAB);

			logger.info("User can able to select the user role");

		} catch (Exception e) {

			logger.error("User can able to select the user role");

		}
		
		
		// User Name 
		
		
		try {
			
			Thread.sleep(500);
			
			WebElement uname = d.findElement(By.id("un"));
			
			uname.sendKeys("manikandan");
			
		logger.info("Verify that user can enter the username in name field");		
			
			
		} catch (Exception e) {
		
			logger.info("Verify that user can enter the username in name field");
		}


	// password
		
		try {
			
			Thread.sleep(500);
			
			WebElement pwd = d.findElement(By.id("software_setup_user_password_digest"));
			
			pwd.sendKeys("manikandan");
			
			logger.info("Verify that user can enter the password in password field");		
		
			
		} catch (Exception e) {
		
			logger.info("Verify that user can enter the password in password field");
		}
		
		
		
		// Submit 
				
		try {
			
			WebElement submit = d.findElement(By.id("enable"));
			
			submit.isEnabled();
			
			submit.click();
			
		} catch (Exception e) {
		
		}

	}	
	
	
	// Software_Setup_View
	
	public void Sw_setup_view() throws InterruptedException {
					
				
       try {
    	   
    		Thread.sleep(500);
    	   
    	   WebElement srch = d.findElement(By.xpath("//*[@id=\"software_setup_filter\"]/label/input"));
			srch.sendKeys("KG");
			
			logger.info("Verify that user can able to enter the key in search box");
			
			Thread.sleep(500);
	    	   
			WebElement clicked = d.findElement(By.xpath("//*[@id=\"3\"]/td[1]"));
			clicked.click();			
			
						
			WebElement show = d.findElement(By.xpath("//*[@id=\"show\"]/i"));
			show.click();	
    	   
			logger.info("If click view button it should redirect to view screen");
			
			Thread.sleep(200);			
			
			
			// Verify the teneant name
			
			WebElement c_name = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div/article/div/div/div/div[1]/div"));
			c_name.getText();
			
			String t_name = "KG Group";
			
			if (c_name.getText().equals(t_name)) {
				

				logger.info("Verify the all fields are haveing the correct values");
					
				
			} else {

				logger.error("Verify the all fields are haveing the correct values");
				
			}
	
			
	} catch (Exception e) {

		logger.error("If click view button it should redirect to view screen");
		
	}
       
       // Back Button click action
       
       try {
    	   
    	  Thread.sleep(200);
    	   
    	   WebElement back = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div/div[2]/a"));
    	   back.click();
    	     	   
    	   Thread.sleep(200);
     	     	   
    	  logger.info("If click back button in view screen it should redirct to index page"); 
		
	} catch (Exception e) {
		
		logger.info("If click back button in view screen it should redirct to index page"); 
				
		d.get("http://192.168.1.18:85/software_setups");
		
		}
       
	}
	
	
		// Software_Setup_Edit
	
		public void Sw_setup_Edit() throws InterruptedException {
						
		try {

			Thread.sleep(500);

			WebElement srch = d.findElement(By.xpath("//*[@id=\"software_setup_filter\"]/label/input"));
			srch.sendKeys("KG");

			logger.info("Verify that user can able to enter the key in search box");

			Thread.sleep(500);

			WebElement clicked = d.findElement(By.xpath("//*[@id=\"3\"]/td[1]"));
			clicked.click();
			
			Thread.sleep(500);

			WebElement edit = d.findElement(By.id("edit"));
			edit.click();

			logger.info("if click edit button it should redirect to edit screen");
			
			
		} catch (Exception e) {
			
			logger.error("if click edit button it should redirect to edit screen");
			
		}

		
		// Mobile number edit
				
		try {
			
			WebElement mobile = d.findElement(By.xpath(""));
			mobile.clear();
			
			Thread.sleep(200);
			
			mobile.sendKeys("8940420111");

			logger.info("User can enter udpate the mobile number in number field");
			
			WebElement submit = d.findElement(By.xpath("commit"));
			
			submit.click();
			
			logger.info("if click submit button the value should be updated");
		
			
		} catch (Exception e) {
			
			logger.error("User can enter udpate the mobile number in number field");
		
		}
		
	}
		
				
		@Test
		public void individual_enrollment() throws InterruptedException {
			
			logger = logger.getLogger(" Habitos - Individual_Enrollment");

			try {
				
				
			//	WebElement collapse = d.findElement(By.id("sidebarCollapse"));
			//	collapse.click();

				Thread.sleep(500);
				
				WebElement crm = d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/a[2]"));
				crm.click();
				
				Thread.sleep(500);

				WebElement ind_enroll = d.findElement(By.xpath("//*[@id=\"collapseone\"]/div/ul/li[3]/a"));
				ind_enroll.click();
				
				String url = "http://192.168.1.18:85/enrol_index";
				
				if (d.getCurrentUrl().equals(url)) {
					

					logger.info("Verify that if click info it should redirect to enrollment index screen");
					
					
				} else {

					logger.error("Verify that if click info it should redirect to enrollment index screen");

				}
						

			} catch (Exception e) {

				logger.error("Verify that if click info it should redirect to crm info index screen ");

			}
		
	
		// File Upload

		try {

			WebElement fileupload = d
					.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[1]/div/div/div/div[2]/button"));
			fileupload.click();

			WebElement popup = d.findElement(By.xpath("//*[@id=\"myModal1\"]/div/div/div"));
			popup.isDisplayed();

			logger.info("if click import sudent detail button it open the pop-up window");

			Thread.sleep(2000);

			WebElement tenant = d.findElement(By.id("enrolment_tenant_id"));
			tenant.click();

			WebElement client = d.findElement(By.xpath("//*[@id=\"enrolment_tenant_id\"]/option[2]"));
			client.click();

			Thread.sleep(1000);

			WebElement file = d.findElement(By.id("enrolment_file1"));
			file.sendKeys("D:\\habitos\\lft.png");

			Thread.sleep(1000);

			WebElement upload = d.findElement(By.xpath("//*[@id=\"new_enrolment\"]/div[1]/div[2]/input[2]"));
			upload.isEnabled();
			Thread.sleep(200);

			upload.click();
			
			logger.info("if click upload button it should upload the enrolment file");
			
						
				
		} catch (Exception e) {

			
			logger.error("if click upload button it should upload the enrolment file");
			
			
		}

	}
			
		
	@Test
	public void view_control() throws InterruptedException {

		logger = logger.getLogger(" Habitos - View Control");

		try {

			Thread.sleep(500);

			WebElement crm = d.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/a[2]"));
			crm.click();

			Thread.sleep(500);

			WebElement viewctrl = d.findElement(By.xpath("//*[@id=\"collapseone\"]/div/ul/li[4]/a"));
			viewctrl.click();

			String url = "http://192.168.1.18:85/customer_view_controls";

			if (d.getCurrentUrl().equals(url)) {

				logger.info("verify that if click view control menu it should redirect to related screen");

			} else {

				logger.error("verify that if click view control menu it should redirect to related screen");

			}

		}

			catch (Exception e) {
				
				logger.error("verify that if click view control menu it should redirect to related screen");

			}
		
		
		}
	
	
	
	@Test
	public void New_view_control() throws InterruptedException {

		logger = logger.getLogger(" Habitos - View Control");
	
		try {
			
			Thread.sleep(200);
			
			WebElement add = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[1]/div[1]/h3/span/a"));
			add.isEnabled();
			
			Thread.sleep(200);
			
			add.click();
			
			String url = "http://192.168.1.18:85/customer_view_controls/new";
			
			
			if (d.getCurrentUrl().equals(url)) {
										
				logger.info("if click add button it should redirect to add screen");
								
			} else {
				
				logger.error("if click add button it should redirect to add screen");
					
			}
			
			Thread.sleep(2000);
			
			// Customer
			
			WebElement customer = d.findElement(By.id("customer_view_control_tenant_id"));
			customer.click();
			
			Thread.sleep(200);
			
			WebElement value  = d.findElement(By.xpath("//*[@id=\"customer_view_control_tenant_id\"]/option[2]"));
			value.click();
			
			// Title 
			
			WebElement title = d.findElement(By.id("customer_view_control_title"));
			title.sendKeys("This month bill attachements");
			
			// Bill1 upload 
			
			Thread.sleep(200);
		
			WebElement file1 = d.findElement(By.id("customer_view_control_billing_upload"));
			file1.sendKeys("D:\\INDESIGN_FILES\\1-900\\1-100\\1000350.pdf");
			
			
			Thread.sleep(200);
			
			WebElement file2 = d.findElement(By.id("customer_view_control_nutrition_upload"));
			file1.sendKeys("D:\\INDESIGN_FILES\\1-900\\1-100\\1001504.pdf");
						
			Thread.sleep(200);
			
			WebElement submit = d.findElement(By.name("commit"));
			submit.isEnabled();
			
			Thread.sleep(200);
			submit.click();
			
			logger.info("if click sumit button the values gets saved and dispalying to index screen");
			
			
			
		} catch (Exception e) {
			
			logger.error("if click add button it should redirect to add screen");
			
			logger.error("if click sumit button the values gets saved and dispalying to index screen");
			
	
		}
			
	}
	
	
	
	@Test
	public void New_view_control_view() throws InterruptedException {

		logger = logger.getLogger(" Habitos - View Control");

		try {

			Thread.sleep(200);
			WebElement srch = d.findElement(By.xpath("//*[@id=\"customer_view_control_filter\"]/label/input"));
			srch.sendKeys("kg");
			
			logger.info("if enter the key in search field it should gets filter the values");
			
			Thread.sleep(200);
			WebElement clickd = d.findElement(By.xpath("//*[@id=\"1\"]"));
			clickd.click();
			
			Thread.sleep(200);
			WebElement show = d.findElement(By.id("show"));
			show.isDisplayed();
			
			Thread.sleep(200);
			show.click();
			
			String url = "http://192.168.1.18:85/customer_view_controls/1";
			
			if (d.getCurrentUrl().equals(url)) {
				
				logger.info("if click view icon it should redirect to related screen");
					
			} else {

				logger.error("if click view icon it should redirect to related screen");
				
			}
			
			Thread.sleep(500);
			
			WebElement cusname = d.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div/article/div/div/div/div[1]/div"));
			String name = "kg groups";
			
			if (cusname.getText().equals(name)) {
				
				logger.info("To verify if the screen contain the values");
				
			} else {

				logger.error("To verify if the screen contain the values");

				
			}
			
			
		} catch (Exception e) {

		}
		
	}
	

	@BeforeTest
	public void beforeTest() {

		try {

			
			Thread.sleep(100);

			System.setProperty("webdriver.chrome.driver", "..//HABITOS_ERP//resources//chromedriver.exe");

			d = new ChromeDriver();

			logger.info("browser gets open");

			Thread.sleep(1000);

			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(500);

		//	d.manage().window().maximize();

			Thread.sleep(200);

			d.get("http://192.168.1.18:4000/");

			logger.info("browser gets valid ip address");

		}

		catch (Exception e) {

		
			System.out.println("Login is not working");

		}

	}
	  
	
	
	@Test
	public static void main(String[] args) throws InterruptedException {

		logger = logger.getLogger(" Habitos - ERP");

		PropertyConfigurator.configure("log4jproperties.txt");

		// DOMConfigurator.configure("logging.xml");

		CRM hts = new CRM();

		System.out.println("first method is running");
		hts.beforeTest();
		
		System.out.println("2nd method is running");
	//	hts.Login_invalid();
		
		System.out.println("3rd method is running");
		hts.Login_valid();
		
		System.out.println("4th method is running");
	//	hts.boundary_valus();
		hts.Crminfo_Add();
		
		System.out.println("5th method is running");
		hts.info_add();
		
		hts.Crminfo_Add_meal();
		
		hts.CRM_update();
		
	}
	

  @AfterTest
  public void afterTest() {
  }

}
