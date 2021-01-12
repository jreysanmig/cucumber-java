package com.planit.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected WebDriver driver;
	
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsanmiguel\\Documents\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@After
	public void after() {
		driver.quit();
	}

}
