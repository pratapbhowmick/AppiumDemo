package Pratap.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest{
	@Test
	public void ScrollDemoTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();		
		//Method 1
		//driver.findElement(AppiumBy.
		//		androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		//Co-ordinate
//		Boolean canScrollMore= (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: scrollGesture",
//				ImmutableMap.of("left",100,
//						"top",100,
//						"width",200,
//						"height",200,
//						"percent",3.0,
//						"direction","down"));
		//Scroll untill end
//		Boolean canScrollMore;
//		do {
//			canScrollMore= (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: scrollGesture",
//					ImmutableMap.of("left",100,
//							"top",100,
//							"width",200,
//							"height",200,
//							"percent",3.0,
//							"direction","down"));
//		} while (canScrollMore);
		scrollToEndAction();
	}
	
}
