package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertion {

    WebDriver driver;
    // pre condition @before method--> launch browser and navigate url
    @BeforeMethod
    public void openBrowserAndLaunchApplication(){

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @Test
    public void validationOfTitle(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Human Management System";
        Assert.assertEquals(actualTitle,expectedTitle);

        WebElement username=driver.findElement(By.id("txtUsername"));
        Assert.assertTrue(username.isDisplayed());
        System.out.println("I an test code");

 /*       if(expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test has failed");
       }
  */
    }

    //post condition  @after method= close browser
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
