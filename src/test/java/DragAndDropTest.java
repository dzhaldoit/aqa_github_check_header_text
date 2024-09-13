import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDropTest {

    @Test
    void checkingMovementTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
        sleep(5000);

        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }
}
