package count;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import invoca.cnt.Invocation;

public class clead extends Invocation {
	
	@Test(invocationCount=3)
	public void createLeadss() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("t");
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	

	
	
	

}
