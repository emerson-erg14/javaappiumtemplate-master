package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NestedScreen extends PageBase {

    @AndroidFindBy( xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[5]")
    private MobileElement btnMenuNested;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTitleMenuNested;

    @AndroidFindBy( xpath = "//android.widget.Button[normalize-space(@text) = 'UP NAVIGATION']")
    private MobileElement btnUPNavigation;

    @AndroidFindBy( xpath = "//android.widget.Button[normalize-space(@text) = 'BACK NAVIGATION']")
    private MobileElement btnBackNavigation;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Navigation']")
    private MobileElement txtNavigation;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Press to go to the next level']")
    private MobileElement txtPressLevel;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Level Display\"]")
    private MobileElement txtDisplayNested;

    @AndroidFindBy( xpath = "//android.widget.Button[normalize-space(@text) = 'NEXT LEVEL']")
    private MobileElement btnNextLevel;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Final Level']")
    private MobileElement txtFinalLevel;

    @AndroidFindBy( xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private MobileElement btnNavigateUp;



    public String validaTituloMenuNested(){
        return getText(txtTitleMenuNested);
    }
    public String validaNavigation(){
        return getText(txtNavigation);
    }
    public String validaFinalLevel(){
        return getText(txtFinalLevel);
    }
    public String validaPressLevel(){
        return getText(txtPressLevel);
    }
    public String validaDisplayNested(){
        return getText(txtDisplayNested);
    }
    public void ClicarMenuNested(){
        click(btnMenuNested);
    }
    public void ClicarUPNavigation(){
        click(btnUPNavigation);
    }
    public void ClicarBackNavigation(){
        click(btnBackNavigation);
    }
    public void ClicarNextLevel(){
        click(btnNextLevel);
    }
    public void ClicarNavigateUp(){
        click(btnNavigateUp);
        click(btnNavigateUp);
    }
    public void ClicarNavigateU(){
        click(btnNavigateUp);
    }


}
