package org.pages.Okean;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
        import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {



    @Step("Проверка что страница открыта")
    public ContactsPage contactsPageIsOpen() {
        $(By.xpath("//div[@class='contacts-block mceNonEditable']"))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text("Адрес:"));

        return this;
    }


}

