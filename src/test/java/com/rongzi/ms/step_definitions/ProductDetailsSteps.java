package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.ProductDetailsPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/7/23.
 */
public class ProductDetailsSteps extends StepDefs{
    @那么("^进入到产品详情页$")
    public void 进入到产品详情页() throws Throwable {
        PageFactory.initElements(driver, ProductDetailsPage.class);



    }

    @同时("^输入我个人信息$")
    public void 输入我个人信息() throws Throwable {
        ProductDetailsPage.username.sendKeys("li");
        ProductDetailsPage.mobile.sendKeys("18321950423");
    }

    @并且("^点击智能找贷款$")
    public void 点击智能找贷款() throws Throwable {
        ProductDetailsPage.intelligent_loan.click();
    }
}
