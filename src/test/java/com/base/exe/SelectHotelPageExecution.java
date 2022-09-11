package com.base.exe;

import com.base.BaseClass;
import com.base.locators.SelectHotelPageLocator;

public class SelectHotelPageExecution extends SelectHotelPageLocator {

	public static void selectbt() {

		BaseClass.clickElement(BaseClass.findElementbyxpath(selectButton));
		BaseClass.clickElement(BaseClass.findElementbyxpath(contButton));
	}

}
