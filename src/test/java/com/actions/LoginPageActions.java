package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocaters;
import com.utilities.HelperClass;

public class LoginPageActions {
	LoginPageLocaters loginPageLocaters=null;
	String strUsername, strPassword;
	public LoginPageActions() {
		this.loginPageLocaters=new LoginPageLocaters();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocaters);
	}
	public void setUsername(String strUserName) {
		loginPageLocaters.userName.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		loginPageLocaters.pasword.sendKeys(strPassword);
	}
	public void clickLogin() {
		loginPageLocaters.login.click();
	}
	public void login() {
		File file=new File("C:\\Users\\drcha\\Desktop\\SE_Basics\\CucumberPageObjExtentReport\\src\\test\\resources\\Testdata.properties");
		FileInputStream fileInput=null;
		try {
			fileInput=new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}
		strUsername=prop.getProperty("username");
		strPassword=prop.getProperty("password");
		this.setUsername(strUsername);
		this.setPassword(strPassword);
		this.clickLogin();
	}
}