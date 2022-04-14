package stepDefs;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {
    WebDriver driver =null;

    @Given("^I have open the browser$")
    public void openBrowser() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","Users/nirajkumar/Downloads/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);
    }
}
///Users/nirajkumar/Downloads/chromedriver.exe