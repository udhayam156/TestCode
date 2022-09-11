package com.base.exe;

import com.base.BaseClass;
import com.base.locators.DetailsPageLocator;

public class DetailsPageExecution extends DetailsPageLocator {
	
	public static void detailsPageExe() {
		
		BaseClass.sendValue(BaseClass.findElementbyxpath(fsname), BaseClass.excelread(2, 0));
		
		BaseClass.sendValue(BaseClass.findElementbyxpath(lsname), BaseClass.excelread(3, 0));
		
		BaseClass.sendValue(BaseClass.findElementbyxpath(address), BaseClass.excelread(6, 0));
		
		BaseClass.sendValue(BaseClass.findElementbyxpath(cardNo), BaseClass.excelread(7, 0));
		
		BaseClass.selectIndex(BaseClass.findElementbyxpath(cardtype), 3);
		
		BaseClass.selectIndex(BaseClass.findElementbyxpath(month), 4);
		
		BaseClass.selectIndex(BaseClass.findElementbyxpath(year), 12);
		
		BaseClass.sendValue(BaseClass.findElementbyxpath(cvv), BaseClass.excelread(8, 0));
		
		BaseClass.clickElement(BaseClass.findElementbyxpath(booknow));
	}

}
