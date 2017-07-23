package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailsPage extends BaseClass {

	public ProductDetailsPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="/html/body/section[1]/div/div[2]/div[2]/form/div[1]/input")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="/html/body/section[1]/div/div[2]/div[2]/form/div[4]/input")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="/html/body/section[1]/div/div[2]/div[2]/form/input")
	public static WebElement intelligent_loan;







}
