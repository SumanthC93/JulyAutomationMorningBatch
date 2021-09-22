package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9 {
	public static WebDriver driver;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		createuser();
		loginuser1();
		loginuser2();
		loginuser3();
		modifyuser();
		modloginuser1();
		modloginuser2();
		modloginuser3();
		deleteuser();
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
	static void createuser()
	{
		try
		{
			login();
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Issac");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("ANewton");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo1jon@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Raghu123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Raghu123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
	//user2		
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Albert");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("JEinstein");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo23jon@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Raghu123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Raghu123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
	//user3		
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Thomas");
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
	static void loginuser1()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("user1");
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
	static void loginuser2()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("user2");
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
	static void modifyuser()
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
	//	user2	
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("S1234");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("S1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
	//   user3		
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
	//		driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(3000);
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
	//		driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(3000);
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
	//		driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(3000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteuser()
	{
		try
		{
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
	//user2		
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			obj.accept();
			Thread.sleep(2000);	
	//user3		
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
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
