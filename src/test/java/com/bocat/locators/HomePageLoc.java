package com.bocat.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePageLoc extends BaseClass {

	public HomePageLoc() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[text()='Equipment']")
	private WebElement equipment;

	@FindBy(xpath = "//button[text()='Accept All Cookies']")
	private WebElement click;

	public WebElement getEquipment() {
		return equipment;
	}

	public WebElement getAlert() {
		return click;
	}

}
