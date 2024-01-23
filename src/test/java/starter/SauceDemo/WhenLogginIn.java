package starter.SauceDemo;


import io.cucumber.java.sl.In;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SerenityRunner.class)
public class WhenLogginIn {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;
    InventoryPage inventoryPage;

    @Test
    public void userCanLoginViaTheHomePage(){

        login.as(User.STANDARD_USER);
        Serenity.reportThat("Te inventory oage should include the correct text",
                () -> assertThat(inventoryPage.getHeadind()).isEqualToIgnoringCase("Products")
                );



    }
}
