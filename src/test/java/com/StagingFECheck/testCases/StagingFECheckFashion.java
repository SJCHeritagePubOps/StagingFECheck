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

public class StagingFECheckFashion extends BaseClass{
	
	  @Test
	  public void testStagingFECheckTL() throws Exception {
	    driver.get(readconfig.getFashionStagingFEUrl());
		logger.info("Open Fashion staging URL");

	    	    
	    String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "FASHION Magazine";

		SoftAssert verify = new SoftAssert();

		verify.assertEquals(actualPageTitle, expectedPageTitle);
		
		verify.assertAll();
	  }


}
