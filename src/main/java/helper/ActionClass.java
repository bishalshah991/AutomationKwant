package helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testBase.BaseClass;

public class ActionClass extends BaseClass {
    private static final Logger log= LogManager.getLogger(ActionClass.class);

    public void Hoverbutton(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click().build().perform();
    }
}
