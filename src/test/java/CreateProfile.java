import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateProfile {


    @Test
    public void CreateProfiles() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://dev.banzae.dev/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1enydpc']"));
        element.click();
        Thread.sleep(3000);

        WebElement element1 = driver.findElement(By.name("firstName"));
        element1.sendKeys("Zoran");
        Thread.sleep(1500);

        WebElement element2 = driver.findElement(By.name("lastName"));
        element2.sendKeys("Malinovski");
        Thread.sleep(1500);

        WebElement element3 = driver.findElement(By.name("email"));
        element3.sendKeys("zoran@mail.com");
        Thread.sleep(1500);

        WebElement element4 = driver.findElement(By.name("phoneNumber"));
        element4.sendKeys("+38970123123");
        Thread.sleep(1500);

        WebElement element5 = driver.findElement(By.name("additionalInfo"));
        element5.sendKeys("Dobar den Banzae, najbolji ste");
        Thread.sleep(1500);



        WebElement element6 = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
        element6.submit();
        driver.navigate().refresh();




    }
}
