package com.company.testclasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.company.util.Excel;






public class GoogleTest {
	private WebDriver d;
	Excel excel=new Excel();

	@BeforeTest
	public void beforeTest(){
		
		d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void t() throws Exception{
		excel.setexcel("src\\test\\resources\\Data\\Test.xls","Sheet1");

		d.get("https://www.google.co.in//?gfe_rd=cr&ei=DVI_VN3kEuTA8gftlIHYCQ&gws_rd=ssl");

		
			String type=excel.getCellValue(1,1);

			System.out.println(type);
			d.findElement(By.id("gbqfq")).sendKeys(type);
			d.findElement(By.id("gbqfb")).click();
			Thread.sleep(2000);
			
		}

	




	@AfterTest
	public void at(){
		d.quit();
	} 



}
