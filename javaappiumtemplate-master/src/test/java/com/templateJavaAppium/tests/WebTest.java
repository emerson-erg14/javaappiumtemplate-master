package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.WebScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class WebTest extends TestBase {
    HomeScreen homeScreen;
    WebScreen webScreen;

    @Test
    public void validaCampoURLWebETela()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        webScreen = new WebScreen();

        String URL = "https://www.base2.com.br/";
        String Tiutlo = "Web View";
        homeScreen.ClicarMenu();
        webScreen.ClicarMenuWeb();
        Thread.sleep(5000);
        Assert.assertEquals(Tiutlo,(webScreen.validaTextoTituloTelaWeb()));
        webScreen.DigitarURL(URL);
    }

}
