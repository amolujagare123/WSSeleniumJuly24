package screenshotDemo;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddCustomer {

    @Test
    public  void addCustomer() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        // 1. create the object reference of TakesScreenshot
        // assign the current Driver to it. type cast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts (object reference of TakesScreenshot)
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp =  new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";
        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));


    }


}
