package org.pages.Okean;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
        import static com.codeborne.selenide.Selenide.*;

public class JobsPage {

    @FindBy(xpath = "//a[@href='/moy-okean/kak-ustroitsya-na-rabotu-v-vdts-okean']")
    private SelenideElement hhButton;

    @Step("Проверка что страница открыта")
    public JobsPage jobsPageIsOpen() {
        $(By.xpath("/html/body/div[3]/main/div/h2[1]"))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text("Трудоустройство в «Океан»"));

        return this;
    }

    @Step("Проверка что кнопка трудоустройства присутствует")
    public JobsPage buttonExists() {
        hhButton
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text("Трудоустройство в «Океан»"));

        return this;
    }
}
