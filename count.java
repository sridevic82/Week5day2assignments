package invoca.cnt;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class count extends Invocation {
	
	@Test(dataProvider="provider")
	public void createLeadss(String cname,String name1,String name2) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name1);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(name2);
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	
	@DataProvider
	public String[][] provider()
	{
		String[][] array=new String[2][3];
		
		array[0][0]="CTS";
		array[0][1]="vicky";
		array[0][2]="g";
		array[1][0]="TCS";
		array[1][1]="sridev";
		array[1][2]="c";
		
		return array;
		
	}
	
	
	
	

}
