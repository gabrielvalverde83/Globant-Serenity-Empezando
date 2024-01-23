package starter.SauceDemo;

import net.serenitybdd.core.steps.UIInteractions;
public class LoginActions extends UIInteractions {

    public void as(User user) {
        openUrl("https://saucedemo.com");

        find("[data-test='username']").sendKeys(user.getUsername());
        find("[data-test='password']").sendKeys(user.getPassword());
        find("[data-test='login-button']").click();


    }

}
