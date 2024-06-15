package Pratap.Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class WifiSettingName extends BaseTest{
	//@Test
	public void wifiSettingsName() throws MalformedURLException, InterruptedException {
		//configureAppium();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//tearDown();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[2]")).click();
		String alert=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alert, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("pratap wifi");
		//driver.findElement(By.id("android:id/button1")).click();
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	}
}
