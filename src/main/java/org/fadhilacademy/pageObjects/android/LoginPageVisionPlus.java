package org.fadhilacademy.pageObjects.android;

import java.time.Duration;

import org.fadhilacademy.utils.AndroidGesture;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageVisionPlus extends AndroidGesture{

	AndroidDriver android;
	
	public LoginPageVisionPlus(AndroidDriver android) {
		super(android);
		this.android = android;
		PageFactory.initElements(new AppiumFieldDecorator(android), this);
	}
	
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/btn_sign_in")
	private WebElement masukButton;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/btn_register")
	private WebElement withEmail;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/btn_google")
	private WebElement withGoogle;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/btn_facebook")
	private WebElement withFacebook;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/et_phone")
	private WebElement withPhone;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/et_email")
	private WebElement emailTextbox;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/et_password")
	private WebElement passwordEmailTextbox;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/btn_continue")
	private WebElement continueButton;
	
	@AndroidFindBy(id="com.zte.iptvclient.android.idmnc:id/et_password")
	private WebElement passwordPhoneTextbox;
	
	
	public void LoginVisionPlus(String loginWith) throws InterruptedException {
		Thread.sleep(3000);
		masukButton.click();
		
		if(loginWith.equalsIgnoreCase("email")) {
			withEmail.click();
			emailTextbox.click();
			emailTextbox.sendKeys("paytvpremium@visionplus.id");
			passwordEmailTextbox.click();
			passwordEmailTextbox.sendKeys("4321lupa");
			continueButton.click();
		} else if(loginWith.equalsIgnoreCase("google")) {
			withGoogle.click();
		} else if(loginWith.equalsIgnoreCase("facebook")) {
			withFacebook.click();
		} else if(loginWith.equalsIgnoreCase("phone")) {
			Thread.sleep(5000);
			withPhone.click();
			withPhone.sendKeys("088219626865");
			continueButton.click();
			passwordPhoneTextbox.click();
			passwordPhoneTextbox.sendKeys("4321lupa");
			continueButton.click();
		} else {
			System.out.println("Wrong Input String");
		}
		
		Thread.sleep(3000);
	}
	
	
}
