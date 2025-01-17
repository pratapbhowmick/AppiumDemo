package Pratap.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest {
	@Test
	public void swipeDemoTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),
				"true");
		// Swipe
		WebElement firstImage = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
//		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", 
//				ImmutableMap.of("elementId" ,((RemoteWebElement)firstImage).getId(),
//						"direction","left","percent",0.75));
		swipeAction(firstImage, "left");
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),
				"false");
	}
}
