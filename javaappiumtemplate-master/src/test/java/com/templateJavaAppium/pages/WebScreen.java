package com.templateJavaAppium.pages;
import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;

public class WebScreen extends PageBase {

    @AndroidFindBy( xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[2]")
    private MobileElement btnMenuWeb;


    @AndroidFindBy( id = "com.amazonaws.devicefarm.android.referenceapp:id/website_input")
    private MobileElement lblWebURl;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTituloTelaWeb;

    public void ClicarMenuWeb(){
        click(btnMenuWeb);
    }
    public void DigitarURL(String URL){
        sendKeys(lblWebURl,URL);
    }
    public String validaTextoTituloTelaWeb(){
        return getText(txtTituloTelaWeb);
    }

}
