package com.base.exe;

import com.base.BaseClass;
import com.base.locators.BookingPageLocators;

public class BookingPageExecution extends BookingPageLocators {

	public static void selectLocation() {

		BaseClass.selectIndex(BaseClass.findElementbyxpath(location1), 3);
		BaseClass.selectIndex(BaseClass.findElementbyxpath(location2), 2);
		BaseClass.selectIndex(BaseClass.findElementbyxpath(location3), 3);
		BaseClass.selectIndex(BaseClass.findElementbyxpath(location4), 5);
		BaseClass.clear(BaseClass.findElementbyxpath(location5));
		BaseClass.sendValue(BaseClass.findElementbyxpath(location5), BaseClass.excelread(4, 0));
		BaseClass.clear(BaseClass.findElementbyxpath(location6));
		BaseClass.sendValue(BaseClass.findElementbyxpath(location6), BaseClass.excelread(5, 0));
		BaseClass.selectIndex(BaseClass.findElementbyxpath(location7), 2);
		BaseClass.selectIndex(BaseClass.findElementbyxpath(location8), 3);
		BaseClass.clickElement(BaseClass.findElementbyxpath(location9));
	}

}
