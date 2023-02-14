package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import com.templateJavaAppium.pages.WebScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

public class InputTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;

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

}
