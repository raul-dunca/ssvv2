
package org.example.features.search;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.EndUserSteps;
import org.example.steps.serenity.EndUsersEmag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/EmagAdd.csv")
public class AddEmag {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    public EndUsersEmag endUser;

    public String definition;


    @Issue("#EMAG-2")
    @Test
    public void cartEmag() {
        endUser.is_the_add_page();
        endUser.click_cart();
        endUser.check_card(getDefinition());
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

}






