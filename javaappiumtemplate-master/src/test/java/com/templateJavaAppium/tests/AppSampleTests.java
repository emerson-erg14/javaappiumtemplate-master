package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AppSampleTests extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;
    AlertsScreen alertsScreen;
    WebScreen webScreen;
    NestedScreen nestedScreen;
    CrashBugScreen crashBugScreen;
    LoginScreen loginScreen;
    LocalWebScreen localWebScreen;
    NativeScreen nativeScreen;
    FixturesScreen fixturesScreen;
    SuplementalScreen suplementalScreen;

    @Test
    public void validaTextFieldTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String TextField = "Desafio";
        String Tiutlo = "Input Controls";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        Thread.sleep(5000);
        Assert.assertEquals(Tiutlo,(inputControlsScreen.validaTextoTituloTelaInput()));
        inputControlsScreen.DigitarTextField(TextField);
        Assert.assertEquals(TextField,(inputControlsScreen.validaTextoDigitadoTextField()));
    }
    @Test
    public void validaCheckboxTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String txtCheckedDisplay1 = "Unchecked";
        String txtCheckedDisplay2 = "Checked";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        Thread.sleep(5000);
        Assert.assertEquals(txtCheckedDisplay1,(inputControlsScreen.validaCheckedDisplay()));
        inputControlsScreen.ClicarNoCheckBox();
        Assert.assertEquals(txtCheckedDisplay2,(inputControlsScreen.validaCheckedDisplay()));
    }
    @Test
    public void validaRadioButtonAmazonEWebTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String radio1 = "Amazon";
        String radio2 = "Web";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        Thread.sleep(5000);
        Assert.assertEquals(radio1,(inputControlsScreen.validaRadioDisplay()));
        inputControlsScreen.ClicarRadioWeb();
        Assert.assertEquals(radio2,(inputControlsScreen.validaRadioDisplay()));
        inputControlsScreen.ClicarRadioAmazon();
    }
    @Test
    public void validaRadioButtonServicesTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String radio3 = "Services";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        Thread.sleep(5000);
        inputControlsScreen.ClicarRadioServices();
        Assert.assertEquals(radio3,(inputControlsScreen.validaRadioDisplay()));
    }
    @Test
    public void validaToggleButtonOFFTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String ToggleOFF = "OFF";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        Thread.sleep(5000);
        Assert.assertEquals(ToggleOFF,(inputControlsScreen.validaSwitchDisplay()));
    }
    @Test
    public void validaToggleButtonONTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String ToggleON = "ON";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        Thread.sleep(5000);
        inputControlsScreen.ClicarEmToggleButton();
        Assert.assertEquals(ToggleON,(inputControlsScreen.validaSwitchDisplay()));
    }
    @Test
    public void validaSpinnerTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String Option1 = "Selected: option 1";
        String Option2 = "Selected: option 2";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        Thread.sleep(5000);
        inputControlsScreen.ClicarEmSpinnerControl();
        inputControlsScreen.ClicarEmOption1();
        Assert.assertEquals(Option1,(inputControlsScreen.validaSpinnerDisplay()));
        inputControlsScreen.ClicarEmSpinnerControl();
        inputControlsScreen.ClicarEmOption2();
        Assert.assertEquals(Option2,(inputControlsScreen.validaSpinnerDisplay()));
    }
    @Test
    public void validaPullToRefreshTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String RefreshTime = "Pull to refresh time";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        Thread.sleep(5000);
        Assert.assertEquals(RefreshTime,(inputControlsScreen.validaRefreshDisplayTime()));
        inputControlsScreen.validaAtualizaHoras();
    }
    @Test
    public void validaTimePickerTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String TimepickerDisplay = "Select a time";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        inputControlsScreen.ClicarMenuTimePicker();
        Thread.sleep(5000);
        Assert.assertEquals(TimepickerDisplay,(inputControlsScreen.validaTimepickerDisplay()));
        inputControlsScreen.ClicarTime1();
    }
    @Test
    public void validaDatePickerTelaInputControls()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String DatePickerDisplay = "7/6/1994";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        inputControlsScreen.ClicarMenuTimePicker();
        inputControlsScreen.ClicarMenuDatePicker();
        Thread.sleep(5000);
        inputControlsScreen.ClicarDataPicker();
        Assert.assertEquals(DatePickerDisplay,(inputControlsScreen.validaDatePickerDisplay()));
    }
    @Test
    public void validaTituloAlert()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        alertsScreen = new AlertsScreen();
        String alertTitulo= "Alerts and Dialogs";
        homeScreen.ClicarMenu();
        alertsScreen.ClicarMenuAlert();
        Thread.sleep(5000);
        Assert.assertEquals(alertTitulo,(alertsScreen.retornaTextoTituloTelaAlert()));

    }
    @Test
    public void validaBotaoAlert()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        alertsScreen = new AlertsScreen();
        String alert = "This is the alert message";
        homeScreen.ClicarMenu();
        alertsScreen.ClicarMenuAlert();
        alertsScreen.ClicarBotaoAlert();
        Assert.assertEquals(alert,(alertsScreen.validaTextoPopUpAlert()));
        alertsScreen.ClicarOK();
    }
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
    @Test
    public void validaTituloCrashBug()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        crashBugScreen = new CrashBugScreen();
        String Titulo = "Crash/Bug Simulator";
        homeScreen.ClicarMenu();
        crashBugScreen.ClicarMenuCrashBug();
        Assert.assertEquals(Titulo,(crashBugScreen.validaTituloCrashBug()));
    }
    @Test
    public void validaCrashBug()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        crashBugScreen = new CrashBugScreen();
        String Pressing = "Pressing this button will crash the app";
        homeScreen.ClicarMenu();
        crashBugScreen.ClicarMenuCrashBug();
        Assert.assertEquals(Pressing,(crashBugScreen.validaDisplayCrashBug()));
        crashBugScreen.ClicarCrash();
    }
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
    @Test
    public void validaTituloLocalWeb() {
        homeScreen = new HomeScreen();
        localWebScreen = new LocalWebScreen();
        String Titulo = "Local Web View";
        homeScreen.ClicarMenu();
        localWebScreen.ClicarMenuLocalWeb();
        Assert.assertEquals(Titulo,(localWebScreen.validaTituloLocalWeb()));
    }
    @Test
    public void validaLocalWeb() {
        homeScreen = new HomeScreen();
        localWebScreen = new LocalWebScreen();
        String user = "emerson";
        String pass = "rodrigues";
        String resul = "Hello! Seattle Washington";
        homeScreen.ClicarMenu();
        localWebScreen.ClicarMenuLocalWeb();
        localWebScreen.LimparUser();
        localWebScreen.DigitarUser(user);
        localWebScreen.LimparPass();
        localWebScreen.DigitarPass(pass);
        Assert.assertEquals(resul,(localWebScreen.validaLocalWeb()));
    }
    @Test
    public void validaTituloNativeComponents() {
        homeScreen = new HomeScreen();
        nativeScreen = new NativeScreen();
        String Titulo = "Native Components";
        homeScreen.ClicarMenu();
        nativeScreen.ClicarMenuNativeComponents();
        Assert.assertEquals(Titulo,(nativeScreen.validaNativeComponent()));
    }
    @Test
    public void validaContentScrollingTelaNativeComponents() {
        homeScreen = new HomeScreen();
        nativeScreen = new NativeScreen();
        String Texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sagittis, purus quis convallis volutpat, nisl sapien placerat nisi, ut dapibus lorem ipsum quis sapien. Quisque a odio non risus tempus semper. In eget dapibus orci. Duis aliquam faucibus dolor nec aliquet. Mauris tristique libero eu placerat facilisis. Suspendisse quis bibendum eros. Etiam suscipit enim a augue luctus varius. Ut ornare leo quam, non tincidunt nibh tempus ac. In pretium mi sapien. Phasellus dictum venenatis lacinia. Fusce sollicitudin, erat ut pharetra pulvinar, massa dui venenatis nisl, vel rutrum neque mauris at est. Vivamus vehicula imperdiet ante, nec commodo metus posuere molestie. Curabitur blandit semper elit ut porta. Suspendisse quis magna varius, eleifend erat et, elementum risus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus erat lorem, lobortis eu mauris nec, aliquam aliquet dui. Nam sed leo gravida, commodo felis in, laoreet ex. Maecenas accumsan tempus neque, sit amet hendrerit ligula ultricies eget. Vestibulum lorem tellus, consectetur ac orci non, auctor luctus enim. Duis magna enim, pretium et pellentesque at, porta eu massa. Nam lacinia justo non tristique cursus. Vivamus luctus metus diam, vel malesuada odio facilisis nec. Sed fermentum orci in lectus varius vehicula. Proin viverra lorem id purus fringilla posuere. Nullam ac ligula sem. Phasellus eget laoreet enim. Etiam in sollicitudin mi. Sed felis libero, accumsan non hendrerit eget, laoreet nec libero. Curabitur feugiat, lectus sed interdum pellentesque, ligula neque volutpat nisi, nec malesuada urna erat nec arcu. Vivamus eget viverra lacus. Donec arcu nisi, cursus a sollicitudin id, consequat vel risus. Pellentesque condimentum risus quam, vel rutrum nulla scelerisque a. Pellentesque ut ornare velit. Ut vestibulum tincidunt ullamcorper. Nam tincidunt iaculis eleifend. Suspendisse potenti. Nunc dignissim dolor eros, sed ornare sapien lobortis in. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque convallis luctus libero sit amet feugiat. Quisque eleifend aliquet purus. Phasellus imperdiet dignissim dolor eu consectetur. Duis aliquam lectus ornare lacus luctus feugiat. Nam eleifend fermentum ligula ultricies hendrerit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tristique molestie lectus, id lacinia purus. Maecenas cursus vel ligula eu ullamcorper. Nulla facilisi. Proin faucibus velit vitae elit convallis cursus. Nam ac molestie sapien, ac mattis nisi. Ut accumsan commodo ex, nec ornare mi malesuada maximus.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sagittis, purus quis convallis volutpat, nisl sapien placerat nisi, ut dapibus lorem ipsum quis sapien. Quisque a odio non risus tempus semper. In eget dapibus orci. Duis aliquam faucibus dolor nec aliquet. Mauris tristique libero eu placerat facilisis. Suspendisse quis bibendum eros. Etiam suscipit enim a augue luctus varius. Ut ornare leo quam, non tincidunt nibh tempus ac. In pretium mi sapien. Phasellus dictum venenatis lacinia. Fusce sollicitudin, erat ut pharetra pulvinar, massa dui venenatis nisl, vel rutrum neque mauris at est. Vivamus vehicula imperdiet ante, nec commodo metus posuere molestie. Curabitur blandit semper elit ut porta. Suspendisse quis magna varius, eleifend erat et, elementum risus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus erat lorem, lobortis eu mauris nec, aliquam aliquet dui. Nam sed leo gravida, commodo felis in, laoreet ex. Maecenas accumsan tempus neque, sit amet hendrerit ligula ultricies eget. Vestibulum lorem tellus, consectetur ac orci non, auctor luctus enim. Duis magna enim, pretium et pellentesque at, porta eu massa. Nam lacinia justo non tristique cursus. Vivamus luctus metus diam, vel malesuada odio facilisis nec. Sed fermentum orci in lectus varius vehicula. Proin viverra lorem id purus fringilla posuere. Nullam ac ligula sem. Phasellus eget laoreet enim. Etiam in sollicitudin mi. Sed felis libero, accumsan non hendrerit eget, laoreet nec libero. Curabitur feugiat, lectus sed interdum pellentesque, ligula neque volutpat nisi, nec malesuada urna erat nec arcu. Vivamus eget viverra lacus. Donec arcu nisi, cursus a sollicitudin id, consequat vel risus. Pellentesque condimentum risus quam, vel rutrum nulla scelerisque a. Pellentesque ut ornare velit. Ut vestibulum tincidunt ullamcorper. Nam tincidunt iaculis eleifend. Suspendisse potenti. Nunc dignissim dolor eros, sed ornare sapien lobortis in. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque convallis luctus libero sit amet feugiat. Quisque eleifend aliquet purus. Phasellus imperdiet dignissim dolor eu consectetur. Duis aliquam lectus ornare lacus luctus feugiat. Nam eleifend fermentum ligula ultricies hendrerit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tristique molestie lectus, id lacinia purus. Maecenas cursus vel ligula eu ullamcorper. Nulla facilisi. Proin faucibus velit vitae elit convallis cursus. Nam ac molestie sapien, ac mattis nisi. Ut accumsan commodo ex, nec ornare mi malesuada maximus.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sagittis, purus quis convallis volutpat, nisl sapien placerat nisi, ut dapibus lorem ipsum quis sapien. Quisque a odio non risus tempus semper. In eget dapibus orci. Duis aliquam faucibus dolor nec aliquet. Mauris tristique libero eu placerat facilisis. Suspendisse quis bibendum eros. Etiam suscipit enim a augue luctus varius. Ut ornare leo quam, non tincidunt nibh tempus ac. In pretium mi sapien. Phasellus dictum venenatis lacinia. Fusce sollicitudin, erat ut pharetra pulvinar, massa dui venenatis nisl, vel rutrum neque mauris at est. Vivamus vehicula imperdiet ante, nec commodo metus posuere molestie. Curabitur blandit semper elit ut porta. Suspendisse quis magna varius, eleifend erat et, elementum risus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus erat lorem, lobortis eu mauris nec, aliquam aliquet dui. Nam sed leo gravida, commodo felis in, laoreet ex. Maecenas accumsan tempus neque, sit amet hendrerit ligula ultricies eget. Vestibulum lorem tellus, consectetur ac orci non, auctor luctus enim. Duis magna enim, pretium et pellentesque at, porta eu massa. Nam lacinia justo non tristique cursus. Vivamus luctus metus diam, vel malesuada odio facilisis nec. Sed fermentum orci in lectus varius vehicula. Proin viverra lorem id purus fringilla posuere. Nullam ac ligula sem. Phasellus eget laoreet enim. Etiam in sollicitudin mi. Sed felis libero, accumsan non hendrerit eget, laoreet nec libero. Curabitur feugiat, lectus sed interdum pellentesque, ligula neque volutpat nisi, nec malesuada urna erat nec arcu. Vivamus eget viverra lacus. Donec arcu nisi, cursus a sollicitudin id, consequat vel risus. Pellentesque condimentum risus quam, vel rutrum nulla scelerisque a. Pellentesque ut ornare velit. Ut vestibulum tincidunt ullamcorper. Nam tincidunt iaculis eleifend. Suspendisse potenti. Nunc dignissim dolor eros, sed ornare sapien lobortis in. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque convallis luctus libero sit amet feugiat. Quisque eleifend aliquet purus. Phasellus imperdiet dignissim dolor eu consectetur. Duis aliquam lectus ornare lacus luctus feugiat. Nam eleifend fermentum ligula ultricies hendrerit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tristique molestie lectus, id lacinia purus. Maecenas cursus vel ligula eu ullamcorper. Nulla facilisi. Proin faucibus velit vitae elit convallis cursus. Nam ac molestie sapien, ac mattis nisi. Ut accumsan commodo ex, nec ornare mi malesuada maximus.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sagittis, purus quis convallis volutpat, nisl sapien placerat nisi, ut dapibus lorem ipsum quis sapien. Quisque a odio non risus tempus semper. In eget dapibus orci. Duis aliquam faucibus dolor nec aliquet. Mauris tristique libero eu placerat facilisis. Suspendisse quis bibendum eros. Etiam suscipit enim a augue luctus varius. Ut ornare leo quam, non tincidunt nibh tempus ac. In pretium mi sapien. Phasellus dictum venenatis lacinia. Fusce sollicitudin, erat ut pharetra pulvinar, massa dui venenatis nisl, vel rutrum neque mauris at est. Vivamus vehicula imperdiet ante, nec commodo metus posuere molestie. Curabitur blandit semper elit ut porta. Suspendisse quis magna varius, eleifend erat et, elementum risus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus erat lorem, lobortis eu mauris nec, aliquam aliquet dui. Nam sed leo gravida, commodo felis in, laoreet ex. Maecenas accumsan tempus neque, sit amet hendrerit ligula ultricies eget. Vestibulum lorem tellus, consectetur ac orci non, auctor luctus enim. Duis magna enim, pretium et pellentesque at, porta eu massa. Nam lacinia justo non tristique cursus. Vivamus luctus metus diam, vel malesuada odio facilisis nec. Sed fermentum orci in lectus varius vehicula. Proin viverra lorem id purus fringilla posuere. Nullam ac ligula sem. Phasellus eget laoreet enim. Etiam in sollicitudin mi. Sed felis libero, accumsan non hendrerit eget, laoreet nec libero. Curabitur feugiat, lectus sed interdum pellentesque, ligula neque volutpat nisi, nec malesuada urna erat nec arcu. Vivamus eget viverra lacus. Donec arcu nisi, cursus a sollicitudin id, consequat vel risus. Pellentesque condimentum risus quam, vel rutrum nulla scelerisque a. Pellentesque ut ornare velit. Ut vestibulum tincidunt ullamcorper. Nam tincidunt iaculis eleifend. Suspendisse potenti. Nunc dignissim dolor eros, sed ornare sapien lobortis in. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque convallis luctus libero sit amet feugiat. Quisque eleifend aliquet purus. Phasellus imperdiet dignissim dolor eu consectetur. Duis aliquam lectus ornare lacus luctus feugiat. Nam eleifend fermentum ligula ultricies hendrerit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tristique molestie lectus, id lacinia purus. Maecenas cursus vel ligula eu ullamcorper. Nulla facilisi. Proin faucibus velit vitae elit convallis cursus. Nam ac molestie sapien, ac mattis nisi. Ut accumsan commodo ex, nec ornare mi malesuada maximus.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sagittis, purus quis convallis volutpat, nisl sapien placerat nisi, ut dapibus lorem ipsum quis sapien. Quisque a odio non risus tempus semper. In eget dapibus orci. Duis aliquam faucibus dolor nec aliquet. Mauris tristique libero eu placerat facilisis. Suspendisse quis bibendum eros. Etiam suscipit enim a augue luctus varius. Ut ornare leo quam, non tincidunt nibh tempus ac. In pretium mi sapien. Phasellus dictum venenatis lacinia. Fusce sollicitudin, erat ut pharetra pulvinar, massa dui venenatis nisl, vel rutrum neque mauris at est. Vivamus vehicula imperdiet ante, nec commodo metus posuere molestie. Curabitur blandit semper elit ut porta. Suspendisse quis magna varius, eleifend erat et, elementum risus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus erat lorem, lobortis eu mauris nec, aliquam aliquet dui. Nam sed leo gravida, commodo felis in, laoreet ex. Maecenas accumsan tempus neque, sit amet hendrerit ligula ultricies eget. Vestibulum lorem tellus, consectetur ac orci non, auctor luctus enim. Duis magna enim, pretium et pellentesque at, porta eu massa. Nam lacinia justo non tristique cursus. Vivamus luctus metus diam, vel malesuada odio facilisis nec. Sed fermentum orci in lectus varius vehicula. Proin viverra lorem id purus fringilla posuere. Nullam ac ligula sem. Phasellus eget laoreet enim. Etiam in sollicitudin mi. Sed felis libero, accumsan non hendrerit eget, laoreet nec libero. Curabitur feugiat, lectus sed interdum pellentesque, ligula neque volutpat nisi, nec malesuada urna erat nec arcu. Vivamus eget viverra lacus. Donec arcu nisi, cursus a sollicitudin id, consequat vel risus. Pellentesque condimentum risus quam, vel rutrum nulla scelerisque a. Pellentesque ut ornare velit. Ut vestibulum tincidunt ullamcorper. Nam tincidunt iaculis eleifend. Suspendisse potenti. Nunc dignissim dolor eros, sed ornare sapien lobortis in. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque convallis luctus libero sit amet feugiat. Quisque eleifend aliquet purus. Phasellus imperdiet dignissim dolor eu consectetur. Duis aliquam lectus ornare lacus luctus feugiat. Nam eleifend fermentum ligula ultricies hendrerit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tristique molestie lectus, id lacinia purus. Maecenas cursus vel ligula eu ullamcorper. Nulla facilisi. Proin faucibus velit vitae elit convallis cursus. Nam ac molestie sapien, ac mattis nisi. Ut accumsan commodo ex, nec ornare mi malesuada maximus.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sagittis, purus quis convallis volutpat, nisl sapien placerat nisi, ut dapibus lorem ipsum quis sapien. Quisque a odio non risus tempus semper. In eget dapibus orci. Duis aliquam faucibus dolor nec aliquet. Mauris tristique libero eu placerat facilisis. Suspendisse quis bibendum eros. Etiam suscipit enim a augue luctus varius. Ut ornare leo quam, non tincidunt nibh tempus ac. In pretium mi sapien. Phasellus dictum venenatis lacinia. Fusce sollicitudin, erat ut pharetra pulvinar, massa dui venenatis nisl, vel rutrum neque mauris at est. Vivamus vehicula imperdiet ante, nec commodo metus posuere molestie. Curabitur blandit semper elit ut porta. Suspendisse quis magna varius, eleifend erat et, elementum risus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus erat lorem, lobortis eu mauris nec, aliquam aliquet dui. Nam sed leo gravida, commodo felis in, laoreet ex. Maecenas accumsan tempus neque, sit amet hendrerit ligula ultricies eget. Vestibulum lorem tellus, consectetur ac orci non, auctor luctus enim. Duis magna enim, pretium et pellentesque at, porta eu massa. Nam lacinia justo non tristique cursus. Vivamus luctus metus diam, vel malesuada odio facilisis nec. Sed fermentum orci in lectus varius vehicula. Proin viverra lorem id purus fringilla posuere. Nullam ac ligula sem. Phasellus eget laoreet enim. Etiam in sollicitudin mi. Sed felis libero, accumsan non hendrerit eget, laoreet nec libero. Curabitur feugiat, lectus sed interdum pellentesque, ligula neque volutpat nisi, nec malesuada urna erat nec arcu. Vivamus eget viverra lacus. Donec arcu nisi, cursus a sollicitudin id, consequat vel risus. Pellentesque condimentum risus quam, vel rutrum nulla scelerisque a. Pellentesque ut ornare velit. Ut vestibulum tincidunt ullamcorper. Nam tincidunt iaculis eleifend. Suspendisse potenti. Nunc dignissim dolor eros, sed ornare sapien lobortis in. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque convallis luctus libero sit amet feugiat. Quisque eleifend aliquet purus. Phasellus imperdiet dignissim dolor eu consectetur. Duis aliquam lectus ornare lacus luctus feugiat. Nam eleifend fermentum ligula ultricies hendrerit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tristique molestie lectus, id lacinia purus. Maecenas cursus vel ligula eu ullamcorper. Nulla facilisi. Proin faucibus velit vitae elit convallis cursus. Nam ac molestie sapien, ac mattis nisi. Ut accumsan commodo ex, nec ornare mi malesuada maximus.";
        homeScreen.ClicarMenu();
        nativeScreen.ClicarMenuNativeComponents();
        nativeScreen.ClicarContentScrolling();
        Assert.assertEquals(Texto,(nativeScreen.validaContentScrolling()));
    }
    @Test
    public void validaTituloFixtures() {
        homeScreen = new HomeScreen();
        fixturesScreen = new FixturesScreen();
        String Titulo = "Fixtures";
        homeScreen.ClicarMenu();
        fixturesScreen.ClicarMenuFixtures();
        Assert.assertEquals(Titulo,(fixturesScreen.validaTituloMenuFixtures()));
    }
    @Test
    public void validaFixtures() {
        homeScreen = new HomeScreen();
        fixturesScreen = new FixturesScreen();
        String Texto1 = "Long:";
        String Texto2 = "Not Available";
        String Texto3 = "Lat:";
        homeScreen.ClicarMenu();
        fixturesScreen.ClicarMenuFixtures();
        Assert.assertEquals(Texto1,(fixturesScreen.validaTextoMenuFixtures1()));
        Assert.assertEquals(Texto2,(fixturesScreen.validaTextoMenuFixtures2()));
        Assert.assertEquals(Texto3,(fixturesScreen.validaTextoMenuFixtures3()));
    }
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
