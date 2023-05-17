import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateProfile {


    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://dev.banzae.dev/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1enydpc']"));
        element.click();
    }
}
