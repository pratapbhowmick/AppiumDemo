package Pratap.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchAppium {
	@Test
	public void invokeAppium() throws MalformedURLException {
		AppiumServiceBuilder serviceBuilder=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\prata\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723);		
		AppiumDriverLocalService service=serviceBuilder.build();
		service.start();
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("PIXEL_5_API_31");
		options.setApp("E:\\EclipsePakage\\eclipse-workspace\\Appium\\src\\main\\java\\resources\\ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.quit();
		service.stop();
	}
}
