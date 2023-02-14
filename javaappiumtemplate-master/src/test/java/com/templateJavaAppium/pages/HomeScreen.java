package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreen extends PageBase {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"ReferenceApp\"]")
    private MobileElement menuButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Homepage Headline\"]")
    private MobileElement txtMSGTelaMenu;


    public void ClicarMenu(){
        click(menuButton);
    }
    public void Test(){

        System.out.println(txtMSGTelaMenu.getText());
    }
    public String validaTextoTelaHome(){
        return getText(txtMSGTelaMenu);
    }
}
