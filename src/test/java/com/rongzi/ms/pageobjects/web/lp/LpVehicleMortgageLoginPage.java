package com.rongzi.ms.pageobjects.web.lp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LpVehicleMortgageLoginPage extends BaseClass {

	public LpVehicleMortgageLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"btn_submit\"]")
	public static WebElement submit;

	@FindBy(how=How.XPATH, using="/html/body/div[2]/section[2]/div/a")
	public static WebElement view_details;





}
