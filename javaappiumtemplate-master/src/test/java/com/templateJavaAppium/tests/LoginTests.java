package com.templateJavaAppium.tests;
import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    HomeScreen homeScreen;
    LoginScreen loginScreen;

    @Test
    public void validaTituloLoginPage() {
        homeScreen = new HomeScreen();
        loginScreen = new LoginScreen();

        String Titulo = "Login Page";
        homeScreen.ClicarMenu();
        loginScreen.ClicarMenuLoginPage();
        Assert.assertEquals(Titulo,(loginScreen.validaTituloLoginPage()));
    }

    @Test
    public void realizaLoginSucesso() {
        homeScreen = new HomeScreen();
        loginScreen = new LoginScreen();
        String user = "desafio";
        String pass = "desafio";
        String tryagain = "You gave me the wrong username and password";
        homeScreen.ClicarMenu();
        loginScreen.ClicarMenuLoginPage();
        loginScreen.DigitarUser(user);
        loginScreen.DigitarPass(pass);
        loginScreen.ClicarLogin();
        Assert.assertEquals(tryagain,(loginScreen.validaTryAgain()));
        loginScreen.ClicarTryAgain();
    }




}
