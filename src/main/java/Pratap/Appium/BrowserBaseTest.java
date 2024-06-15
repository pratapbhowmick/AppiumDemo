package Pratap.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BrowserBaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void configureAppium() throws MalformedURLException {

//		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder()
//				.withAppiumJS(
//						new File("C:\\Users\\prata\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723);
//		service = serviceBuilder.build();
		// service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("PIXEL_5_API_31");
		options.setChromedriverExecutable("E:\\EclipsePakage\\eclipse-workspace\\Appium\\src\\main\\java\\resources\\chromedriver.exe");
		options.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	

	public Double formattedAmount(String amount) {
		return Double.parseDouble(amount.substring(1));
	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
		// service.stop();
	}
}
