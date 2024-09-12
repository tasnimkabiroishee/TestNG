import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SencondTestNGClass {
    WebDriver driver;

    @BeforeTest
    public void prepare() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Browser opened.");
    }

    @AfterTest
    public void tearDown() {
        try {
            if (driver != null) {
                System.out.println("Attempting to close the browser...");
                driver.quit();
                System.out.println("Browser closed successfully.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while closing the browser: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void openWebsite() throws InterruptedException {
        // No need to instantiate WebDriver here.
        System.out.println("This is the openBrowser test.");
        driver.navigate().to("https://www.instagram.com");
        Thread.sleep(3000);
    }

    @Test
    public void signUp() {
        System.out.println("This is the signUp test.");
    }

    @Test
    public void logIn() {
        System.out.println("This is the logIn test.");
    }

    @Test
    public void addToCart() {
        System.out.println("This is the addToCart test.");
    }

    @Test
    public void logOut() {
        System.out.println("This is the logOut test.");
    }

    @Test
    public void closeBrowser() {
        // No need to instantiate WebDriver here.
        System.out.println("This is the closeBrowser test.");
    }
}
