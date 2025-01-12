package Okean;

import org.pages.Okean.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class OkeanTest extends BaseTestOkean {

    @BeforeMethod
    void initBeforeMethod(){
        open("/");
    }

    @Test(description = "Open Contacts page")
    public void openContactsPageTest(){
        page(MainPage.class)
                .goToContactsPage()
                .contactsPageIsOpen();


        sleep(5000);
    }



    @Test(description = "Check hh link")
    public void linkHhTest(){
        page(MainPage.class)

                .goToJobsPage()
                .jobsPageIsOpen()
                .buttonExists();

        sleep(5000);
    }

}