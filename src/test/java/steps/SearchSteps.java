package steps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planit.pages.woolies.WooliesHomePage;
import com.planit.pages.woolies.WooliesResultsPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
	WebDriver driver;
	
	WooliesHomePage wooliesHomePage;
	WooliesResultsPage wooliesResultsPage;
	
	@Before
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsanmiguel\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@After
	public void after() {
		driver.quit();
	}
	
	@Given("Woolworths Home Page is open")
	public void woolworths_Home_Page_is_open() {
		wooliesHomePage = new WooliesHomePage(driver);
	}

	@When("{string} is searched")
	public void text_is_searched(String keyword) {
		wooliesResultsPage = wooliesHomePage
			.enterSearchText(keyword)
			.submitSearch();
	}
	
	@Then("Results header must contain {string}")
	public void results_header_must_contain_text(String keyword) {
		assertThat(wooliesResultsPage.getHeaderText()).containsIgnoringCase(keyword);
	}
	
}
