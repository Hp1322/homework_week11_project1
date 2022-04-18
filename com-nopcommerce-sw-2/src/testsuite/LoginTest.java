package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();

        //Validate actual and expected message
        Assert.assertEquals("Not navigate to sign in page", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find log in link and click on login link
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("kp@yahoo.com");

        //Find the password field element
        WebElement passField = driver.findElement(By.name("Password"));
        passField.sendKeys("123456");
        //Click on login button
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        button.click();


        //expected result
        String expectedMsg = "Log out";

        //actual result
        WebElement actualResult = driver.findElement(By.linkText("Log out"));
        String actmsg = actualResult.getText();

        Assert.assertEquals("Unable to Log out",expectedMsg, actmsg);

        //Find log out link and click on logout
        WebElement logOut = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        logOut.click();

    }
    @Test
    public void verifyTheErrorMessage(){
        //Find log in link and click on log in
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find email field element
        WebElement emailField1 = driver.findElement(By.id("Email"));
        emailField1.sendKeys("123@gmail.com");

        //Find password field element
        WebElement passField1 = driver.findElement(By.name("Password"));
        passField1.sendKeys("123456");

        //Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        WebElement actualErrorMessage1 = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        String actualErrorMessage = actualErrorMessage1.getText();

        // Validate actual and expected message
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);

    }
   @After
    public void tearDown(){
        closeBrowser();
   }



}
