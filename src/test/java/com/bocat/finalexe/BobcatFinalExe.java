package com.bocat.finalexe;

import com.bocat.exe.LodersPageExePageFac;

public class BobcatFinalExe extends LodersPageExePageFac {

	public static void main(String[] args) {

		browserOpen("chrome");

		launchUrl("https://www.bobcat.com/in/en");
		wait(20);
		clickAlert();
		clickEquipment();
		selectLoders();
		
//		List<WebElement> value = driver.findElements(By.xpath("//div[@data-test-id='product-listing-item__content']"));
//		
//		for (int i = 0; i < value.size(); i++) {
//			String string = value.get(i).getText();
//			System.out.println(string);
		}
	}


