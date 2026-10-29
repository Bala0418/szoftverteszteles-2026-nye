package org.NYE.config;

import org.NYE.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.NYE")
public class TestConfig {
    @Bean
    public WebDriver webDriver(WebDriverFactory factory) {
        return factory.getInstance();
    }

    @Bean(destroyMethod = "closeWebDriver")
    public WebDriverFactory webDriverFactory() {
        return new WebDriverFactory();
    }
}
