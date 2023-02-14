package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CrashBugScreen extends PageBase {

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[6]")
    private MobileElement btnMenuCrashBug;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTituloCrashBug;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Crash Display\"]")
    private MobileElement txtDisplayCrashBug;

    @AndroidFindBy( xpath = "//android.widget.Button[normalize-space(@text) = 'CRASH']")
    private MobileElement btnCrash;

    public String validaTituloCrashBug(){
        return getText(txtTituloCrashBug);
    }
    public String validaDisplayCrashBug(){
        return getText(txtDisplayCrashBug);
    }
    public void ClicarMenuCrashBug(){
        click(btnMenuCrashBug);
    }
    public void ClicarCrash(){
        click(btnCrash);
    }

}
