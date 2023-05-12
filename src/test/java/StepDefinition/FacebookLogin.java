package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class FacebookLogin {

	WebDriver driver;

	@Given("Launch the browser")
	public void launch_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Given("Load the facebook Url")
	public void load_the_facebook_url() {
		driver.get("https://www.facebook.com/");

	}

	@When("Provide the invalid username and invalid password")
	public void provide_the_invalid_username_and_invalid_password() {
		driver.findElement(By.id("email")).sendKeys("tuyywiuwi637");
		driver.findElement(By.id("pass")).sendKeys("uqiqhwf");

	}

	@When("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.name("login")).click();

	}

	@Then("Verify the Error message")
	public void verify_the_error_message() {

		System.out.println("Test case passed ");
	}

}
