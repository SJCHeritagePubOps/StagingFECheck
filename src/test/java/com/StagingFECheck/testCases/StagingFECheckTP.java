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

public class StagingFECheckTP extends BaseClass {

	@Test
	public void testStagingFECheckTP() throws Exception {
		driver.get(readconfig.getTpStagingFEUrl());
		logger.info("Open TP staging URL");


		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Today's Parent - Pregnancy, baby, toddler advice for Canadian parents";

		String actualNlText = driver.findElement(By.className("hero-nl-name")).getText();
		String expectedNlText = "DAILY NEWSLETTER";

		String actualFeedTitle = driver.findElement(By.xpath("//div[@class=\"container-content-block--feed-with-ad\"]//h5")).getText();
		String expectedFeedTitle = "NOW ON TODAY'S PARENT";

		String actualCopyRight = driver.findElement(By.xpath("//div[@class=\"footer-copyright d-flex d-flex  align-items-center\"]//p")).getText();
		String expectedCopyRight = "St. Joseph Communications";

		SoftAssert verify = new SoftAssert();

		verify.assertEquals(actualPageTitle, expectedPageTitle);
		verify.assertEquals(actualNlText, expectedNlText);
		verify.assertEquals(actualFeedTitle, expectedFeedTitle);
		verify.assertTrue(actualCopyRight.contains(expectedCopyRight));
		verify.assertAll();
	}

}
