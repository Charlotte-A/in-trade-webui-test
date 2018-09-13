package com.webuintrade.browserConfig;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    
    protected static WebDriver driver;
    public WebDriver setBrowser(String browserName, String executionArea) throws Throwable
    {
        if (executionArea.equalsIgnoreCase("local")){
            setUpBrowserOnLocalMachine(browserName);
            
        }else if (executionArea.equalsIgnoreCase("romote")){
            setUpBrowserOnRemoteMachine(browserName);
        }else {
            throw new IllegalAccessException("There is no such environment to run the test");
            
        }
        this.prepareBrowser();
        return driver;
        
        
    }

    private void prepareBrowser() {
    }

    private void setUpBrowserOnRemoteMachine(String browserName) {
    }

    private void setUpBrowserOnLocalMachine(String browserName) {
        
    }


}
