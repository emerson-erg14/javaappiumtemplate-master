package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeTest extends TestBase {
    HomeScreen homeScreen;

    @Test
    public void verificaTituloMenuHome()throws IOException,InterruptedException{

        String textoTelaMenu = "AWS Device Farm Sample App for Android";
        HomeScreen homeScreen = new HomeScreen();

        Thread.sleep(5000);
       Assert.assertEquals(textoTelaMenu,homeScreen.validaTextoTelaHome());
    }

}
