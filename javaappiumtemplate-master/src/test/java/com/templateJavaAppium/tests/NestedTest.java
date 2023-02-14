package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.AlertsScreen;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.NestedScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class NestedTest extends TestBase {

    HomeScreen homeScreen;
    NestedScreen nestedScreen;

    @Test
    public void validaTituloNested()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();
        String Titulo = "Nested Views";
        homeScreen.ClicarMenu();
        nestedScreen.ClicarMenuNested();
        Assert.assertEquals(Titulo,(nestedScreen.validaTituloMenuNested()));
    }
    @Test
    public void validaUPNavigationNested()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();
        String Nav = "Navigation";
        String PressLevel = "Press to go to the next level";
        String FinalLevel = "Final Level";
        homeScreen.ClicarMenu();
        nestedScreen.ClicarMenuNested();
        Assert.assertEquals(Nav,(nestedScreen.validaNavigation()));
        nestedScreen.ClicarUPNavigation();
        Assert.assertEquals(PressLevel,(nestedScreen.validaPressLevel()));
        nestedScreen.ClicarNextLevel();
        Assert.assertEquals(FinalLevel,(nestedScreen.validaFinalLevel()));
        nestedScreen.ClicarNavigateUp();
    }
    @Test
    public void validaBackNavigationNested()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();
        String Nav = "Navigation";
        String PressLevel1 = "1";
        String PressLevel2 = "2";
        homeScreen.ClicarMenu();
        nestedScreen.ClicarMenuNested();
        Assert.assertEquals(Nav,(nestedScreen.validaNavigation()));
        nestedScreen.ClicarBackNavigation();
        Assert.assertEquals(PressLevel1,(nestedScreen.validaDisplayNested()));
        nestedScreen.ClicarNextLevel();
        Assert.assertEquals(PressLevel2,(nestedScreen.validaDisplayNested()));
        nestedScreen.ClicarNavigateU();

    }
}
