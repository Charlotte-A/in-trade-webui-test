//package com.webuintrade.infrastucture;
//
//import com.webuintrade.browserConfig.BrowserFactory;
//import com.webuintrade.filereader.ConfigReader;
//import org.junit.After;
//import org.junit.Before;
//
//public class ScenarioHooks {
//
//    private BrowserFactory browserFactory;
//
//    @Before
//    public void testSetUp(){
//        String browser = ConfigReader.getValue("intrade.default.browser");
//        String.executionArea = ConfigReader.getValue("In-Trade.execution.environment");
//        this.browserFactory = new BrowserFactory();
//        browserFactory.setUpBrowser(browser, executionArea);
//    }
//
//
//    @After
//    public void testCleanUp(){
//        browserFactory.tearDownBrowser();
//    }
//
//
//}
