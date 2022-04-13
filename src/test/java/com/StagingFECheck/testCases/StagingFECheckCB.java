package com.StagingFECheck.testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class StagingFECheckCB extends BaseClass {

	@Test
	public void testStagingFECheckCB() throws Exception {
		driver.get(readconfig.getCbStagingFEUrl());		
		logger.info("Open CB staging URL");

		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Canadian Business - How to Do Business Better";

		String actualNlText = driver.findElement(By.xpath("//h2[@id='get-cb-in-your-inbox']/strong")).getText();
		String expectedNlText = "Get CB in your inbox";

		String actualCopyRight = driver.findElement(By.xpath("//footer/div/div/div[2]/p")).getText();
		String expectedCopyRight = "St. Joseph Communications";

		SoftAssert verify = new SoftAssert();

		verify.assertEquals(actualPageTitle, expectedPageTitle);
		verify.assertEquals(actualNlText, expectedNlText);
		verify.assertTrue(actualCopyRight.contains(expectedCopyRight));
		verify.assertAll();
	}

}
