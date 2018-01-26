package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.step_definitions.StepDefs;
import com.rongzi.ms.pageobjects.web.admin.AdminMarketSourcePage.AddRegisterSourceInformationDiaglog;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/24.
 */
public class AdminAddRegisterSourceSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.那么("^出现新增来源对话框$")
    public void 出现新增来源对话框() throws Throwable {
        driver.switchTo().frame(driver.findElement(By.id("layui-layer-iframe1")));
        PageFactory.initElements(driver,AddRegisterSourceInformationDiaglog.class);
    }


    @cucumber.api.java.zh_cn.同时("^输入信息并单击确定按钮$")
    public void 输入信息并单击确定按钮() throws Throwable {
        AddRegisterSourceInformationDiaglog.chan_id_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.chan_id.get(4))).click();
        Log.info("所属渠道：BD");

        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.add_source_ame)).sendKeys("测试来源一");
        Log.info("来源名称：测试来源一");

        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.add_contact_ame)).sendKeys("测试李");
        Log.info("联系人姓名：测试李");

        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.add_mobile)).sendKeys("17100002001");
        Log.info("联系人电话：17100002001");

        AddRegisterSourceInformationDiaglog.chan_import_account_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.chan_import_account.get(1))).click();
        Log.info("渠道导入账号：否");

        AddRegisterSourceInformationDiaglog.category_id_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.category_id.get(1))).click();
        Log.info("市场分级：市场2级客户");

        AddRegisterSourceInformationDiaglog.api_leads_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.api_leads.get(0))).click();
        Log.info("市场分级：市场2级客户");

        AddRegisterSourceInformationDiaglog.category_id_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.category_id.get(0))).click();
        Log.info("Api-Leads用户：是");

        AddRegisterSourceInformationDiaglog.business_unit_btn.click();
        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.business_unit.get(2))).click();
        Log.info("业务单元：三产");

        wait.until(ExpectedConditions.visibilityOf(AddRegisterSourceInformationDiaglog.remarks)).sendKeys("备注测试");
        Log.info("备注：备注测试");

        AddRegisterSourceInformationDiaglog.submit.click();
        Thread.sleep(1000 * 2);
    }
}
