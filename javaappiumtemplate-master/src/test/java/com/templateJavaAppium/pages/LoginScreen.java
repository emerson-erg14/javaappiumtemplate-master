package com.templateJavaAppium.pages;
import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginScreen extends PageBase
{

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[8]")
    private MobileElement btnMenuLoginPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTituloLoginPage;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @text='username']")
    private MobileElement lblUsername;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @text='password']")
    private MobileElement lblPass;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='LOGIN']")
    private MobileElement btnLogin;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='TRY AGAIN']")
    private MobileElement btnTRYAGAIN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Alt Message\"]")
    private MobileElement txtTryAgain;


    public void ClicarMenuLoginPage()
    {
        click(btnMenuLoginPage);
    }
    public void ClicarTryAgain()
    {
        click(btnTRYAGAIN);
    }
    public void ClicarLogin()
    {
        click(btnLogin);
    }
    public String validaTituloLoginPage(){
        return getText(txtTituloLoginPage);
    }
    public String validaUser(){
        return getText(lblUsername);
    }
    public String validaPass(){
        return getText(lblPass);
    }
    public String validaTryAgain(){
        return getText(txtTryAgain);
    }
    public void DigitarUser(String user)
    {
        sendKeys(lblUsername,user);
    }
    public void DigitarPass(String pass)
    {
        sendKeys(lblPass,pass);
    }

}
