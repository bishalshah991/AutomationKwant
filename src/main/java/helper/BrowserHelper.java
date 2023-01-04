package helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import testBase.BaseClass;

import java.util.ArrayList;

public class BrowserHelper extends BaseClass {
    private static final Logger log= LogManager.getLogger(BrowserHelper.class);

    public void BrowserTab(int index)
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        log.info("User Swith to:-"+index);
    }
}
