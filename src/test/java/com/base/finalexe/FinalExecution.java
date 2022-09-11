package com.base.finalexe;

import com.base.exe.DetailsPageExecution;

public class FinalExecution extends DetailsPageExecution {

	public static void main(String[] args) {
		browserOpen("chrome");
		launchUrl("https://adactinhotelapp.com/index.php");
		userName();
		password();
		click();
		selectLocation();
		selectbt();
		detailsPageExe();	
		}
}
