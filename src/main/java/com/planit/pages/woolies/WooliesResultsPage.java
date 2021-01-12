package com.planit.pages.woolies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.planit.pages.BasePage;

public class WooliesResultsPage extends BasePage{

	public WooliesResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getHeaderText() {
		return this.driver.findElement(By.cssSelector("h1.searchContainer-title")).getText();
	}

}
