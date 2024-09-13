import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class ShouldBeHaveTitleTextTest {
    @BeforeAll
    static void setUp() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void checkTitleTextTest() {
        open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a","Enterprise")).click();

        $("#hero-section-brand-heading").shouldHave(exactText("The AI-powered developer platform."));
    }


}
