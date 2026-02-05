package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginSteps {

    WebDriver driver;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }

    @When("the user enters email {}")
    public void the_user_enters_email(String email) {
        driver.findElement(By.id("login-email")).sendKeys(email);
    }

    @And("the user enters password {}")
    public void the_user_enters_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys(password);
    }

    @And("the user clicks the login submit button")
    public void the_user_clicks_the_login_submit_button() {
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement myLearning =
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/h2")
                ));

        Assert.assertTrue(myLearning.isDisplayed());

    }

    @And("the user should be redirected to the learning materials page")
    public void the_user_should_be_redirected_to_the_learning_materials_page() {
        driver.quit();
    }
}
