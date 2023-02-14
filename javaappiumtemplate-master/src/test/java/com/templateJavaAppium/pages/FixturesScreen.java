package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FixturesScreen extends PageBase {

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[10]")
    private MobileElement btnMenuFixtures;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTituloMenuFixtures;

    @AndroidFindBy(xpath = "//android.widget.TextView[normalize-space(@text) = 'Long:']")
    private MobileElement txtFixtures1;

    @AndroidFindBy(xpath = "//android.widget.TextView[normalize-space(@text) = 'Not Available']")
    private MobileElement txtFixtures2;

    @AndroidFindBy(xpath = "//android.widget.TextView[normalize-space(@text) = 'Lat:']")
    private MobileElement txtFixtures3;

    public void ClicarMenuFixtures()
    {
        click(btnMenuFixtures);
    }
    public String validaTituloMenuFixtures(){
        return getText(txtTituloMenuFixtures);
    }
    public String validaTextoMenuFixtures1(){
        return getText(txtFixtures1);
    }
    public String validaTextoMenuFixtures2(){
        return getText(txtFixtures2);
    }
    public String validaTextoMenuFixtures3(){
        return getText(txtFixtures3);
    }


}
