package Pratap.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousAppiumAction extends BaseTest{
	@Test
	public void miscellaneous() {
		//App Package & App Activity
		// adb shell dumpsys window | grep -E 'mCurrentFocus'-Mac
		// adb shell dumpsys window | find "mCurrentFocus" -Windows
		Activity activity=new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		//tearDown();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		//Device Rotation
		DeviceRotation landscape=new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		driver.findElement(By.xpath("//android.widget.LinearLayout[2]")).click();
		String alert=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alert, "WiFi settings");
		//Copy to ClipBoard - paste it clipboard
		driver.setClipboardText("pratap Wifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		//driver.findElement(By.id("android:id/button1")).click();
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}

}
