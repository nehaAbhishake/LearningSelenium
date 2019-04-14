package MySecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecProj {

	//static WebDriver driver = null;
	
	//LaunchBrowser
	//ConfigBrowser
	//ReadExcel
	//GetURL
	//EnterCredentials
	//QuitBrowser
	
	public static void ConfigBrowser() {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTutorial1\\lib\\geckodriverjars\\geckodriver.exe");
		//driver = new FirefoxDriver();
	}
	
	public static void main(String[] args) {
		System.out.print("Hello");
		ReadExcel ExcelObj = new ReadExcel("C:\\Users\\Admin\\Desktop\\Neha_Important\\Selenium\\LearnMaven11.xls");
	    ExcelObj.ReadExcelData(0,1,1);
		
	}
	
}
