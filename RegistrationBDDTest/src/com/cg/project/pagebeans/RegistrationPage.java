package com.cg.project.pagebeans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	@FindBy(how=How.ID,id="userId")
	private WebElement userId;
	
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	
	@FindBy(how=How.ID,id="username")
	private WebElement username;
	
	@FindBy(how=How.ID,id="address")
	private WebElement address;
	
	@FindBy(how=How.ID,id="country")
	private WebElement country;
	
	@FindBy(how=How.ID,id="zip")
	private WebElement zip;
	
	@FindBy(how=How.ID,id="email")
	private WebElement email;
	
	@FindBy(how=How.ID,id="gender")
	private List<WebElement> gender;
	
	@FindBy(how=How.ID,id="languages")
	private List<WebElement> languages;
	
	@FindBy(className="submit")
	private WebElement submitBtn;
	
	public RegistrationPage() {}

	public String getUserId() {
		return userId.getAttribute("value");
	}

	public void setUserId(String userId) {
		this.userId.sendKeys(userId);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public String getUsername() {
		return username.getAttribute("value");
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public String getAddress() {
		return address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.address.clear();
		this.address.sendKeys(address);
	}

	public String getCountry() {
		return new Select(this.country).getFirstSelectedOption().getText();
	}

	public void setCountry(String country) {
		Select select=new Select(this.country);
		select.selectByVisibleText(country);
	}

	public String getZip() {
		return zip.getAttribute("zip");
	}

	public void setZip(String zip) {
		this.zip.sendKeys(zip);
	}

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.clear();
		this.email.getAttribute(email);
	}

	public String getGender() {
		for(WebElement webElement:gender)
			if(webElement.isSelected())
				return webElement.getAttribute("value");
		return null;
	}

	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male"))
			this.gender.get(0).click();
		else
			this.gender.get(1).clear();
	}

	public String[] getLanguages() {
		return null;
	}

	public void setLanguages(String[] languages) {
		for(String language:languages) {
			if(language.equals("english"))
				this.languages.get(0).click();
			else if(language.equals("nonenglish"))
				this.languages.get(1).click();
		}
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void clickSignUp() {
		submitBtn.submit();		
	}
	  
	
	
}