package userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LengthDataPage {

    public static final Target LENGHT_AMOUNT = Target.the("Length amount")
            .locatedForAndroid(MobileBy.id("source_value_placeholder"))
            .locatedForIOS(MobileBy.xpath(""));

    public final static Target UNIT_FROM = Target.the("Unit from").
            locatedForAndroid(MobileBy.id("from_units_spinner"))
            .locatedForIOS(MobileBy.xpath(""));

    public final static Target UNIT_FROM_OPTIONS = Target.the("Selects Unit from").
            locatedForAndroid(MobileBy.id("select_dialog_listview"))
            .locatedForIOS(MobileBy.xpath(""));



    public final static Target UNIT_TO = Target.the("Unit to").
            locatedForAndroid(MobileBy.id("to_units_spinner"))
            .locatedForIOS(MobileBy.xpath(""));



    public final static Target RESULTS = Target.the("Results").
            locatedForAndroid(MobileBy.id("target_value_placeholder"))
            .locatedForIOS(MobileBy.xpath(""));

}
