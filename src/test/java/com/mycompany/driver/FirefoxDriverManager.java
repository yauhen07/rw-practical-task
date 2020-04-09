package com.mycompany.driver;

import com.codeborne.selenide.Configuration;

public class FirefoxDriverManager extends DefaultDriverManager
{
    public void configureDriver()
    {
        Configuration.browser = defaultDriverConfiguration().getBrowserType().toLowerCase();
        Configuration.browserVersion = defaultDriverConfiguration().getChromeVersion();
    }
}