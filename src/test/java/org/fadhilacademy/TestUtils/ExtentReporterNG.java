package org.fadhilacademy.TestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports extent;
	public static String timeStampDate = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss").format(new Date());
	
	public static ExtentReports getReporterObject() {
		String path = System.getProperty("user.dir") + "\\reports\\Automation Report " + timeStampDate + "\\" + timeStampDate + ".html";
		ExtentSparkReporter ExtentSparkReporter = new ExtentSparkReporter(path);
		ExtentSparkReporter.config().setReportName("Web Automation Result");
		ExtentSparkReporter.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(ExtentSparkReporter);
		extent.setSystemInfo("Testing", "Fadhil");
		return extent;
	}

}
