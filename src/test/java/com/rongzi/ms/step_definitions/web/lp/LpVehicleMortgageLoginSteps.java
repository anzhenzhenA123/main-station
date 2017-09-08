package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.LpLoginPageProceed;
import com.rongzi.ms.pageobjects.web.lp.LpVehicleMortgageLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/9/8 0008.
 */
public class LpVehicleMortgageLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在车抵着陆页首页\"([^\"]*)\"$")
    public void 我在车抵着陆页首页(String LpVehicleMortgageIndex) throws Throwable {
       driver.get(LpVehicleMortgageIndex);
    }

    @cucumber.api.java.zh_cn.并且("^输入车抵着陆页用户信息$")
    public void 输入车抵着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpVehicleMortgageLoginPage.class);
        LpVehicleMortgageLoginPage.username.sendKeys("li");
        LpVehicleMortgageLoginPage.mobile.sendKeys("18321950423");

    }

    @cucumber.api.java.zh_cn.同时("^点击车抵着陆页立即咨询$")
    public void 点击车抵着陆页立即咨询() throws Throwable {
        PageFactory.initElements(driver, LpVehicleMortgageLoginPage.class);
        LpVehicleMortgageLoginPage.submit.click();
    }
}
