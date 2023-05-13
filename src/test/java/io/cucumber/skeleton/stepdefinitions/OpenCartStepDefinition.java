package io.cucumber.skeleton.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import org.openqa.selenium.By;
import io.cucumber.skeleton.cart.Cart;
import io.cucumber.skeleton.cart.SearchFor;
import io.cucumber.skeleton.navigate.NavigateTo;

import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenCartStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) navigate to Homepage")
    public void on_the_OpenCart_home_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theOpenCartHomePage());
    }

    @When("he/she searches for {string}")
    public void search_for(String product) {
        withCurrentActor(
                SearchFor.product(product)
        );
    }

    @When("he/she adds the first result")
    public void add_to_cart() {
        withCurrentActor(
                Cart.addCart()
        );
    }

    @When("he/she verify the products are added")
    public void items_added() throws InterruptedException {
        Target spanTotal = Target.the("total carrito").located(By.id("cart-total"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(spanTotal).text().contains("2 item")
        );

    }

    @When("he/she clicks the cart button")
    public void go_to_cart(){
        withCurrentActor(
                Cart.pressCartButton()
        );
    }

    @When("he/she go to guest checkout")
    public void go_to_guest_checkout(){
        withCurrentActor(
                Cart.goesToGuestChechout()
        );
    }

    @When("he/she fills checkout form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillCheckoutForm(String firstname, String lastname, String email, String telephone, String address, String city, String postcode, String county, String zone){
        withCurrentActor(
                Cart.fillCheckoutForm(firstname, lastname, email, telephone, address, city, postcode, county, zone)
        );
    }

    @When("he/she click on continue button in the shipping information")
    public void sheClickOnContinueButton() {
        withCurrentActor(
                Cart.clicksOnContinueShipping()
        );
    }

    @When("he/she agrees terms and conditions")
    public void sheAgreesTermsAndConditions() {
        withCurrentActor(
                Cart.agreeTermsAndConditions(),
                Cart.clicksOnContinuePayment()
        );
    }


    @When("he/she confirms the order")
    public void sheConfirmsOrder() throws InterruptedException {
       theActorInTheSpotlight().attemptsTo(
                Cart.clicksOnConfirmOrder()
        );
    }

    @Then("he/she validates confirmation message {string}")
    public void validatesMessage(String message) throws InterruptedException {
        Target confirmOrder = Target.the("message").located(By.xpath("//div[@id='content']/h1"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(confirmOrder).text().contains(message)
        );
    }
}
