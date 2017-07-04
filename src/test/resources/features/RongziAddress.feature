# language: zh-CN

@login
功能: 登陆东方融资网

  @index
  场景: 打开首页
    假如 我在主站首页
    那么 主站首页的主题是"上海贷款，上海贷款公司，上海抵押贷款，上海小额贷款-东方融资网"

  @请登陆
  场景: 点击请登陆按钮登陆
    假如 我在主站首页
    当 点击请登陆按钮
    那么 进入登陆页面
    并且 填写登陆信息
    那么 登陆成功

  @user_login
  场景: 点击登陆按钮登陆
    假如 我在主站首页
    当 点击请登陆按钮
    那么 进入登陆页面
    并且 填写登陆信息
    那么 登陆成功

  @zhineng_daikuan
  场景: 首页智能找贷款
    假如 我在主站首页
    当 输入用户信息
    同时 点击智能找贷款
    那么 弹出验证手机号码窗口
    并且 输入验证码信息
    同时 点击提交按钮
    那么 跳转到智能贷，为您精准推荐优质贷款页面。
    并且 填写融资需求信息
    同时 点击快速选贷款按钮
    那么 跳转到测评结果页面。



  场景: 点击页面中部免费体验
    假如 我在主站首页
    当 在页面中部完善融资需求书信息。
    同时 点击中部的免费体验按钮
    那么 弹出手机验证码对话框
    并且 输入图形验证码
    同时 点击获取验证码按钮
    并且 点击提交
    那么 登陆成功

  场景: 点击页面底部免费体验
    假如 我在主站首页
    当 在页面底部完善融资需求书信息。
    同时 点击页面底部免费体验按钮
    那么 弹出手机验证码对话框
    并且 输入图形验证码
    同时 点击获取验证码按钮
    并且 点击提交
    那么 登陆成功

  场景: 进入产品列表页
    假如 我在主站首页
    并且 点击贷款产品
    那么 进入列表页，列表页的主题是"上海汽车抵押贷款，上海房产抵押贷款，无抵押贷款—东方融资网"




