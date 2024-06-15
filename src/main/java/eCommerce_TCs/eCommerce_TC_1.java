package eCommerce_TCs;

import java.lang.StackWalker.Option;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pratap.Appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class eCommerce_TC_1 extends BaseTest {
	@Test
	public void FillForm() {
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Pratap Bhowmick");
		driver.hideKeyboard();
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.
						androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
				
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//Verify Toast message
		String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		Assert.assertEquals(toastMessage, "Please enter your name");
	}

}
