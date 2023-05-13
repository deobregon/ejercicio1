package io.cucumber.skeleton.navigate;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theOpenCartHomePage() {
        return Task.where("{0} opens the Open Cart home page",
                Open.browserOn().the(OpenCartHomePage.class));
    }
}