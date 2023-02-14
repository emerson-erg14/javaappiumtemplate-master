package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AlertsScreen extends PageBase {

    @AndroidFindBy( xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[7]")
    private MobileElement btnMenuAlert;


    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button")
    private MobileElement btnAlert;


    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/toolbar_title")
    private MobileElement txtTituloTelaAlert;


    @AndroidFindBy(id = "android:id/message")
    private MobileElement txtMSGPopUpAlert;



    @AndroidFindBy(id = "android:id/button1")
    private MobileElement botaoOk;

    public void ClicarMenuAlert(){
        click(btnMenuAlert);
    }

    public void ClicarBotaoAlert(){
        click(btnAlert);
    }

    public String retornaTextoTituloTelaAlert(){
        return getText(txtTituloTelaAlert);
    }

    public String validaTextoPopUpAlert(){
        return getText(txtMSGPopUpAlert);
    }

    public void ClicarOK(){
        click(botaoOk);
    }
}
