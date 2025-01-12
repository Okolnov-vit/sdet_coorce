package org.pages.Okean;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
        import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    @FindBy(xpath = "//a[@href='/kontakti']")
    private SelenideElement contactsButton;

    @FindBy(xpath = "//a[@href='/moy-okean/kak-ustroitsya-na-rabotu-v-vdts-okean']")
    private SelenideElement jobsButton;

    @FindBy(xpath = "//button[@aria-label='закрыть меню']")
    private SelenideElement menuButton;       // не использовать

    @FindBy(xpath = "//div[@class='container burger']")
    private SelenideElement menu;  // не использовать

    @Step("Проверка наличия  'Контакты', она видима и кликабельна")
    public ContactsPage goToContactsPage() {
        contactsButton
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text("Контакты"))
                .click();

        return page(ContactsPage.class);
    }

    @Step("Проверка что Трудоустройство в.... существует и кликабельна")
    public JobsPage goToJobsPage() {
        jobsButton
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text("Трудоустройство в «Океан»"))
                .click();

        return page(JobsPage.class);
    }

   /* @Step("Проверка что боковое меню скрыто")
    public MainPage menuIsHidden() {
        menu
                .shouldBe(hidden);

        return page(MainPage.class);
    }

    @Step("Проверка наличия кнопки меню и нажать на нее")
    public MainPage clickMenuButton() {
        menuButton
                .shouldBe(exist)
                .shouldBe(visible)
                .click();

        return page(MainPage.class);
    }

    @Step("Проверка что боковое меню показано")
    public MainPage menuIsShow() {
        menu
                .shouldBe(visible);

        return page(MainPage.class);
    }

    */
}