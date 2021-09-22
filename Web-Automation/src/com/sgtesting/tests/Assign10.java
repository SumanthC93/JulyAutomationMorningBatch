package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10 {
	public static WebDriver driver;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		createuser1();
		createuser2();
		createuser3();
		loginuser3();
		modpwduser3();
		modloginuser3();
		modpwduser2();
		modloginuser2();
		modpwduser1();
		modloginuser1();
		deleteUser3();
		deleteUser2();
		deleteuser1();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			driver.get("http://localhost:82/user/submit_tt.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser1()
	{
		try
		{
	//login as admin		
			login();
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User1");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("ANewton");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo1jon@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Raghu123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Raghu123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void startActitime()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2()
	{
		try
		{
	//login as user1		
			driver.findElement(By.id("username")).sendKeys("user1");
			driver.findElement(By.name("pwd")).sendKeys("Raghu123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			startActitime();
			Thread.sleep(3000);
	//create user2		
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User2");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("JEinstein");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo23jon@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Raghu123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Raghu123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser3()
	{
		try
		{
	//login as user2		
			driver.findElement(By.id("username")).sendKeys("user2");
			driver.findElement(By.name("pwd")).sendKeys("Raghu123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			startActitime();
			Thread.sleep(3000);
	//create user3		
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User3");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("PEdison");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("Deom3@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Raghu123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Raghu123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			logout();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser3()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("user3");
			driver.findElement(By.name("pwd")).sendKeys("Raghu123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			startActitime();
	//		driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(3000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modpwduser3()
	{
		try
		{
	//login as user2		
			driver.findElement(By.id("username")).sendKeys("user2");
			driver.findElement(By.name("pwd")).sendKeys("Raghu123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
	//modify pwd for user 3	
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("T1234");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("T1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modloginuser3()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("user3");
			driver.findElement(By.name("pwd")).sendKeys("T1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			startActitime();
			Thread.sleep(3000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modpwduser2()
	{
		try
		{
	//login as user1		
			driver.findElement(By.id("username")).sendKeys("user1");
			driver.findElement(By.name("pwd")).sendKeys("Raghu123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			startActitime();
			Thread.sleep(3000);
	//modify pwd for user2	
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("S1234");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("S1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modloginuser2()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("user2");
			driver.findElement(By.name("pwd")).sendKeys("S1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			startActitime();
			Thread.sleep(3000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modpwduser1()
	{
		try
		{
			login();
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("R1234");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("R1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modloginuser1()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("user1");
			driver.findElement(By.name("pwd")).sendKeys("R1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			startActitime();
			Thread.sleep(3000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser3()
	{
		try
		{
	//login as user2		
			driver.findElement(By.id("username")).sendKeys("user2");
			driver.findElement(By.name("pwd")).sendKeys("S1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
		
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=driver.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser2()
	{
		try
		{
	//login as user1		
			driver.findElement(By.id("username")).sendKeys("user1");
			driver.findElement(By.name("pwd")).sendKeys("R1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=driver.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser1()
	{
		try
		{
	//login as admin		
			login();
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=driver.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			driver.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
