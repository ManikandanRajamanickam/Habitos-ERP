package habit;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Menuplanner {
  
	WebDriver d;
	static org.apache.log4j.Logger logger;
	
	@Test
	public void Login_valid() {

		String un = "vivek";
		String pw = "vivek";

		WebElement uname = d.findElement(By.id("kitchen_user_user_name"));
		WebElement pwd = d.findElement(By.id("kitchen_user_password_digest"));
		//	WebElement Rme = d.findElement(By.xpath("//*[@id=\"new_kitchen_user\"]/div/div[2]/span/input"));
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
/*
	@Test
	public void Category() {

		try {

			Thread.sleep(200);

			d.get("http://192.168.1.73:4000/site_categories");

			WebElement tbody = d.findElement(By.xpath("//*[@id=\"sitelist\"]/tbody"));

			String t = tbody.getText().toString();

			System.out.println(t);

		} catch (Exception e) {

			System.out.println(e);

		}

	}

*/
	
	@Test

	public void Menu_planner()

	{

		try {

			Thread.sleep(200);

			WebElement master = d.findElement(By.id("sidebarCollapse"));

			master.click();

			logger.info("Verify  that if click master menu it getting to collapse");

			WebElement m_planner = d.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/a[6]"));

			m_planner.click();

			Thread.sleep(2000);
			
			WebElement urls = d.findElement(By.xpath("//*[@id=\"menu4\"]/a[4]"));
			urls.click();		
			
			Thread.sleep(2000);
						
			String url = "http://192.168.1.18:4000/normalmenu_sites/new_menu_planner";
			
			
			if (d.getCurrentUrl().equals(url)) {

				logger.info("Verify that if click menu planner menu it should redirect to menu planner screen");

			} else {

				logger.error("Verify that if click menu planner menu  it should redirect to menu planner screen");
			}
		
			} catch (Exception e) {

			logger.error("Verify  that if click master menu it getting to collapse");
		}

	}
		
	// MENU PLANNING

	public void Menu_planner_plan()

	{

		try {

			// PLAN NAME Focus

			Thread.sleep(10000);
			
			WebElement focus =  d.findElement(By.xpath("/html/body/div/div/section/div/div/div[2]/div[2]/div[1]/div/input"));
								
			if (focus.equals(d.switchTo().activeElement())) {
				
				logger.info("Verify that if the plan name field is focus");
								
			} else {
				
				logger.error("Verify that if the plan name field is focus");
							
			}
			
		}
			catch (Exception e) {
									
			}
			
		
		// PLAN NAME

		try {

			Thread.sleep(2000);

			WebElement p_name = d
					.findElement(By.xpath("/html/body/div/div/section/div/div/div[2]/div[2]/div[1]/div/input"));

			p_name.sendKeys("Bharathi Plan Feb 26 to 28");
			
			
			p_name.sendKeys(Keys.TAB);
			
			logger.info("user can enter the plan name in input field");

		} catch (Exception e) {

			logger.error("user can enter the plan name in input field");

		}
		
		// Assign date
		
	try {
		
			
		WebElement date = d.findElement(By.xpath("/html/body/div/div/section/div/div/div[2]/div[2]/div[2]/div/input"));

		date.click();

		Thread.sleep(200);
		
		date.sendKeys("26/02/19");
		
		
		date.sendKeys(Keys.TAB);
		
		
		// Create object of SimpleDateFormat class and decide the format
/*				
		d.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
			d.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();

			logger.info("user can select the  current date in date field");
*/
		} catch (Exception e) {

			logger.error("user can select the  current date in date field");

		}
		
		
		// Plan for No of Days Selection
		
		try {
			
			WebElement days = d.findElement(By.id("no_of_days"));
			
			Select type = new Select(days);
			
			type.selectByIndex(1);

			logger.info("User can assign no of days");
			
			
		} catch (Exception e2) {
			
			logger.error("User can assign no of days");
					
		}
		
		}
				
		
	// Break Fast
	
	
	public void Breakfast() {
		
		try {
		
			Thread.sleep(200);
			
			WebElement bfast = d.findElement(By.xpath("//*[@id=\"heading1\"]/h5/button"));
			bfast.isDisplayed();
			
			bfast.click();
			
			logger.info("Verify that if the break fast meal course is present");
			
		} catch (Exception e) {
					
			logger.error("Verify that if the break fast meal course is present");
		
		}
		
		// MEAL PLAN
		
		try {
					
			WebElement row = d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/button"));
			
			row.click();	
								
			logger.info("if click add row button it should create the meal course add rows");
			
		} catch (Exception e) {
		
			logger.error("if click add row button it should create the meal course add rows");

		}		
		
		
		// MEAL _ CATEGORY
		
		try {
			
			
			Thread.sleep(500);
					
			WebElement row1_cat  = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[1]"));
			
			row1_cat.click();
			
			WebElement re_cat = d.findElement(By.xpath("//*[@id=\"category\"]/div/div[1]/input[1]"));
			re_cat.sendKeys("Desserts");
			
			Thread.sleep(200);
			re_cat.sendKeys(Keys.ENTER);
						
			Thread.sleep(200);
			
			String category = "Desserts";
			
			WebElement cate = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[1]"));
			
			cate.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can able to select the meal category");
							
		}
		
		
		// MEAL - RECEPIE
			
		
		try {
			
			WebElement recepie  = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[1]"));
			
			recepie.click();
			
			WebElement dal = d.findElement(By.xpath("//*[@id=\"reciperecipe\"]/div/div[1]/input[1]"));
			
			dal.sendKeys("Dal Pay");
			
			dal.sendKeys(Keys.ENTER);
		
			Thread.sleep(200);
		
			String category = "Dal Payasam";
			
			WebElement cate = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[1]"));
			
			cate.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can able to select the meal category");
							
		}
				
		
		

		try {
					
			WebElement row = d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/button"));
			
			row.click();	
								
			logger.info("if click add row button it should create the meal course add rows");
			
		} catch (Exception e) {
		
			logger.error("if click add row button it should create the meal course add rows");

		}		
		
	
		
	// 2ND PLAN
		
		
	// MEAL _ CATEGORY
		
		try {
						
			Thread.sleep(500);
								
			WebElement row1_cat  = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[2]"));
			
			row1_cat.click();
			
			Thread.sleep(200);
			
			WebElement re_cat = d.findElement(By.xpath("//*[@id=\"category\"]/div/ul/li[2]/a"));
		
			re_cat.click();
			
			Thread.sleep(200);
			
		//	re_cat.sendKeys(Keys.ENTER);
						
			Thread.sleep(200);
			
			String category = "Main Course";
			
			WebElement cate = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[2]"));
			
			cate.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can able to select the meal category");
							
		}
		
		
		// MEAL - RECEPIE
			
		
		try {
			
			WebElement recepie  = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[2]"));
			
			recepie.click();
			
			WebElement dala = d.findElement(By.xpath("//*[@id=\"reciperecipe\"]/div/ul/li[2]/a"));
			
			dala.click();
			
			Thread.sleep(200);
		
			String category = "Coriander Rice";
			
			WebElement catea = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[2]"));
			
			catea.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can able to select the meal category");
							
		}
		
		// CHECK BOX
		
		try {

			WebElement check = d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/table/thead/tr/th/label/input"));

			check.isEnabled();

			Thread.sleep(200);

			check.click();

			logger.info("User can able to select the check box");

		} catch (Exception e) {

			logger.error("User can able to select the check box");

		}		
										
	} 
		
	
	public void Lunch() {
	
		try {
			
			Thread.sleep(200);
			
			WebElement lunch = d.findElement(By.xpath("//*[@id=\"heading0\"]/h5/button"));
			lunch.isDisplayed();
			
			lunch.click();
			
			logger.info("Verify that if the Lunch  meal course card  is present");
			
		} catch (Exception e) {
					
		
			logger.error("Verify that if the Lunch  meal course card  is present");
		
		}
		
		// MEAL PLAN
		
		try {
					
			WebElement row = d.findElement(By.xpath("//*[@id=\"collapse0\"]/div/button"));
			
			row.click();	
								
			logger.info("if click add row button it should create the meal course add rows");
			
		} catch (Exception e) {
		
			logger.error("if click add row button it should create the meal course add rows");

		}		
		
		
		// MEAL _ CATEGORY
		
		try {
			
			
			Thread.sleep(500);
					
			WebElement row1_cat  = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[1]"));
			
			row1_cat.click();
			
			WebElement re_cat = d.findElement(By.xpath("//*[@id=\"category\"]/div/div[1]/input[1]"));
			re_cat.sendKeys("Indian");
			
			Thread.sleep(200);
			
			re_cat.sendKeys(Keys.ENTER);
						
			Thread.sleep(200);
			
			String category = "Indian Gravy";
			
			WebElement cate = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[1]"));
			
			cate.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can't able to select the meal category");
							
		}
		
		
		// MEAL - RECEPIE
			
		
		try {
			
			WebElement recepie  = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[1]"));
			
			recepie.click();
			
			WebElement dal = d.findElement(By.xpath("//*[@id=\"reciperecipe\"]/div/div[1]/input[1]"));
			
			dal.sendKeys("Dal Pay");
			
			dal.sendKeys(Keys.ENTER);
		
			Thread.sleep(200);
		
			String category = "Paneer Makhani";
			
			WebElement cate = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[1]"));
			
			cate.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can able to select the meal category");
							
		}
				
		

		try {
					
			WebElement row = d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/button"));
			
			row.click();	
								
			logger.info("if click add row button it should create the meal course add rows");
			
		} catch (Exception e) {
		
			logger.error("if click add row button it should create the meal course add rows");

		}		
			
		
	// 2ND PLAN
		
		
	// MEAL _ CATEGORY
		
		try {
						
			Thread.sleep(500);
								
			WebElement row1_cat  = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[2]"));
			
			row1_cat.click();
			
			Thread.sleep(200);
			
			WebElement re_cat = d.findElement(By.xpath("//*[@id=\"category\"]/div/ul/li[6]/a"));
		
			re_cat.click();
			
			Thread.sleep(200);
			
		//	re_cat.sendKeys(Keys.ENTER);
						
			Thread.sleep(200);
			
			String category = "Main Course";
			
			WebElement cate = d.findElement(By.xpath("(//*[@id=\"category\"]/a)[2]"));
			
			cate.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can able to select the meal category");
							
		}
		
		
		// MEAL - RECEPIE
			
		
		try {
			
			WebElement recepie  = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[2]"));
			
			recepie.click();
			
			WebElement dala = d.findElement(By.xpath("//*[@id=\"reciperecipe\"]/div/ul/li[1]/a"));
			
			dala.click();
			
			Thread.sleep(200);
		
			String category = "Peanut Salad";
			
			WebElement catea = d.findElement(By.xpath("(//*[@id=\"reciperecipe\"]/a)[2]"));
			
			catea.getText().equals(category);		
			
			logger.info("Verify that user can able to select the meal category");
						
			
		} catch (Exception e) {
		
			logger.error("Verify that user can able to select the meal category");
							
		}
		
		// CHECK BOX
		
		try {

			WebElement check = d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/table/thead/tr/th/label/input"));

			check.isEnabled();

			Thread.sleep(200);

			check.click();

			logger.info("User can able to select the check box");

		} catch (Exception e) {

			logger.error("User can able to select the check box");

		}	
	
		
	}
	
	
	
		public void Menu_plan_client() {
		
				
		// Client Type_School

		try {

			WebElement corporate = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[2]/div[1]/div/ul"));

			String text = corporate.getText().toString();

			System.out.println(text);
						
			WebElement client = d
					.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[2]/div[1]/div/ul/li[2]/label/span"));

			if (client.isDisplayed()) {

				client.click();

				logger.info("user can able to select the client");

			} else {

				logger.error("user can able to select the client");
			}
								
				logger.info("verify that if click corporate ratio button it should active");

			} catch (Exception e) {

				logger.error("verify that if click corporate ratio button it should active");

			}
				
		// CLIENT CATEGORY    
 
		try {
			

			WebElement meal_course = d
					.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[2]/div[2]/div/ul"));

			String mcourse = meal_course.getText().toString();

			System.out.println(mcourse);
			
			String mc1 = "Primary";
			String mc2 = "Seconday";
			
			WebElement secondary  = d
					.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[2]/div[2]/div/ul/li[2]/label/span"));

			if (secondary.isDisplayed()) {
								
				secondary.click();
				
				logger.info("If the user can able to select the Client category option");
				
			} else {
				
				logger.error("If the user can able to select the Client category option");
				
				}
			
		}
		
		catch (Exception e) {

			logger.error("user can't able to select the client category");
		
		}
		
				
		// Spread Type
			
		try {

			Thread.sleep(200);

			WebElement spread = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[3]/div/div/ul/li[2]/label/span"));
			
			if (spread.isDisplayed()) {
				
			spread.click();

			logger.info("User can able to select the spread type");
				
			} else {
				
				logger.error("User can able to select the spread type");
				
			}
			
		} catch (Exception e) {

			logger.error("Veify that if cilck 5 spread it getting to select");

		}

		
		// Meal Course
		
		try {
			
			Thread.sleep(200);
			
			WebElement brk = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[4]/div/div/div/button"));
			
			brk.click();
			
			Thread.sleep(200);
			
			WebElement mtime = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[4]/div/div/div/div/ul/li[2]/a"));
			mtime.click();
			
			Thread.sleep(200);
			
			WebElement close = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[4]/div/div/div/button"));
			close.click();
			
			Thread.sleep(200);
			
			logger.info("Verify that user can able to select the meal course");	
			
		} catch (Exception e) {
			
			logger.error("Verify that user can able to select the meal course");	
						
		}
		

		// Assign Client

		try {

			Thread.sleep(200);

			WebElement assign = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[5]/div/div/ul/li/label"));

			String ass = "Bharathiar Met Hr Sec School CBE - Breakfast";
				
			if (assign.getText().equals(ass)) {
			
				logger.info("User can able to fileter the tenants");
			
				WebElement check = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[5]/div/div/ul/li/label/input"));
				
				check.click();
				
			} else {

				logger.error("User can able to fileter the tenants");
								
			}
						
		} catch (Exception e) {

			logger.error("User can able to fileter the tenants");
			
		}
		
		// ASSIGN
		
		try {
		
			WebElement assign = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/button"));
			
			if (assign.isEnabled()) {
				
				assign.click();
				
				logger.info("Verify that whether the assign button is enabled or not");
		
				
			} else {
				
				logger.error("Verify that whether the assign button is enabled or not");
			}
						
		} catch (Exception e) {

			logger.error("Verify that whether the assign button is enabled or not");
					
		} 
		
		}
		
		
 					
		// MENU CYCLE
			
		public void menu_cycle() {
		
			try {
				
				WebElement srch = d.findElement(By.xpath("//*[@id=\"menu_cycle_filter\"]/label/input")); 
				
				srch.sendKeys("Bharathi Plan Feb 26 to 28");
				
				Thread.sleep(100);
				
				WebElement edit = d.findElement(By.xpath("//*[@id=\"menu_cycle\"]/tbody/tr[1]/td[4]/a"));
				edit.click();
				
				Thread.sleep(100);
				
				logger.info("verify that user can able to click edit button");
				
			} catch (Exception e) {
								
				logger.error("verify that user can able to click edit button");
				
			}
					
		}
		

		

		
	// MENU CYCLE

	public void menu_cycle_plan() {

		// sub plan name

		try {

			WebElement sub_plan = d.findElement(By.id("header_0"));

			sub_plan.isDisplayed();

			sub_plan.click();

			Thread.sleep(200);

			WebElement open = d.findElement(By.xpath("//*[@id=\"client_0\"]/div"));

			open.isDisplayed();

			logger.info("Verify that if should open the card while clicking the plan name");

		} catch (Exception e) {

			logger.error("Verify that if should open the card while clicking the plan name");

		}
			
	// Tenant Click action
			
		try { 

			Thread.sleep(2000);

			WebElement tenant1 = d.findElement(By.xpath("//*[@id=\"client_0\"]/div/div[1]/label/span"));

			tenant1.isDisplayed();
					
			tenant1.click();

			Thread.sleep(1000);
			
			WebElement breakfast = d.findElement(By.id("collapse1"));
			
			breakfast.isDisplayed();
			
			breakfast.click();
			
			logger.info("verify that if click break fast meal course it should open the particular card");

		} catch (Exception e) {

			logger.error("verify that if click break fast meal course it should open the particular card");

		}
		
		
		// DATE ASSIGN
		
		try {
		
			WebElement date  = d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/table/thead/tr/th[1]/label/span/a"));
			
			date.isDisplayed();
			
			date.click();
			
			Thread.sleep(200);
			
			WebElement currentdate = d.findElement(By.className("btn btn-default btn-sm active"));
			
			currentdate.click();
			
			logger.info("verify that user can select the current date");
						
			
		} catch (Exception e) {
		
				
			logger.error("verify that user can select the current date");
				
			
		}
	
		
		// Check Box checking
		
		try {

			WebElement check = d
					.findElement(By.xpath("//*[@id=\"collapse0\"]/div/div/table/thead/tr/th[1]/label/input"));

			if (!check.isSelected()) {

				check.click();

				logger.info("Verify that user can able to select the check box");

			} else {

				check.click();

				logger.info("Verify that user can able to selected the check box");

			}

		} catch (Exception e) {

			logger.error("Verify that user can't able to select the check box");

		}
		
		
		// Check box clicking
		
		try {

			WebElement nxtdate = d
					.findElement(By.xpath("//*[@id=\"collapse0\"]/div/div/table/thead/tr/th[2]/label/input"));

			if (!nxtdate.isSelected()) {

				nxtdate.click();

				logger.info("Verify that user can able to check the select all option");

			} else {

				nxtdate.click();

			}

		} catch (Exception e) {

			logger.error("Verify that user can able to check the select all option");

		}
		
		
		// Check box clicking
		
		try {

			WebElement nxtdate1 = d
					.findElement(By.xpath("//*[@id=\"collapse0\"]/div/div/table/thead/tr/th[3]/label/input"));

			if (!nxtdate1.isSelected()) {

				nxtdate1.click();

				logger.info("Verify that user can able to check the select all option");

			} else {

				nxtdate1.click();

			}

		} catch (Exception e) {

			logger.error("Verify that user can able to check the select all option");

		}
		
		
		// TENANT UPDATE
		
		try {
			
			
			WebElement  check = d.findElement(By.xpath("//*[@id=\"client_0\"]/div/div[1]/label/input"));
			
			if (!check.isSelected()) {
				
				System.out.println("check box isn't selected");
			
				check.click();
			
				logger.info("verify that if the check box is checked or not");
				
			} else {

				check.click();
		
			}
			
		} catch (Exception e) {
			
			logger.error("verify that if the check box is checked or not");
			
		}
			
		//  Tenant Update _ 2
				
		try { 

			Thread.sleep(2000);

			WebElement tenant2 = d.findElement(By.xpath("//*[@id=\"client_0\"]/div/div[2]/label/span"));

			tenant2.isDisplayed();
					
			tenant2.click();

			Thread.sleep(1000);
			
			WebElement lunch = d.findElement(By.id("collapse0"));
			
			lunch.isDisplayed();
			
			lunch.click();
			
			logger.info("verify that if click Lunch meal course it should open the particular card");

		} catch (Exception e) {

			logger.error("verify that if click Lunch meal course it should open the particular card");

		}
		
		
		// DATE ASSIGN TENANT 2
		
		
		try {
			
			WebElement date  = d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/table/thead/tr/th[1]/label/span/a"));
			
			date.isDisplayed();
			
			date.click();
			
			Thread.sleep(200);
			
			WebElement currentdate = d.findElement(By.className("btn btn-default btn-sm active"));
			
			currentdate.click();
			
			logger.info("verify that user can select the current date");
						
			
		} catch (Exception e) {
		
				
			logger.error("verify that user can select the current date");
				
			
		}
		
		
		
	// Check Box checking
		
		try {

			WebElement check = d
					.findElement(By.xpath("//*[@id=\"collapse0\"]/div/div/table/thead/tr/th[1]/label/input"));

			if (!check.isSelected()) {

				check.click();

				logger.info("Verify that user can able to select the check box");

			} else {

				check.click();

				logger.info("Verify that user can able to selected the check box");

			}

		} catch (Exception e) {

			logger.error("Verify that user can't able to select the check box");

		}
		
		
		// Check box clicking
		
		try {

			WebElement nxtdate = d
					.findElement(By.xpath("//*[@id=\"collapse0\"]/div/div/table/thead/tr/th[2]/label/input"));

			if (!nxtdate.isSelected()) {

				nxtdate.click();

				logger.info("Verify that user can able to check the select all option");

			} else {

				nxtdate.click();

			}

		} catch (Exception e) {

			logger.error("Verify that user can able to check the select all option");

		}
		
		
		// Check box clicking
		
		try {

			WebElement nxtdate1 = d
					.findElement(By.xpath("//*[@id=\"collapse0\"]/div/div/table/thead/tr/th[3]/label/input"));

			if (!nxtdate1.isSelected()) {

				nxtdate1.click();

				logger.info("Verify that user can able to check the select all option");

			} else {

				nxtdate1.click();

			}

		} catch (Exception e) {

			logger.error("Verify that user can able to check the select all option");

		}
		
		
	// TENANT UPDATE _ 2
		
		try {
			
			WebElement  check1 = d.findElement(By.xpath("//*[@id=\"client_0\"]/div/div[2]/label/input"));
			
			if (!check1.isSelected()) {
				
				System.out.println("Check box isn't selected");
			
				check1.click();
			
				logger.info("verify that if the check box is checked or not");
				
				Thread.sleep(200);
				
				WebElement update = d.findElement(By.xpath("//*[@id=\"client_0\"]/div/div[2]/button"));
				
				update.isDisplayed();
				
				update.click();
					
			} 
			
			else {

				check1.click();
		
			}
			
		} catch (Exception e) {
			
			logger.error("verify that if the check box is checked or not");
			
		}
		
		
		// Alert Handling
		
		try {
		
			d.switchTo().alert().accept(); 
			
		} catch (Exception e) {
		
			logger.error(e);
		
		}
	
	}
		
	// Cook Sheet
	
	public void CookSheet() {
		
		try {
			
			WebElement cook = d.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div[6]/div/a[2]"));
			cook.isDisplayed();
			Thread.sleep(200);
			cook.click();
			
			WebElement data = d.findElement(By.xpath("/html/body/div[1]/div/section/div[1]/div[3]"));
			String values = data.getText().toString();
			
			Thread.sleep(200);
			
			System.out.println(values);
		
			logger.info("Verify that if the cook sheet contain the values");
						
		} catch (Exception e) {
			
			logger.error("Verify that if the cook sheet contain the values");
			
		}
			
	}
	
	
	@Test
		
		public static void main(String[] args) throws InterruptedException {

			logger = logger.getLogger(" Habitos - ERP");

			PropertyConfigurator.configure("log4jproperties.txt");

			//   DOMConfigurator.configure("logging.xml");

			Menuplanner hts = new Menuplanner();

			
			System.out.println("first method is running");
			hts.beforeTest();
			
			System.out.println("3rd method is running");
			hts.Login_valid();
			
			//		hts.Category();
							
			System.out.println("2nd method is running");
			hts.Menu_planner();
			
			System.out.println("4th method is running");
		
			//	hts.boundary_valus();
			hts.Menu_planner_plan();
			
			System.out.println("5th method is running");
			hts.Breakfast();
						
			hts.Menu_plan_client();
				
			hts.menu_cycle();
	
		}
	  

  @BeforeTest
  public void beforeTest() {
	 
	  try {

			
			Thread.sleep(100);

			System.setProperty("webdriver.chrome.driver", "C:\\MANIKANDAN\\chromedriver_win32\\chromedriver.exe");

			d = new ChromeDriver();

			logger.info("browser gets open");

			Thread.sleep(1000);

			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Thread.sleep(500);

			d.manage().window().maximize();

			Thread.sleep(200);

			d.get("http://192.168.1.18:4000/");

			logger.info("browser gets valid ip address");

		}

		catch (Exception e) {

		System.out.println("Login is not working");

		}

	}

	@AfterTest
	public void afterTest() {
	}

}
