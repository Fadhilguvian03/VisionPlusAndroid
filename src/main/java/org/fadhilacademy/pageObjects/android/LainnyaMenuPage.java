package org.fadhilacademy.pageObjects.android;

import org.fadhilacademy.utils.AndroidGesture;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LainnyaMenuPage extends AndroidGesture{
	
	AndroidDriver android;
	
	public LainnyaMenuPage(AndroidDriver android) {
		super(android);
		this.android = android;
		PageFactory.initElements(new AppiumFieldDecorator(android), this);
	}
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/linear_action_setting")
	private WebElement pengaturanButton;
	
	public void pengaturanLainnya() {
		pengaturanButton.click();
	}

}
