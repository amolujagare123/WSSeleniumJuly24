package junit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {

    @Test
    public  void addCustomer() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

       // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();

       /* driver.findElement(By.name("name")).sendKeys("Bijal");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("24242424");
        driver.findElement(By.name("contact2")).sendKeys("42424242");*/

        driver.findElement(By.name("Submit")).click();

        String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals("incorrect or no error message", expected,actual);
    }

    @Test
    public  void addCustomer2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();

        String name = "Bijal3";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("24242424");
        driver.findElement(By.name("contact2")).sendKeys("42424242");

        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals("incorrect or no message", expected,actual);
    }
}
