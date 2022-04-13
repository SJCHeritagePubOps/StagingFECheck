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

public class StagingFECheckMAC extends BaseClass {

	@Test
	public void testStagingFECheckMAC() throws Exception {
		driver.get(readconfig.getMacStagingFEUrl());
		logger.info("Open MAC staging URL");


		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Macleans.ca - Canada's national current affairs and news magazine since 1905";

		String actualNlText = driver.findElement(By.className("hero-nl-name")).getText();
		String expectedNlText = "MACLEAN'S NEWSLETTER";

		String actualFeedTitle = driver.findElement(By.xpath("//div[@class=\"container-content-block--feed-with-ad\"]//h5")).getText();
		String expectedFeedTitle = "LATEST ON MACLEANS";

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
