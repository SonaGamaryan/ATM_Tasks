package factoryMethod;

import org.openqa.selenium.WebDriver;

/**
 * Created by Sona_Gamaryan on 7/20/2017.
 */
public abstract class WebDriverCreator {
    protected WebDriver driver;

    public abstract WebDriver FactoryMethod();
}
