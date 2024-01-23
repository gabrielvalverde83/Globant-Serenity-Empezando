package starter.SauceDemo;

import net.thucydides.core.pages.PageObject;

public class InventoryPage extends PageObject {

    public String getHeadind(){
        return find(".title").getText();
    }



}
