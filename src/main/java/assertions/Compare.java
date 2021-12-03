package assertions;

import org.openqa.selenium.WebDriver;

public class Compare {

    public static boolean validatePageURL(WebDriver driver, String expectedURL) {
        return driver.getCurrentUrl().equalsIgnoreCase(expectedURL);
    }

    public static boolean validatePageTitle(WebDriver driver, String expectedTitle) {
        return driver.getTitle().equalsIgnoreCase(expectedTitle);
    }
}
