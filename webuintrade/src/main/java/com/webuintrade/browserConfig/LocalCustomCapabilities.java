package com.webuintrade.browserConfig;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalCustomCapabilities {
    private String systemPath;
    private HtmlUnitDriver driver;

    public LocalCustomCapabilities()
    {
        this.systemPath = System.getProperty("user.dir");
    }

    public WebDriver getFirefoxDriver(){

        String firefoxPath = systemPath+"/driverspackage/geckoforfirefox/geckodriver.exe";
        System.setProperty("webDriver.gecko.driver", firefoxPath);
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        return new FirefoxDriver(profile);

    }

    public WebDriver getIEDriver(){

        String iePath = systemPath+"                  ";
        System.setProperty("webdriver.ie.driver", iePath);
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setPlatform(Platform.WIN10);
        caps.setJavascriptEnabled(true);
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        return  new InternetExplorerDriver(caps);

    }

    public WebDriver getChromeDriver(){
        String chromePath = systemPath+"   ";
        System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--enable-javascript");
        return new ChromeDriver(chromeOptions);
    }

    public WebDriver setHtmlChromeUnitDriver(){
        driver = new HtmlUnitDriver(BrowserVersion.CHROME);
        ((HtmlUnitDriver)driver).setJavascriptEnabled(true);
        return driver;
    }

    public WebDriver getMicrosoftEdgeDriver(){
        String microsoftEdgePath = systemPath+"  ";
        System.setProperty("webdriver.edge.driver", microsoftEdgePath); //Put actual Location
        return new EdgeDriver();
    }






}
