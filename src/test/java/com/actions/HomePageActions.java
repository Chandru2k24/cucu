package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.pages.HomePageLocaters;
import com.utilities.HelperClass;

public class HomePageActions {
	HomePageLocaters homePageLocaters=null;
	public HomePageActions() {
		this.homePageLocaters=new HomePageLocaters();
		PageFactory.initElements(HelperClass.getDriver(), homePageLocaters);
	}
	
	public String getHomePageText() {
		return homePageLocaters.dashboard.getText();
	}
}