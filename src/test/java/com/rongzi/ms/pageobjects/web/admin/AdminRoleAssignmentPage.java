package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminRoleAssignmentPage extends BaseClass {

    public AdminRoleAssignmentPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-nav\"]/header/div/input")
    public static WebElement add_role;

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-data\"]/table[@class=\"base\"]/tbody")
    public static List<WebElement> data_recordid;

    @FindBy(how = How.XPATH, using = "//*[@class=\"popEditRole\"]/ul/li[1]/input")
    public static WebElement role_name;

    @FindBy(how = How.XPATH, using = "//*[@class=\"textbox-addon textbox-addon-right\"]")
    public static WebElement authority;

    @FindBy(how = How.XPATH, using = "//*[@class=\"tree\"]/li[1]/div/span[3]")
    public static WebElement user_manager_tab;

    @FindBy(how = How.XPATH, using = "//*[@id=\"btnSubmit\"]")
    public static WebElement submit;

}
