package org.fadhilacademy.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidGesture extends AppiumUtils {
	
	AndroidDriver android;
	
	public AndroidGesture(AndroidDriver android) {
		super(android);
		this.android = android;
	}
	
	public void ScrollToText(String text) {
		android.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));
	}

	public void LongPress(WebElement peopleNames) {
		((JavascriptExecutor) android).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) peopleNames).getId(), "duration",2000));
	}
	
	public void SwipeGesture(WebElement firstElement) {
		((JavascriptExecutor) android).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) firstElement).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
	}
	
}
