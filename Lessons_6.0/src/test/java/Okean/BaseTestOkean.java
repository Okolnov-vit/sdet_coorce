package Okean;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTestOkean {
    @BeforeClass
    void initBeforeClass(){
        Configuration.baseUrl = "https://okean.org";
        Configuration.browserSize = "1920x2100";
        Configuration.timeout = 15000;
    }
}

