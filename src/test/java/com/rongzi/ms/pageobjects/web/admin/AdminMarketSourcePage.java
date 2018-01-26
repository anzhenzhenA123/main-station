package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminMarketSourcePage extends BaseClass {

    public AdminMarketSourcePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@class=\"ul-searchItems\"]/li[5]")
    public static WebElement clear_btn;

    @FindBy(how=How.XPATH, using="//*[@id=\"SourceName\"]")
    public static WebElement source_name;

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSearch\"]")
    public static WebElement search;

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-nav\"]/header/a")
    public static WebElement add_register_source;

    public static class AddRegisterSourceInformationDiaglog extends BaseClass {

        public AddRegisterSourceInformationDiaglog(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-chanID-container\"]")
        public static WebElement chan_id_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-chanID-results\"]/li")
        public static List<WebElement> chan_id;

        @FindBy(how = How.XPATH, using = "//*[@id=\"addnsourceame\"]")
        public static WebElement add_source_ame;

        @FindBy(how = How.XPATH, using = "//*[@id=\"addcontactname\"]")
        public static WebElement add_contact_ame;

        @FindBy(how = How.XPATH, using = "//*[@id=\"addmobile\"]")
        public static WebElement add_mobile;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-needimportaccount-container\"]")
        public static WebElement chan_import_account_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-needimportaccount-results\"]/li")
        public static List<WebElement> chan_import_account;

        @FindBy(how = How.XPATH, using = "//*[@id=\"importaccount\"]")
        public static WebElement chan_import_uesr_mane;

        @FindBy(how = How.XPATH, using = "//*[@id=\"importaccountpassword\"]")
        public static WebElement chan_import_pwd;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-CHCategoryID-container\"]")
        public static WebElement category_id_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-CHCategoryID-results\"]/li")
        public static List<WebElement> category_id;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-IsPureApi-container\"]")
        public static WebElement api_leads_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-IsPureApi-results\"]/li")
        public static List<WebElement> api_leads;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-BusinessUnit-container\"]")
        public static WebElement business_unit_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-BusinessUnit-results\"]/li")
        public static List<WebElement> business_unit;

        @FindBy(how = How.XPATH, using = "//*[@id=\"Remarks\"]")
        public static WebElement remarks;

        @FindBy(how = How.XPATH, using = "//*[@class=\"btn sure\"]")
        public static WebElement submit;
    }

}
