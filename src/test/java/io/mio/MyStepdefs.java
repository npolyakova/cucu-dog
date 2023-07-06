package io.mio;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {

    @Тогда("Open the door")
    public void openn() {
        System.out.println("The door is opened!");
    }

    @Когда("The door is closed")
    public void isClosed() {
        assert(2 == 2);
    }

    @Given("unauthorized user opened the site")
    public void openUrl() {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://podberi-sobaku.ru";
        open("/");
    }

    @Given("user opened the page \"Free dogs\"")
    public void openPage() {
        open("/sobaki-v-dobrie-ruki");
    }

    @When("user choose a dog with a type filter option")
    public void chooseType() {
        $("[for='pt-ff_razmer-kroshechnaya']").click();
    }

    @Then("user see all dogs which have the chosen type")
    public void checkType() {
        $("[data-name^='filter']").shouldHave(Condition.attribute("data-value", "kroshechnaya"));
    }
}
