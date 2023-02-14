package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SuplementalScreen extends PageBase {

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[10]")
    private MobileElement btnMenuSuplemental;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]\n")
    private MobileElement txtTituloMenuSuplemental;

    @AndroidFindBy(xpath = "//android.widget.TextView[normalize-space(@text) = 'Music']")
    private MobileElement txtExtradaTaSuplemental;

    @AndroidFindBy(xpath = "//android.widget.TextView[normalize-space(@text) = 'Additional App']")
    private MobileElement btnMenuAdditionalSuplemental;

    @AndroidFindBy(xpath = "//android.widget.TextView[normalize-space(@text) = 'Additional App']")
    private MobileElement txtMenuAdditionalSuplemental;


    public void ClicarMenuSuplemental()
    {
        click(btnMenuSuplemental);
    }
    public void DeslizaMenu()
    {
        topToBottonSwipe();
    }
    public String validaTituloMenuSuplemental(){
        return getText(txtTituloMenuSuplemental);
    }
    public String validaExtradaTaMenuSuplemental(){
        return getText(txtExtradaTaSuplemental);
    }
    public String validaAdditionalAppMenuSuplemental(){
        return getText(txtMenuAdditionalSuplemental);
    }
    public void ClicarMenuAdditionalSuplemental()
    {
        click(btnMenuAdditionalSuplemental);
    }
}
