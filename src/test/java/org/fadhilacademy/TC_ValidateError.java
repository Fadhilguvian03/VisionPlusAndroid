package org.fadhilacademy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.fadhilacademy.pageObjects.android.CartPage;
import org.fadhilacademy.pageObjects.android.FormPage;
import org.fadhilacademy.pageObjects.android.ProductCatalogue;
import org.fadhilacademy.utils.AppiumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TC_ValidateError extends BaseTestEcommerce {
	
	@Test(dataProvider="getData")
	public void ValidateError(HashMap<String, String> input) throws InterruptedException {
		
		FormPage form = new FormPage(android);
		form.setName(input.get("name"));
		form.setGender(input.get("gender"));
		form.setCountrySelection(input.get("country"));
		form.pressLoginButton();
		ProductCatalogue ProductCatalogue = new ProductCatalogue(android);
		ProductCatalogue.addItemToCardByIndex(0);
		ProductCatalogue.addItemToCardByIndex(0);
		ProductCatalogue.clickButtonCart();
		CartPage CartPage = new CartPage(android);
		CartPage.checkPriceAssert();
		CartPage.termsButtonLongPress();
		CartPage.clickCheckbox();
		CartPage.clickProceed();
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"\\src\\test\\java\\org\\fadhilacademy\\TestData\\eCommerce.json");
		return new Object[][] {{data.get(0)}};
		
	}

}
