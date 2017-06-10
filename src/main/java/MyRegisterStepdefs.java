import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 04/06/2017.
 */
public class MyRegisterStepdefs extends RandomEmail {
    WebDriver driver;

    @Given("^I am navigating to the morrison websits$")
    public void iAmNavigatingToTheMorrisonWebsits() throws Throwable {
        driver = new FirefoxDriver();
        driver.get("https://my.morrisons.com/more/");
        driver.manage().window().maximize();

    }

    @And("^i click on rigester$")
    public void iClickOnRigester() throws Throwable {
        driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div[2]/div/div[1]/div/p/a")).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        new Select(driver.findElement(By.xpath("//*[@id='title']"))).selectByValue("Dr");
        System.out.println("selecting Options");

    }

    @When("^I enter details of newuser$")
    public void iEnterDetailsOfNewuser() throws Throwable {
        driver.findElement(By.id("firstName")).sendKeys("David");
        driver.findElement(By.id("lastName")).sendKeys("David");

        driver.findElement(By.id("username")).sendKeys(randomEmail(15));
        driver.findElement(By.id("password")).sendKeys("london123");
        driver.findElement(By.id("confirmPassword")).sendKeys("london123");
        driver.findElement(By.id("postcode")).sendKeys("e12 5df");
        System.out.println("ITS logging ********** and checking as well");



    }

    @And("^I tick on terms&conditions$")
    public void iTickOnTermsConditions() throws Throwable {
        driver.findElement(By.xpath("//*[@id='registrationForm']/div[10]/div/label/input")).click();

    }

    @Then("^I click on register$")
    public void iClickOnRegister() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @And("^I find ful address,select house no,$")
    public void iFindFulAddressSelectHouseNo() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        System.out.println("finding full address------------");
        driver.findElement(By.cssSelector(".button.lookup-btn")).click();

        driver.findElement(By.xpath(".//*[@id='content']/div/div[3]/form/div[2]/div/div[1]/a")).click();
        new Select(driver.findElement(By.xpath(".//*[@id='content']/div/div[3]/form/div[2]/div/div[1]/div[2]/select"))).selectByValue("9");
        //new Select(driver.findElement(By.className("form-field address-select form-field-large ng-pristine ng-valid"))).selectByVisibleText("4");
        System.out.println("finding full address,,,,,,,,,,,,,,,555,5------------");
    }

    @And("^I select my date of birth and gender$")
    public void iSelectMyDateOfBirthAndGender() throws Throwable {
        new Select(driver.findElement(By.xpath("//*[@id='day']"))).selectByValue("5");
        new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByIndex(3);
        new Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByValue("6");
        driver.findElement(By.xpath("//*[@id='content']/div/div[3]/form/div[3]/div/div[2]/label[2]/input")).click();
        System.out.println("entered dob===============-");
    }

    @And("^I enter mobile number and no people$")
    public void iEnterMobileNumberAndNoPeople() throws Throwable {
        driver.findElement(By.xpath("//*[@id='content']/div/div[3]/form/div[3]/div/div[3]/input")).sendKeys("07584466446");
        driver.findElement(By.xpath("//*[@id='content']/div/div[3]/form/div[4]/div/div[2]/ul/li[4]/label/input")).click();
    }

    @And("^I click on continue$")
    public void iClickOnContinue() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='content']/div/div[3]/form/div[5]/input")).click();
        String actual_value = driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div/p")).getText();

        Assert.assertTrue(actual_value.contains("David"));
        driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div/p/a")).click();
        //System.out.println("account logout succfell" + driver.getTitle());
        driver.close();
    }
}
