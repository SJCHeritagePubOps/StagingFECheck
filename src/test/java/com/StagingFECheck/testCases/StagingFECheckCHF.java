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

public class StagingFECheckCHF extends BaseClass {

	@Test
	public void testStagingFECheckCHF() throws Exception {
		driver.get(readconfig.getChfStagingFEUrl());
		logger.info("Open CHF staging URL");


		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Châtelaine - Recettes, Santé, Reportages, Club de lecture, Mode, Beauté, Vidéos et Blogues.";

		String actualNlText = driver.findElement(By.className("hero-nl-name")).getText();
		String expectedNlText = "L’INFOLETTRE CHÂTELAINE";

		String actualFeedTitle = driver.findElement(By.xpath("//div[@class=\"container-content-block--feed-with-ad\"]//h5")).getText();
		String expectedFeedTitle = "COMMANDITÉ";

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
