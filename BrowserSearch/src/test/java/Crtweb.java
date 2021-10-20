import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class  Crtweb {

    @Test
    public void contactsCheck() {
        PageObject open = new PageObject();
        open.openWebsite();

        $("input").click();
        $(withText("контакты")).click();
$("div.t396__elem.tn-elem.tn-elem__2652632611607432917082.t-sbs-anim_started").shouldHave(text("Головной офис"));
        $("div.t396__elem.tn-elem.tn-elem__2652632611607432941982.t-sbs-anim_started").shouldHave(text("Москва, Пресненская набережная, 12"));
        $("div.t396__elem.tn-elem.tn-elem__2652632611608966974876.t-sbs-anim_started").shouldHave(text("Офис разработки"));
        $("div.t396__elem.tn-elem.tn-elem__2652632611607433055242.t-sbs-anim_started").shouldHave(text("Тюмень, ул. Малыгина 84 к1, 7 этаж"));
        $("div.t396__elem.tn-elem.tn-elem__2652632611608966811436.t-sbs-anim_started").shouldHave(text("+7 (499) 113-68-89"));
        $("div.t396__elem.tn-elem.tn-elem__2652632611608966814985.t-sbs-anim_started").shouldHave(text("mail@crtweb.ru"));

        PageObject close = new PageObject();
        close.tearDown();
    }



}

