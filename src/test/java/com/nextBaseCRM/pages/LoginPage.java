package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@class = 'login-inp'][@name = 'USER_LOGIN']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@class = 'login-inp'][@name = 'USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class = 'login-btn']")
    public WebElement loginButton;




}
