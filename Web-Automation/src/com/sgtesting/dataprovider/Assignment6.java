package com.sgtesting.dataprovider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment6 {
	public static WebDriver driver;
	@Test(priority=1)
	public void launchBrowser()
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
	@Test(priority=2)
	public void navigate()
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
	@Test(priority=3)
	public void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4,dataProvider="getcreateUser")
	public void createuser(String a,String b,String c,String d,String f,String g)
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(a);
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(b);
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys(c);
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(d);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(f);
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(g);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getcreateUser()
	{
		return new Object[][] {{"Issac","ANewton","demo1jon@gmail.com","user1","Raghu123","Raghu123"},
			{"Albert","JEinstein","demo23jon@gmail.com","user2","Raghu123","Raghu123"},
			{"Thomas","PEdison","Deom3@gmail.com","user3","Raghu123","Raghu123"}};
	}
	@Test(priority=5)
	public void logout()
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
	public void startActitime()
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
	@Test(priority=6,dataProvider="getLoginUser")
	public void loginuser(String username,String pwd)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
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
	@DataProvider
	public Object[][] getLoginUser()
	{
		return new Object[][] {{"user1","Raghu123"},{"user2","Raghu123"},{"user3","Raghu123"}};
	}
	@Test(priority=7)
	public void modifyuser()
	{
		try
		{
			login();
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("R1234");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("R1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
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
	@DataProvider
	public Object[][] getModifyUser()
	{
		return new Object[][] {{"R1234","R1234"},{"S1234","S1234"},{"T1234","T1234"}};
	}
	@Test(priority=8,dataProvider="getModLoginUser")
	public void modloginuser1(String usname,String pwd)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys(usname);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
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
	@DataProvider
	public Object[][] getModLoginUser()
	{
		return new Object[][] {{"user1","R1234"},{"user2","S1234"},{"user3","T1234"}};
	}

	@Test(priority=9)
	public void deleteuser()
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
	@Test(priority=10)
	public void closeApplication()
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
