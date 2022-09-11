package com.bocat.exe;

import com.base.BaseClass;
import com.bocat.locators.HomePageLoc;

public class HomeExePageFac extends HomePageLoc {

	public static void clickAlert() {

		BaseClass.clickElement(new HomePageLoc().getAlert());

	}

	public static void clickEquipment() {

		BaseClass.clickElement(new HomePageLoc().getEquipment());

	}

}
