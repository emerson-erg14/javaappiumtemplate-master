package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LocalWebScreen extends PageBase {

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[9]")
    private MobileElement btnMenuLocalWeb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTituloLocalWeb;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText[1]")
    private MobileElement lblUsername;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText[2]")
    private MobileElement lblPass;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]")
    private MobileElement lblResul;

    public void ClicarMenuLocalWeb()
    {
        click(btnMenuLocalWeb);
    }
    public String validaTituloLocalWeb(){
        return getText(txtTituloLocalWeb);
    }
    public String validaLocalWeb(){
        return getText(lblResul);
    }
    public void LimparUser()
    {
        clear(lblUsername);
    }
    public void LimparPass()
    {
        clear(lblPass);
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
