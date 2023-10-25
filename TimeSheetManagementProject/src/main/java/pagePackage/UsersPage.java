package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;

public class UsersPage {

	
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement Create_newuser_Button;
    @FindBy(name = "username") private WebElement UsernameTB;
    @FindBy(name = "passwordText") private WebElement PasswordTB;
    @FindBy(name = "passwordTextRetype") private WebElement Retype_passwordTB;
    @FindBy(name = "firstName") private WebElement FirstNameTB;
    @FindBy(name = "lastName") private WebElement LastNameTB;
    
    @FindBy(name = "rightGranted[9]")  private WebElement  Enter_Timetrack_checkBox;
    @FindBy(name = "rightGranted[12]") private WebElement   Modify_time_trackforotherUsers_CheckBox;
    @FindBy(name = "rightGranted[2]") private WebElement Manage_Customer_Projects_CheckBox;
    @FindBy(name = "rightGranted[13]") private WebElement Manage_Tasks_Checkbox;
    @FindBy(name = "rightGranted[1]") private WebElement Generate_Reports_Checkbox;
    @FindBy(name = "rightGranted[5]") private WebElement Manage_Users_Checkbox;
    @FindBy(name = "rightGranted[7]") private WebElement Manage_Billing_Type_Checkbox;
    @FindBy(name = "rightGranted[10]") private WebElement Manage_Work_Schedule_Checkbox;
    
    @FindBy(xpath = "//input[@value='   Create User   ']") private WebElement Create_User_Button;
    @FindBy(partialLinkText = "Sharma, Rohit (Manager123)") private WebElement usersListLink;
    @FindBy(xpath = "//input[@value='Delete This User']") private WebElement  deleteThisUserButton;
    
    
  



	public UsersPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    

	public WebElement getCreate_user_Button() {
		return Create_newuser_Button;
	}

	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getRetype_passwordTB() {
		return Retype_passwordTB;
	}

	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}

	public WebElement getLastNameTB() {
		return LastNameTB;
	}

	public WebElement getEnter_Timetrack_checkBox() {
		return Enter_Timetrack_checkBox;
	}

	public WebElement getModify_time_trackforotherUsers() {
		return Modify_time_trackforotherUsers_CheckBox;
	}

	public WebElement getManage_Customer_Projects() {
		return Manage_Customer_Projects_CheckBox;
	}

	public WebElement getManage_Tasks() {
		return Manage_Tasks_Checkbox;
	}

	public WebElement getGenerate_Reports() {
		return Generate_Reports_Checkbox;
	}

	public WebElement getManage_Users() {
		return Manage_Users_Checkbox;
	}

	public WebElement getManage_Billing_Type() {
		return Manage_Billing_Type_Checkbox;
	}

	public WebElement getManage_Work_Schedule() {
		return Manage_Work_Schedule_Checkbox;
	}

	public WebElement getCreate_User_Button() {
		return Create_User_Button;
	}
	
	public WebElement getUsersListLink() {
		return usersListLink;
	}


    
   
    public void createManagerMethod(String username,String password,String fn,String ln)
    {   
    	 Create_newuser_Button.click();
    	 UsernameTB.sendKeys(username);
    	 PasswordTB.sendKeys(password);
    	 Retype_passwordTB.sendKeys(password);
    	 FirstNameTB.sendKeys(fn);
    	 LastNameTB.sendKeys(ln);
    		  
    }
    
    public void managerAccessMethod()
    {
    	Enter_Timetrack_checkBox.click();
    	Modify_time_trackforotherUsers_CheckBox.click();
    	Manage_Customer_Projects_CheckBox.click();
    	Manage_Tasks_Checkbox.click();
    	Generate_Reports_Checkbox.click();
    	Manage_Users_Checkbox.click();
    	Manage_Billing_Type_Checkbox.click();
    	Manage_Work_Schedule_Checkbox.click();
    	Create_User_Button.click();
    	
    	
    }
    
    public void deleteManagerMethod()
    {
    	usersListLink.click();
    	deleteThisUserButton.click();
    	
    	 WorkLib wb = new WorkLib();
    	 wb.handleConfirmationPopup();
    }
}
