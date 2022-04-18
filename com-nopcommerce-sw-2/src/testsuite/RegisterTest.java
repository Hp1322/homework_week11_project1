package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Find register link and click on register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        //expected result
        String expectedResult = "Register";

        //Actual Result
        WebElement actualMessagee = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualMessage = actualMessagee.getText();

        //Validate actual and expected message
        Assert.assertEquals("Register link is not opening", expectedResult, actualMessage);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //Find register link and click on register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        //select radio gender button
        WebElement radioButton = driver.findElement(By.id("gender-male"));
        radioButton.click();

        //Enter first name
        WebElement firstName = driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Ram");

        //Enter last name
        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Patel");

        //Select day, month and year
        //selecting day
        WebElement day = driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']/option[5]"));
        day.click();
        //Selecting month
        WebElement month = driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']/option[3]"));
        month.click();
        //selecting year
        WebElement year = driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']/option[60]"));
        year.click();

        //Enter email address
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("ramjikijay@gmail.com");

        //Enter password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //Enter confirm password
        WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
        confirmPassword.sendKeys("123456");

        //Click on register button
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerButton.click();

        //Verify the text 'Your registration completed'
        //expected result
        String expectedResult = "Your registration completed";

        //Actual result
        WebElement actualResult1 = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualResult = actualResult1.getText();

        //Validate actual result and expected result
        Assert.assertEquals("Unable to register", expectedResult, actualResult);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
