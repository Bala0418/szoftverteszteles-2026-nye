package org.NYE.config;

import org.NYE.factory.WebDriverFactory;

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
