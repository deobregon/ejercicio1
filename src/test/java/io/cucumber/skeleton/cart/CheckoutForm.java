package io.cucumber.skeleton.cart;
import org.openqa.selenium.By;
public class CheckoutForm {
    public static By CHECKOUT_BTN = By.xpath("//a[contains(@class, 'btn-primary') and text()='Checkout']");
    public static By GUEST_RADIO = By.xpath("//input[@type='radio' and @value='guest']");
    public static By CONTINUE_BTN = By.xpath("//input[@id='button-account']");

    //BILLING
    public static By INPUT_FIRST_NAME = By.xpath("//input[@id='input-payment-firstname']");
    public static By INPUT_LAST_NAME = By.xpath("//input[@id='input-payment-lastname']");
    public static By INPUT_EMAIL = By.xpath("//input[@id='input-payment-email']");
    public static By INPUT_TELEPHONE = By.xpath("//input[@id='input-payment-telephone']");
    public static By INPUT_ADDRESS = By.xpath("//input[@id='input-payment-address-1']");
    public static By INPUT_CITY = By.xpath("//input[@id='input-payment-city']");
    public static By INPUT_POSTCODE = By.xpath("//input[@id='input-payment-postcode']");
    public static By INPUT_COUNTY = By.xpath("//select[@id='input-payment-country']");
    public static By INPUT_ZONE = By.xpath("//select[@id='input-payment-zone']");
    public static By CONTINUE_TO_PAYMENT_BTN = By.xpath("//input[@id='button-guest']");
    public static By CONTINUE_BTN_SHIPPING = By.xpath("//input[@id='button-shipping-method']");
    public static By CONTINUE_BTN_PAYMENT = By.xpath("//input[@id='button-payment-method']");
    public static By AGREE_TERMS_INPUT = By.xpath("//input[@type='checkbox' and @name='agree']");
    public static By CONFIRM_ORDER = By.xpath("//input[@id='button-confirm']");



}
