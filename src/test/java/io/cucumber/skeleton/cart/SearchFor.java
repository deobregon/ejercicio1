package io.cucumber.skeleton.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchFor {
    public static Performable product(String product) {
        return Task.where("{0} attempts to search for #product",
                Clear.field(SearchForm.SEARCH_FIELD),
                Enter.theValue(product).into(SearchForm.SEARCH_FIELD),
                Click.on(SearchForm.SEARCH_BUTTON)
        ).with("product").of(product);
    }
}
