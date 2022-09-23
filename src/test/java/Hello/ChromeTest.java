package Hello;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeTest {

    WebDriver driver;

    @BeforeClass
    static void setupClass() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        // Verify
        Assert.assertEquals(title,"Hands-On Selenium WebDriver with Java");
    }


}
