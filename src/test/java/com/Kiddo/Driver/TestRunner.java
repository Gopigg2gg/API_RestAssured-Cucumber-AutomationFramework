package com.Kiddo.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Kiddo.Utils.Log;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/report.html"},

        features = {"src/test/resources/Features"},
        glue = "com.Kiddo.Stepdef", stepNotifications = true, monochrome =true,publish = true

)
public class TestRunner {
    
    public static void setup() {
        Log.startLog("Test Starts from Here");
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        Log.info(timeStamp);
    }

    @AfterClass
    public static void writeExtentReport() {
    	Log.endLog("Test Ends Here");
    }
}