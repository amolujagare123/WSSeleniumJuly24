import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListDemo {

    public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://stock.scriptinglogic.in/amol.html");


            // 1. find the element
            WebElement multiText = driver.findElement(By.id("multiSel"));

            // 2. create the object of Select class
             Select selText = new Select(multiText);

             Thread.sleep(4000);
             // 3. select the option
                selText.selectByVisibleText("text 3");
                selText.selectByIndex(3);

                Thread.sleep(4000);
       /* selText.deselectByIndex(2);
        selText.deselectByIndex(3);*/

        selText.deselectAll();

    }
}
