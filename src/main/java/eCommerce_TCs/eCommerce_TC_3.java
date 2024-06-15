package eCommerce_TCs;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;import org.testng.internal.annotations.IDataProvidable;

import Pratap.Appium.BaseTest;
import io.appium.java_client.AppiumBy;

public class eCommerce_TC_3 extends BaseTest{

	@Test
	public void verifyAmount() {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Pratap Bhowmick");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.
						androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
				
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		//Sync the page
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text", "Cart"));
		
		List<WebElement> productPrices=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		int count=productPrices.size();
		Double sum=(double) 0;
		for (int i = 0; i <count; i++) {
			String amountString=productPrices.get(i).getText();
			
			Double price=formattedAmount(amountString);
			sum=sum+price;
		}
		String displaySumString=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		Double displayPrice=formattedAmount(displaySumString);
		Assert.assertEquals(sum, displayPrice);
		WebElement termsElement=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		longPressAction(termsElement);
		WebElement	aletrTitle=driver.findElement(By.id("com.androidsample.generalstore:id/alertTitle"));
		Assert.assertEquals(aletrTitle.getText(), "Terms Of Conditions");
		WebElement	alertMessage=driver.findElement(By.id("android:id/message"));
		Assert.assertTrue(alertMessage.getText().contains("1500s"));
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		
	}
}
