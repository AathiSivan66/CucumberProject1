package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver;

	@Given("launch the desired browser")
	public void launch_the_desired_browser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	@Given("provide the google url")
	public void provide_the_google_url() {
		driver.get("https://www.google.co.in/");

	}

	@When("provide input as laptop in search text box and press enter")
	public void provide_input_as_laptop_in_search_text_box_and_press_enter() {
		driver.findElement(By.name("q")).sendKeys("LapTop", Keys.ENTER);
	}

	@Then("verify the results")
	public void verify_the_results() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("Take the screenshot")
	public void take_the_screenshot() {
		Date d = new Date();
		String dT = d.toString();
		String replaceAll = dT.replaceAll(" ", "_");
		String dateTime = replaceAll.replaceAll(":", "_");
		System.out.println(dateTime);
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File perm = new File("C:/Users/THIS PC/eclipse-workspace/CucumberBatchTweleve/Screenshots/Proof"+
		dateTime+".png");
		try {
			FileUtils.copyFile(temp, perm);
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
