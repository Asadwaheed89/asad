package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {

	WebDriver driver;
	public LoginClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	public WebElement Emailid;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	public WebElement submit;
	
	
	public void Login(String ID, String PWD) {
		
		Emailid.sendKeys(ID);
		pass.sendKeys(PWD);
		submit.click();
		System.out.println("LogIn Successfully");
	}

}
