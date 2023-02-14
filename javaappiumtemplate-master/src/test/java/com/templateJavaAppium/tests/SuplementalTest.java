package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.FixturesScreen;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.SuplementalScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuplementalTest extends TestBase {
    HomeScreen homeScreen;
    SuplementalScreen suplementalScreen;

    @Test
    public void validaTituloMenuSuplemental() {
        homeScreen = new HomeScreen();
        suplementalScreen = new SuplementalScreen();
        String Titulo = "Supplemental Uploads";
        homeScreen.ClicarMenu();
        suplementalScreen.DeslizaMenu();
        suplementalScreen.ClicarMenuSuplemental();
        Assert.assertEquals(Titulo,(suplementalScreen.validaTituloMenuSuplemental()));
    }
    @Test
    public void validaExtraDataAdditionalMenuSuplemental() {
        homeScreen = new HomeScreen();
        suplementalScreen = new SuplementalScreen();
        String music = "Music";
        String additional = "Additional App";
        homeScreen.ClicarMenu();
        suplementalScreen.DeslizaMenu();
        suplementalScreen.ClicarMenuSuplemental();
        Assert.assertEquals(music,(suplementalScreen.validaExtradaTaMenuSuplemental()));
        Assert.assertEquals(additional,(suplementalScreen.validaAdditionalAppMenuSuplemental()));
        suplementalScreen.ClicarMenuAdditionalSuplemental();
    }


}
