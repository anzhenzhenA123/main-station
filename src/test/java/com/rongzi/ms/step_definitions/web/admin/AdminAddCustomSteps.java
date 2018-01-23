package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.web.admin.AdminUserInfoPage.AddUsersInformationDiaglog;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/23.
 */
public class AdminAddCustomSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.那么("^出现新增用户窗口$")
    public void 出现新增用户窗口() throws Throwable {
        driver.switchTo().frame(driver.findElement(By.id("layui-layer-iframe1")));
        PageFactory.initElements(driver, AddUsersInformationDiaglog.class);
    }

    @cucumber.api.java.zh_cn.并且("^输入新增用户信息$")
    public void 输入新增用户信息() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(AddUsersInformationDiaglog.user_name)).sendKeys("测试李");
        Log.info("用户名：测试李");

        wait.until(ExpectedConditions.elementToBeClickable(AddUsersInformationDiaglog.radio_woman)).click();
        Log.info("性别：女士");

        wait.until(ExpectedConditions.visibilityOf(AddUsersInformationDiaglog.mobile)).sendKeys("17700002001");
        Log.info("手机：17700002001");

        wait.until(ExpectedConditions.visibilityOf(AddUsersInformationDiaglog.loan_money)).sendKeys("5");
        Log.info("额度：5万");

        AddUsersInformationDiaglog.identity_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddUsersInformationDiaglog.identity.get(2))).click();
        Log.info("身份：个体户");

        AddUsersInformationDiaglog.city_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddUsersInformationDiaglog.city.get(3))).click();
        Log.info("城市：苏州");

        AddUsersInformationDiaglog.register_source_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddUsersInformationDiaglog.register_source.get(2))).click();
        Log.info("注册来源：产品申请");

        AddUsersInformationDiaglog.remarks.sendKeys("ceshi");
        Log.info("备注：ceshi");

        AddUsersInformationDiaglog.submit.click();
        Thread.sleep(1000 * 2);
    }
}
