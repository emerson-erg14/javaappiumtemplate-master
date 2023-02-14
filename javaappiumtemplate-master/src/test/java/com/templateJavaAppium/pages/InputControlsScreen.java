package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class InputControlsScreen extends PageBase {


    @AndroidFindBy( xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[4]")
    private MobileElement btnMenuInput;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTituloTelaInput;

    @AndroidFindBy( xpath = "//android.widget.EditText[@content-desc=\"Text Input Control\"]")
    private MobileElement lblTextField;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Checkbox']")
    private MobileElement btnMenuCheckBox;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Checkbox Display\"]")
    private MobileElement txtCheckedDisplay;

    @AndroidFindBy( xpath = "//android.widget.CheckBox[@content-desc=\"Checkbox Control\"]")
    private MobileElement cbxCheckBox;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Radio Buttons']")
    private MobileElement btnMenuRadioButton;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Radio Button Display\"]")
    private MobileElement txtButtonDisplay;

    @AndroidFindBy( xpath = "//android.widget.RadioButton[@content-desc=\"Radio Button 1\"]")
    private MobileElement rbxAmazon;

    @AndroidFindBy( xpath = "//android.widget.RadioButton[@content-desc=\"Radio Button 2\"]")
    private MobileElement rbxWeb;

    @AndroidFindBy( xpath = "//android.widget.RadioButton[@content-desc=\"Radio Button 3\"]")
    private MobileElement rbxServices;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Toggle Button']")
    private MobileElement btnMenuToggleButton;

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.Switch")
    private MobileElement lblSwitchDisplayOFFON;

    @AndroidFindBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.Switch")
    private MobileElement btnToggleButton;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Spinner']")
    private MobileElement btnMenuSpinner;

    @AndroidFindBy( xpath = "//android.widget.Spinner[@content-desc=\"Spinner Control\"]")
    private MobileElement btnSpinnerControl;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Spinner Display\"]")
    private MobileElement txtSpinnerDisplay;

    @AndroidFindBy( xpath = "//*[@class='android.widget.TextView' and @index='0']")
    private MobileElement btnOption1;

    @AndroidFindBy( xpath = "//*[@class='android.widget.TextView' and @index='1']")
    private MobileElement btnOption2;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Pull To Refresh']")
    private MobileElement btnPullToRefresh;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Date Picker']")
    private MobileElement btnDatePicker;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Refresh Display\"]")
    private MobileElement txtRefreshDisplay;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Refresh Display\"]")
    private MobileElement txtRefreshDisplayTime;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Time Picker']")
    private MobileElement btnMenuTimePicker;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Timepicker Display\"]")
    private MobileElement txtTimepickerDisplay;

    @AndroidFindBy( xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"12\"]")
    private MobileElement btnTime1;

    @AndroidFindBy( xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"6\"]")
    private MobileElement btnTime2;

    @AndroidFindBy( xpath = "//android.widget.TextView[@content-desc=\"Datepicker Display\"]")
    private MobileElement txtDatePickerDisplay;

    @AndroidFindBy( xpath = "//android.view.View[@content-desc=\"06 July 1994\"]")
    private MobileElement btnDataPicker;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Submit Button']")
    private MobileElement btnMenuSubmitButton;

    @AndroidFindBy( id = "com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_action_pad")
    private MobileElement btnSwipeHere;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Gestures']")
    private MobileElement btnMenuGestures;

    @AndroidFindBy( xpath = "//android.widget.TextView[normalize-space(@text) = 'Down Single Tap Up Single tap confirmed']")
    private MobileElement txtGesturesDisplay;

    //android.widget.TextView[@content-desc="Gestures Display"]

    public void ClicarMenuInput(){
        click(btnMenuInput);
    }
    public void ClicarNoCheckBox(){
        click(cbxCheckBox);
    }
    public void DigitarTextField(String TextField){
        sendKeys(lblTextField,TextField);
    }
    public String validaTextoTituloTelaInput(){
        return getText(txtTituloTelaInput);
    }
    public String validaTextoDigitadoTextField(){
        return getText(lblTextField);
    }
    public void ClicarMenuCheckBox(){
        click(btnMenuCheckBox);
    }
    public String validaCheckedDisplay(){
        return getText(txtCheckedDisplay);
    }
    public void ClicarMenuRadioButton(){
        click(btnMenuRadioButton);
    }
    public String validaRadioDisplay(){
        return getText(txtButtonDisplay);
    }
    public void ClicarRadioAmazon(){
        click(rbxAmazon);
    }
    public void ClicarRadioWeb(){
        click(rbxWeb);
    }
    public void ClicarRadioServices(){
        click(rbxServices);
    }
    public void ClicarMenuToggleButton(){
        click(btnMenuToggleButton);
    }
    public String validaSwitchDisplay(){
        return getText(lblSwitchDisplayOFFON);
    }
    public void ClicarEmToggleButton(){
        click(btnToggleButton);
    }
    public void ClicarMenuSpinner(){
        click(btnMenuSpinner);
    }
    public void ClicarMenuSubmitButton(){
        click(btnMenuSubmitButton);
    }
    public void ClicarMenuTimePicker(){
        click(btnMenuTimePicker);
    }
    public void ClicarEmSpinnerControl(){
        click(btnSpinnerControl);
    }
    public void ClicarEmOption1(){
        click(btnOption1);
    }
    public void ClicarEmOption2(){
        click(btnOption2);
    }
    public String validaSpinnerDisplay(){
        return getText(txtSpinnerDisplay);
    }
    public String validaTimepickerDisplay(){
        return getText(txtTimepickerDisplay);
    }
    public void ClicarMenuPullToRefresh(){
        click(btnPullToRefresh);
    }
    public String validaRefreshDisplayTime(){
        return getText(txtRefreshDisplayTime);
    }
    public void validaAtualizaHoras(){
        DesBottonSwipe();
    }
    public void ClicarTime1(){
        click(btnTime1);
    }
    public void ClicarMenuDatePicker(){
        click(btnDatePicker);
    }
    public String validaDatePickerDisplay(){
        return getText(txtDatePickerDisplay);
    }
    public void ClicarDataPicker(){
        click(btnDataPicker);
    }
    public void ClicarMenuGestures(){
        click(btnMenuGestures);
    }
    public void ClicarSwipeHere(){
        click(btnSwipeHere);
    }
    public String validaMSGGesturesDisplay(){
        return getText(txtGesturesDisplay);
    }
}
