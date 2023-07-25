package automation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class BTVN_day8_Slide extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	
	@Test
	public void findById() {
		driver.findElement(By.id("userId"));
		System.out.println(" Found username by id");
		driver.findElement(By.id("pass"));
		System.out.println("Found pw by id");
	}	
	
	@Test
	public void findByName() {
		driver.findElement(By.name("company"));
		System.out.println("Found company by name");
		driver.findElement(By.name("mobile number"));
		System.out.println("Found mobile number by name");
	}
	/*@Test
	public void findByClassName() {	

		driver.findElement(By.className("selectors-input jsSelector"));
		System.out.println("Found username by ClassName");
		driver.findElement(By.className("selectors-input jsSelector"));
		System.out.println("Found pw by ClassName");
		=> cả username và pw đều có classname giống nhau nên không tìm được => nếu chạy nó sẽ báo failure case này
	}*/
	
	@AfterTest
	public void quitDriver()
	{
		driver.close();
	}
	
	

}
