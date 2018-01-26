package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminUserInfoPage extends BaseClass {

    public AdminUserInfoPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSearch\"]")
    public static WebElement search;


    @FindBy(how=How.XPATH, using="//*[@id=\"Cell_phone\"]")
    public static WebElement cellphone;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime\"]")
    public static WebElement regist_starttime;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime2\"]")
    public static WebElement regist_endtime;

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-nav\"]/header/a")
    public static WebElement add_user;

    public static class AddUsersInformationDiaglog extends BaseClass {

        public AddUsersInformationDiaglog(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//*[@id=\"addusername\"]")
        public static WebElement user_name;

        @FindBy(how = How.XPATH, using = "//*[@id=\"uniform-radioman\"]")
        public static WebElement radio_man;

        @FindBy(how = How.XPATH, using = "//*[@id=\"uniform-radiowoman\"]")
        public static WebElement radio_woman;

        @FindBy(how = How.XPATH, using = "//*[@name=\"CellPhoneNumber\"]")
        public static WebElement mobile;

        @FindBy(how = How.XPATH, using = "//*[@name=\"LoanMoney\"]")
        public static WebElement loan_money;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-Identity-container\"]")
        public static WebElement identity_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-Identity-results\"]/li")
        public static List<WebElement> identity;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-City-container\"]")
        public static WebElement city_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-City-results\"]/li")
        public static List<WebElement> city;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-RegisterSource-container\"]")
        public static WebElement register_source_btn;

        @FindBy(how = How.XPATH, using = "//*[@id=\"select2-RegisterSource-results\"]/li")
        public static List<WebElement> register_source;

        @FindBy(how = How.XPATH, using = "//*[@id=\"addremarks\"]")
        public static WebElement remarks;

        @FindBy(how = How.XPATH, using = "//*[@class=\"btn sure\"]")
        public static WebElement submit;
    }

}
