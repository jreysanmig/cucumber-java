package com.planit.pages.woolies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.planit.pages.BasePage;

public class WooliesHomePage extends BasePage{

	public WooliesHomePage(WebDriver driver) {
		super(driver);
		driver.get("https://www.woolworths.com.au/");
	}
	
	public WooliesHomePage enterSearchText(String searchText) {
		this.driver.findElement(By.id("headerSearch")).sendKeys(searchText);
		return this;
	}
	
	public WooliesResultsPage submitSearch() {
		this.driver.findElement(By.cssSelector(".search-button-icon")).click();
		return new WooliesResultsPage(driver);
	}

}
