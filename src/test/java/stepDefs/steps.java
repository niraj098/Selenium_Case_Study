package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class steps {
    WebDriver driver;
    String username = System.getenv("BROWSERSTACK_USERNAME");
    String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
    String URL = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";

    @Given("I have open the browser")
    public void launchQAScript() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

    }
}