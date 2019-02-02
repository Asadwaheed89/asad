package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	public Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);		
		
	}
	
	@FindBy(name="firstname")
	public WebElement FisrtName;
	
	@FindBy(name="lastname")
	public WebElement LastName;
	
	@FindBy(name="email")
	public WebElement Emailid;
	
	@FindBy(name="telephone")
	public WebElement Telno;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(name="confirm")
	public WebElement conf;
	
	@FindBy(name="newsletter")
	public WebElement newsleter;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	public WebElement agree;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	public WebElement Continue;
	
	
	public void Registrations(String Fname, String Lname,String Email,String telephone,String password,String confirm) {
		FisrtName.sendKeys(Fname);
		LastName.sendKeys(Lname);
		Emailid.sendKeys(Email);
		Telno.sendKeys(telephone);
		pass.sendKeys(password);
		conf.sendKeys(confirm);
		agree.click();
		Continue.click();
		System.out.println("Registered Successfully");
	}

}
