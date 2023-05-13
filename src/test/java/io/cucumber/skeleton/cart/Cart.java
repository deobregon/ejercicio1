package io.cucumber.skeleton.cart;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;

public class Cart {
    public static Performable addCart() {
        return Task.where("{0} adds product to cart",
                Click.on(SearchForm.ADD_CART_BTN_1ST)
        );
    }

    public static Performable pressCartButton(){
        return Task.where("{0} press the cart button",
                Click.on(SearchForm.VIEW_CART_BTN)
        );
    }

    public static Performable goesToGuestChechout() {
        return Task.where("{0} goes to guest checkout",
                Click.on(CheckoutForm.CHECKOUT_BTN),
                Click.on(CheckoutForm.GUEST_RADIO),
                Click.on(CheckoutForm.CONTINUE_BTN)
        );
    }

    public static Performable fillCheckoutForm(String firstname, String lastname, String email, String telephone,
                                               String address, String city, String postcode, String country, String zone) {
        return Task.where("{0} fills checkout form",
                Enter.theValue(firstname).into(CheckoutForm.INPUT_FIRST_NAME),
                Enter.theValue(lastname).into(CheckoutForm.INPUT_LAST_NAME),
                Enter.theValue(email).into(CheckoutForm.INPUT_EMAIL),
                Enter.theValue(telephone).into(CheckoutForm.INPUT_TELEPHONE),
                Enter.theValue(address).into(CheckoutForm.INPUT_ADDRESS),
                Enter.theValue(city).into(CheckoutForm.INPUT_CITY),
                Enter.theValue(postcode).into(CheckoutForm.INPUT_POSTCODE),
                Click.on(CheckoutForm.INPUT_COUNTY),
                        SelectFromOptions.byVisibleText(country).from(CheckoutForm.INPUT_COUNTY),
                Click.on(CheckoutForm.INPUT_ZONE),
                        SelectFromOptions.byVisibleText(zone).from(CheckoutForm.INPUT_ZONE),
                Click.on(CheckoutForm.CONTINUE_TO_PAYMENT_BTN)
        )
                .with("firstname").of(firstname)
                .with("lastname").of(lastname)
                .with("email").of(email)
                .with("telephone").of(telephone)
                .with("address").of(address)
                .with("city").of(city)
                .with("postcode").of(postcode)
                .with("country").of(country)
                .with("zone").of(zone);
    }

    public static Performable clicksOnContinueShipping(){
        return Task.where("{0} clicks on continue",
                Click.on(CheckoutForm.CONTINUE_BTN_SHIPPING));
    }

    public static Performable clicksOnContinuePayment(){
        return Task.where("{0} clicks on continue",
                Click.on(CheckoutForm.CONTINUE_BTN_PAYMENT));
    }


    public static Performable agreeTermsAndConditions(){
        return Task.where("{0} agrees terms and conditions",
                Click.on(CheckoutForm.AGREE_TERMS_INPUT));
    }

    public static Performable clicksOnConfirmOrder(){
        return Task.where("{0} clicks on confirms the order",
                Click.on(CheckoutForm.CONFIRM_ORDER));
    }

}
