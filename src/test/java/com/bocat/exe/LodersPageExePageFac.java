package com.bocat.exe;

import com.base.BaseClass;
import com.bocat.locators.LodersPageLoc;

public class LodersPageExePageFac extends LodersPageLoc {
	
	public static void selectLoders() {
		BaseClass.clickElement(new LodersPageLoc().getLoders());
	}
	
	public static void getAllProducts() {
	
		
	}

}
