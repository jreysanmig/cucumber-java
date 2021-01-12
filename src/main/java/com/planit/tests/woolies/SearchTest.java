package com.planit.tests.woolies;

import org.junit.Test;

import com.planit.pages.woolies.WooliesHomePage;
import com.planit.tests.BaseTest;

public class SearchTest extends BaseTest{
	WooliesHomePage homePage;
	
	@Test
	public void searchForProductTest() {
		homePage = new WooliesHomePage(driver);
		homePage.enterSearchText("cheese")
				.submitSearch();
	}

}