package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Find computer tab link and click on computer tab
        WebElement computerTab = driver.findElement(By.linkText("Computers"));
        computerTab.click();

        //expected result
        String expectedResult = "Computers";

        //Actual Result
        WebElement actualMessage1 = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualMessage1.getText();

        //Validate actual and expected message
        Assert.assertEquals("Tab open unsuccessfully", expectedResult, actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find electronics tab link and click on electronics tab
        WebElement electroTab = driver.findElement(By.linkText("Electronics"));
        electroTab.click();

        //expected result
        String expectedResult2 = "Electronics";

        //actual result
        WebElement actualresult2 = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualresult = actualresult2.getText();

        //validate actual and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult2, actualresult);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Find apparel tab link and click on apparel tab link
        WebElement appareltab = driver.findElement(By.linkText("Apparel"));
        appareltab.click();

        //expected result
        String expectedResult = "Apparel";

        //actual result
        WebElement actualResult = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualResult.getText();

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Find digital downloads tab link and click on digital download tab
        WebElement digitaltab = driver.findElement(By.linkText("Digital downloads"));
        digitaltab.click();

        //expected result
        String expectedResult4 = "Digital downloads";
        //actual result
        WebElement actualResult4 = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualResult = actualResult4.getText();

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult4, actualResult);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Find book page tab link and click on book page tab
        WebElement bookTab = driver.findElement(By.linkText("Books"));
        bookTab.click();

        //expected result
        String expectedResult5 = "Books";
        //actual result
        WebElement actualresult5 = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualresult = actualresult5.getText();

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult5, actualresult);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Find jewelry tab link and click on jewelry tab link
        WebElement jewelryTab = driver.findElement(By.linkText("Jewelry"));
        jewelryTab.click();

        //expected result
        String expectedResult6 = "Jewelry";
        //actual result
        WebElement actualresult6 = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualresult = actualresult6.getText();

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult6, actualresult);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Find giftcard tab link and click on giftcard tab link
        WebElement giftTab = driver.findElement(By.linkText("Gift Cards"));
        giftTab.click();

        //expected result
        String expectedResult7 = "Gift Cards";
        //actual result
        WebElement actualresult7 = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualresult = actualresult7.getText();

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult7, actualresult);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }




}
