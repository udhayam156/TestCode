package com.bocat.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bocat.exe.HomeExePageFac;

public class LodersPageLoc extends HomeExePageFac {

	public LodersPageLoc() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Skid-Steer Loaders']")
	private WebElement loders;

	@FindBy(xpath = "//div[@data-test-id='product-listing-item__content']")
	private List<WebElement> listproducts;

	@FindBy(xpath = "//div[@data-test-id='product-listing-item__content']")
	private List<WebElement> listloders;

	public WebElement getLoders() {
		return loders;
	}

	public List<WebElement> getListProducts() {
		
		
		return listproducts;
	}

	public List<WebElement> getListLoders() {
		return listloders;
	}
}
