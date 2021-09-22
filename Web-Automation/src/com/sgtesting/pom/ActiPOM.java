package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPOM {
	public ActiPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login button Field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//Fly Out Window Field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWin()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Logout Link Field
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//user button
	@FindBy(xpath="//a[@href][@class='content users']")
	private WebElement oUser;
	public WebElement getUser()
	{
		return oUser;
	}
	//add user button
	@FindBy(xpath="//div[@class='buttonText']")
	private WebElement oadd;
	public WebElement getAdd()
	{
		return oadd;
	}
	//First name
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFirstname()
	{
		return userDataLightBox_firstNameField;
	}
	//Last name
	private WebElement userDataLightBox_lastNameField;
	public WebElement getLastname()
	{
		return userDataLightBox_lastNameField;
	}
	//email
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}
	//user name text field
	private WebElement userDataLightBox_usernameField;
	public WebElement getUsernameField()
	{
		return userDataLightBox_usernameField;
	}
	//password field
	private WebElement userDataLightBox_passwordField;
	public WebElement getPWDField()
	{
		return userDataLightBox_passwordField;
	}
	//retype pwd field
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getRetypePWDField()
	{
		return userDataLightBox_passwordCopyField;
	}
	//create user button
	@FindBy(xpath="//span[@class='buttonTitle'][text()='Create User']")
	private WebElement ucreate;
	public WebElement getCreateUserButton()
	{
		return ucreate;
	}
	//click on user
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickuser;
	public WebElement getclickuser()
	{
		return clickuser;
	}
	//delete user button
	@FindBy(xpath="//div[@class='deleteContainer']")
	private WebElement userclick;
	public WebElement getdelete()
	{
		return userclick;
	}
	//save changes button
	@FindBy(xpath="//span[@class='buttonTitle' and text()='Save Changes']")
	private WebElement editsave;
	public WebElement getsavechanges()
	{
		return editsave;
	}
	//click on task button
	@FindBy(xpath="//a[@href] [@class='content tasks']")
	private WebElement oTask;
	public WebElement getTaskButton()
	{
		return oTask;
	}
	//click on Add new
	@FindBy(xpath="//div [text()='Add New']")
	private WebElement oAddNew;
	public WebElement getaddNew()
	{
		return oAddNew;
	}
	//add new Customer
	@FindBy(xpath="//div [@class='item createNewCustomer ellipsis']")
	private WebElement oNewCustomer;
	public WebElement getNewCustomer()
	{
		return oNewCustomer;
	}
	//new customer field
	private WebElement customerLightBox_nameField;
	public WebElement getNewCustomerField()
	{
		return customerLightBox_nameField;
	}
	//customer description field
	private WebElement customerLightBox_descriptionField;
	public WebElement getNewCustomerDescField()
	{
		return customerLightBox_descriptionField;
	}
	//create customer submit
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement oSubmit;
	public WebElement getNewCustomerSubmit()
	{
		return oSubmit;
	}
	//customer edit setting
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement osetting;
	public WebElement getCustomerSetting()
	{
		return osetting;
	}
	//click action button on customer to delete
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement actionbuttonForCustom;
	public WebElement getcustAction()
	{
	return actionbuttonForCustom;
	}
	//delete button on customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletebuttonForCustom;
	public WebElement getcustDelete()
	{
	return deletebuttonForCustom;
	}
	//confirm button of delete on customer
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement confirmdeletebutton;
	public WebElement getconfirmDelete()
	{
	return confirmdeletebutton;
	}
	//modify customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement emodifyCstm;
	public WebElement getmodifycust()
	{
	return emodifyCstm;
	}
	//close button on customer modify
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement closeButn;
	public WebElement getclosebtn()
	{
	return closeButn;
	}
	//click button for project
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement projectbtn;
	public WebElement getprjtbtn()
	{
	return projectbtn;
	}
	// enter the value for project name
	private WebElement projectPopup_projectNameField;
	public WebElement EnterNameForProject()
	{
	return projectPopup_projectNameField;
	}
	//save project name
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement saveproject;
	public WebElement saveProject()
	{
	return saveproject;
	}
	//edit button for project
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]]")
	private WebElement editproject;
	public WebElement editProject()
	{
	return editproject;
	}
	//action button for project
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement actionproject;
	public WebElement actionProject()
	{
	return actionproject;
	}
	//delete button on project
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement deletproject;
	public WebElement deleteProject()
	{
	return deletproject;
	}
	//confirm delete project button
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement confirmDelete;
	public WebElement confirmdeleteProject()
	{
	return confirmDelete;
	}
	//modify project name
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyProject;
	public WebElement getModifyProject()
	{
	return modifyProject;
	}
	//create add task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement createTask;
	public WebElement getAddTask()
	{
	return createTask;
	}
	//create new task
	//@FindBy(xpath="//*[@id=\'ext-gen371\']/div[11]/div[1]")
	@FindBy(xpath="/html/body/div[11]/div[1]")
	private WebElement newTask;
	public WebElement getnewTask()
	{
	return newTask;
	}
	//enter task name
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement taskName;
	public WebElement getTN()
	{
	return taskName;
	}
	//save task
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement saveTask;
	public WebElement getST()
	{
	return saveTask;
	}
	//delete task on clic
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
	private WebElement click;
	public WebElement getclick()
	{
	return click;
	}
	//delete button for task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]/span")
	private WebElement clickdelete;
	public WebElement getclickdelete()
	{
	return clickdelete;
	}
	//confirm task delete
	@FindBy(xpath="//*[@id=\'deleteTaskPopup_deleteConfirm_submitTitle\']")
	private WebElement confrmdelt;
	public WebElement getcnfrm()
	{
	return confrmdelt;
	}
	//modify task
	// click on task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
	//*[@id="taskListBlock"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]
	private WebElement clikonTask;
	public WebElement getmoditask()
	{
	return clikonTask;
	}
	//modify task text
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement entertxt;
	public WebElement getTaskText()
	{
	return entertxt;
	}

}
