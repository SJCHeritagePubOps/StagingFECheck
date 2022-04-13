package com.StagingFECheck.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getBaseUrl() {
		String url = pro.getProperty("baseUrl");
		return url;
	}

	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getIEPath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}
	
	public String getCbStagingFEUrl() {
		String cbStagingFEUrl = pro.getProperty("cbStagingFEUrl");
		return cbStagingFEUrl;
	}
	
	public String getCheStagingFEUrl() {
		String cheStagingFEUrl = pro.getProperty("cheStagingFEUrl");
		return cheStagingFEUrl;
	}
	
	public String getChfStagingFEUrl() {
		String chfStagingFEUrl = pro.getProperty("chfStagingFEUrl");
		return chfStagingFEUrl;
	}
	
	public String getFashionStagingFEUrl() {
		String fashionStagingFEUrl = pro.getProperty("fashionStagingFEUrl");
		return fashionStagingFEUrl;
	}
	
	public String getMacStagingFEUrl() {
		String macStagingFEUrl = pro.getProperty("macStagingFEUrl");
		return macStagingFEUrl;
	}
	
	public String getTlStagingFEUrl() {
		String tlStagingFEUrl = pro.getProperty("tlStagingFEUrl");
		return tlStagingFEUrl;
	}
	
	public String getTpStagingFEUrl() {
		String tpStagingFEUrl = pro.getProperty("tpStagingFEUrl");
		return tpStagingFEUrl;
	}
	


}
