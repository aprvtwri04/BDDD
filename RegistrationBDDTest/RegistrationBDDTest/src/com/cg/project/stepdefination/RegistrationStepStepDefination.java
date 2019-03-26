package com.cg.project.stepdefination;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.project.pagebeans.RegistrationPageBean;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class RegistrationStepStepDefination {

	private WebDriver driver;

	private RegistrationPageBean pageBean;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Apoorv_Tiwari_TrainingData\\Testing\\chromedriver\\chromedriver.exe" );
		driver=new ChromeDriver();	
	}

	@Given("^User is accing RegsitrtionPage on Borwser$")
	public void user_is_accing_RegsitrtionPage_on_Borwser() throws Throwable {
		driver.get("D:\\Apoorv_Tiwari_TrainingData\\WebPages\\RegistrationForm.html");
		pageBean = PageFactory.initElements(driver, RegistrationPageBean.class);
	}

	@When("^user is trying submit data without entring 'User Id'$")
	public void user_is_trying_submit_data_without_entring_User_Id() throws Throwable {
		pageBean.clickSignUp();
	}

	@Then("^'User Id should not be empty / length be between (\\d+) to (\\d+)' alert message should display$")
	public void user_Id_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
		String expectedAlertMessage ="User Id should not be empty / length be between 5 to 12";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@When("^User is trying to submit request without entring 'username'$")
	public void user_is_trying_to_submit_request_without_entring_username() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setUserId("satish1111");
		pageBean.clickSignUp();
	}

	@Then("^'Username should not be empty and must have alphabet characters only' alert message should display$")
	public void username_should_not_be_empty_and_must_have_alphabet_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Username should not be empty and must have alphabet characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

	}
	@When("^User is trying to submit request without entring 'Password'$")
	public void user_is_trying_to_submit_request_without_entring_Password() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setUsername("satishmahajan");
		pageBean.clickSignUp();
	}


	@Then("^'Password should not be empty / length be between (\\d+) to (\\d+)' alert message should display$")
	public void password_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
		String expectedAlertMessage ="Password should not be empty / length be between 7 to 12";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}
	
	@When("^User is trying to submit request without entring valid 'address'$")
	public void user_is_trying_to_submit_request_without_entring_valid_address() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setPassword("sasasasa");
		pageBean.setAddress("Pune@");
		pageBean.clickSignUp();
	}

	@Then("^'User address must have alphanumeric characters only' alert message should display$")
	public void user_address_must_have_alphanumeric_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="User address must have alphanumeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}
	
	@When("^User is trying to submit request without selecting  valid 'country'$")
	public void user_is_trying_to_submit_request_without_selecting_valid_country() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setAddress("Pune421002");
		pageBean.setCountry("Please select a country");
		pageBean.clickSignUp();
	}

	@Then("^'Select your country from the list' alert message should display$")
	public void select_your_country_from_the_list_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Select your country from the list";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}
	@When("^User is trying to submit request without entring   valid 'zipCode'$")
	public void user_is_trying_to_submit_request_without_entring_valid_zipCode() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCountry("India");
		pageBean.clickSignUp();
	}

	@Then("^'ZIP code must have numeric characters only' alert message should display$")
	public void zip_code_must_have_numeric_characters_only_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="ZIP code must have numeric characters only";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}
	
	@When("^User is trying to submit request without entring  valid 'email'$")
	public void user_is_trying_to_submit_request_without_entring_valid_email() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setZip("423011");
		pageBean.setEmail("satish.mahajan#gmail.com");
		pageBean.clickSignUp();
	}

	@Then("^'You have entered an invalid email address!' alert message should display$")
	public void you_have_entered_an_invalid_email_address_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="You have entered an invalid email address!";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	
	}
	@When("^User is trying to submit request without entring  valid 'gender'$")
	public void user_is_trying_to_submit_request_without_entring_valid_gender() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("satish.mahajan@gmail.com");
		pageBean.clickSignUp();
	}
	@Then("^'Please Select gender' alert message should display$")
	public void please_Select_gender_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please Select gender";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	
	@When("^User is trying to submit request after entring valid set of information$")
	public void user_is_trying_to_submit_request_after_entring_valid_set_of_information() throws Throwable {
		pageBean.setUserId("satish1111");
		pageBean.setUsername("satishmahajan");
		pageBean.setPassword("sasasasa");
		pageBean.setAddress("Pune421002");
		pageBean.setCountry("India");
		pageBean.setZip("423011");
		pageBean.setEmail("satish.mahajan@gmail.com");
		pageBean.setGender("Male");
		pageBean.clickSignUp();
	}

	@Then("^'Your Registration with JobsWorld\\.com has successfully done plz check your registred email addres to activate your profile' alert message should display$")
	public void your_Registration_with_JobsWorld_com_has_successfully_done_plz_check_your_registred_email_addres_to_activate_your_profile_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@After
	public void tearDownStepEnv() {
		driver.close();
	}
}
