package io.cucumber.skeleton.cart;
import org.openqa.selenium.By;
public class SearchForm {
    public static By SEARCH_FIELD = By.xpath("//input[contains(@type, 'text') and contains(@name, 'search')]");
    public static By SEARCH_BUTTON = By.xpath("(//span[@class='input-group-btn']/button)");
    public static By ADD_CART_BTN_1ST = By.xpath("(//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[1])");

    public static By VIEW_CART_BTN = By.xpath("//a[@title='Shopping Cart']");


}
