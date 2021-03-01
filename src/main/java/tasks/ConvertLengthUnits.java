package tasks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import models.LengthDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import userinterfaces.LengthDataPage;

import java.time.Duration;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ConvertLengthUnits implements Task {

    private final List<LengthDataModel> lengthData;

    public ConvertLengthUnits(List<LengthDataModel> lengthData) {
        this.lengthData = lengthData;
    }


    public static ConvertLengthUnits with(List<LengthDataModel> lengthData) {
        return Tasks.instrumented(ConvertLengthUnits.class,lengthData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        AndroidDriver<WebElement> driver = getProxiedDriver();
        Dimension dimension = driver.manage().window().getSize();
        int xPosition = dimension.width/2;
        int initialPositionY = dimension.height/2;
        int finalPositionY = dimension.height/4;
        TouchAction action = new TouchAction(driver);

        actor.attemptsTo(
                Click.on(LengthDataPage.UNIT_FROM)
                );
        action.longPress(PointOption.point(xPosition, initialPositionY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(xPosition, finalPositionY))
                .release().perform();
    }
}
