package Pratap.Appium;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class AppiumBasic {
	@Test
	public void appiumTest() throws MalformedURLException {
		//Launch appium server
//		AppiumDriverLocalService driverLocalService=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\prata\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("http://127.0.0.1").usingPort(4723));
		//AppiumDriverLocalService serviceBuilder=AppiumDriverLocalService.(new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\prata\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("http://127.0.0.1").usingPort(4723).build());
//		driverLocalService.start();
//		UiAutomator2Options options=new UiAutomator2Options();	
//		options.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL_5_API_31");
//		options.setCapability(MobileCapabilityType.APP, "E:\\EclipsePakage\\eclipse-workspace\\Appium\\src\\main\\java\\resources\\ApiDemos-debug.apk");
//		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//		driverLocalService.stop();
		
//		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\prata\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//		.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
//		System.out.println("Server started");
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("PIXEL_5_API_31");
		options.setApp("E:\\EclipsePakage\\eclipse-workspace\\Appium\\src\\main\\java\\resources\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		//Xpath, id, accessibilityId, classname, androidUIAutomator
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		
		
		//driver.quit();
//		service.stop();
	}

}
