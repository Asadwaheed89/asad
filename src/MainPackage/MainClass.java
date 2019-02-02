package MainPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.function.ObjLongConsumer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Object.LoginClass;
import Object.Logout;
import Object.Registration;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MainClass {
	
public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		
	
	
	FileInputStream fs = new FileInputStream("C:\\Users\\labit\\Downloads\\Third Session\\Test.xls");
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet AddressSheet = wb.getSheet("User_Login");

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Downloads\\chromedriver.exe");
	   
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/register");	
	    //driver.get("https://demo.opencart.com/index.php?route=account/login");	
	    driver.manage().window().maximize();
	    
	    //
	    Registration Reg = new Registration(driver);
	    Reg.Registrations("Asad111", "waheed111", "taimor11.abbas@gmail.com", "03362511844", "abc123", "abc123");
	    
	    Logout lgout = new Logout (driver);
	    lgout.log_out();
	    
	    driver.get("https://demo.opencart.com/index.php?route=account/login");	
	    driver.manage().window().maximize();
	    
	    LoginClass ObjLogin = new LoginClass(driver);
	    //ObjLogin.Login(AddressSheet.getCell(0, 1).getContents(), AddressSheet.getCell(1, 1).getContents());
	    ObjLogin.Login("taimor11.abbas@gmail.com", "abc123");
	    
	    
	   
    
}
}

