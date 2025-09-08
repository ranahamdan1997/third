package test3sep2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3sep2025 {

    @Test
    public void test1() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/watch?v=IVqNY-DCzAo");
        System.out.println("THE TITLE IS: ya rab" + driver.getTitle());
                System.out.println("THE TITLE IS: ya rab222222222" + driver.getTitle());

        driver.quit();
    }
}
