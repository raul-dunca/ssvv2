package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.DictionaryPage;
import org.example.pages.EmagAddPage;
import org.example.pages.EmagPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUsersEmag {

    EmagPage dictionaryPage;
    EmagAddPage itemPage;


    @Step
    public void click_cart() {
        itemPage.view_cart();
    }


    @Step
    public void check_card(String definition) {
        assertThat(itemPage.getAddedItem(), hasItem(containsString(definition)));
    }

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void is_the_add_page() {
        itemPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }



}
