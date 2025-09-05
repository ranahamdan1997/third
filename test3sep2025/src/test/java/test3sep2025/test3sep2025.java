package test3sep2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class test3sep2025 {

    @Test
    void test1() {
        System.out.println("Test started..."); // <-- للتأكد أن الطباعة تظهر

        System.setProperty("webdriver.chrome.driver",
                "/Users/ranahamdan/.cache/selenium/chromedriver/mac-arm64/139.0.7258.154/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.youtube.com/watch?v=IVqNY-DCzAo");
        System.out.println("THE TITLE IS: " + driver.getTitle());

        driver.quit();
        System.out.println("Test finished...");
    }
}
