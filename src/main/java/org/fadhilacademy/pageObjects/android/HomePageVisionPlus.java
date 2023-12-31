package org.fadhilacademy.pageObjects.android;

import org.fadhilacademy.utils.AndroidGesture;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageVisionPlus extends AndroidGesture{

	AndroidDriver android;
	
	public HomePageVisionPlus(AndroidDriver android) {
		super(android);
		this.android = android;
		PageFactory.initElements(new AppiumFieldDecorator(android), this);
	}
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/tv_notification")
	private WebElement removePopupSub;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Lainnya\"]")
	private WebElement lainnyaButton;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/tv_skip_intro")
	private WebElement skipButton;
	
	public void removePopupSub() {
		removePopupSub.click();
	}
	
	public void lainnyaButton() {
		lainnyaButton.click();
	}
	
	public void lewatiButton() {
		skipButton.click();
	}
	
}
