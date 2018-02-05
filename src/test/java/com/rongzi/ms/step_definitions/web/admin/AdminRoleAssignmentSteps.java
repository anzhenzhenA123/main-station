package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.pageobjects.web.admin.AdminPage;
import com.rongzi.ms.pageobjects.web.admin.AdminRoleAssignmentPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/2/5.
 */
public class AdminRoleAssignmentSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.并且("^点击权限管理下角色分配$")
    public void 点击权限管理下角色分配() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.permission_manage)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.role_assignment)).click();
    }

    @cucumber.api.java.zh_cn.那么("^进入角色分配页面$")
    public void 进入角色分配页面() throws Throwable {
        PageFactory.initElements(driver, AdminRoleAssignmentPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminRoleAssignmentPage.data_recordid.get(0)));
    }

    @cucumber.api.java.zh_cn.并且("^点击新增角色按钮$")
    public void 点击新增角色按钮() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminRoleAssignmentPage.add_role)).click();
    }

    @cucumber.api.java.zh_cn.那么("^出现新增角色弹窗并输入信息提交$")
    public void 出现新增角色弹窗并输入信息提交() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminRoleAssignmentPage.role_name)).sendKeys("测试");
        wait.until(ExpectedConditions.elementToBeClickable(AdminRoleAssignmentPage.authority)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminRoleAssignmentPage.user_manager_tab)).click();
        AdminRoleAssignmentPage.authority.click();
        AdminRoleAssignmentPage.submit.click();
        Thread.sleep(1000 * 2);
    }
}
