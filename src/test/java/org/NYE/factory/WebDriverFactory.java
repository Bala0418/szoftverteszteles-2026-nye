package org.NYE.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class WebDriverFactory {
    public static WebDriver webDriver;

    public WebDriver getInstance() {
        if (webDriver == null) {
            // Initialize the WebDriver instance here (e.g., ChromeDriver, FirefoxDriver, etc.)
            webDriver = setupChromeDriver(); // Example for ChromeDriver
        }
        return webDriver;
    }

    public void closeWebDriver() {
        if (Objects.nonNull(webDriver)) {
            webDriver.close();
            webDriver.quit();
            webDriver = null;
        }
    }

    public WebDriver setupChromeDriver()  {
        WebDriverManager.chromedriver().setup();
        var options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }
}
