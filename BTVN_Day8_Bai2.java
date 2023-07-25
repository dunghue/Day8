package automation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class BTVN_Day8_Bai2 extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
	}
	@Test
	public void findElement() {
		//Find name
		driver.findElement(By.id("name"));
		System.out.println("Da tim thay Name theo Id");
		//Find address
		driver.findElement(By.name("address"));
		System.out.println("Da tim thay Address theo Name");
		//Find password
		driver.findElement(By.id("password"));
		System.out.println("Da tim thay PW theo id");
		driver.findElement(By.id("email"));
		System.out.println("Da tim thay email theo id");
		
	}
	
	

}
