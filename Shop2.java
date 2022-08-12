package mystore;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/Cucumber/Features/x.feature",
        plugin = {"pretty","html:out"})


public class Shop2 {
    @SuppressWarnings("TooBroadScope")
    @Given("logged user")
    @When("^a alias (.*) is entered in input field")
    @Then("^a address (.*) is entered in input field")
    @And("^a city (.*) is entered in input field")
    @And("^a zip (.*) is entered in input field")
    @And("^a country (.*) is entered in input field")
    @And("^a phone (.*) is entered in input field")

    public static void main (String [] args) {

        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        signIn.click();
        WebElement eMail = driver.findElement(By.name("email"));
        eMail.click();
        eMail.clear();
        eMail.sendKeys( "edek.testowy@op.pl");
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.click();
        passWord.clear();
        passWord.sendKeys("Edek666");
        WebElement sign = driver.findElement(By.id("submit-login"));
        sign.click();
        WebElement address1 = driver.findElement(By.cssSelector("#footer_account_list > li:nth-child(4) > a:nth-child(1)"));
        address1.click();
        WebElement create = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[2]/a/span"));
        create.click();

        WebElement alias1 = driver.findElement(By.name("alias"));
        alias1.click();
        alias1.clear();
        alias1.sendKeys("Edek@wp.pl");
        WebElement addresses1 = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[6]/div[1]/input"));
        addresses1.click();
        addresses1.clear();
        addresses1.sendKeys("Korfantego 13");
        WebElement post = driver.findElement(By.name("postcode"));
        post.click();
        post.clear();
        post.sendKeys("02-028 ");
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        city.clear();
        city.sendKeys("Katowice");
        WebElement country = driver.findElement(By.name("id_country"));
        country.click();
        WebElement England = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[10]/div[1]/select/option[2]"));
        England.click();
        WebElement phone = driver.findElement(By.name("phone"));
        phone.click();
        phone.clear();
        phone.sendKeys("666-666-666");
        WebElement button = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/footer/button"));
        button.click();
        WebElement success = driver.findElement(By.cssSelector(".alert > ul:nth-child(1) > li:nth-child(1)"));
        String actualText = success.getText();
        System.out.println(success.getText());
        WebElement delate = driver.findElement(By.cssSelector(".address-footer > a:nth-child(2) > span:nth-child(2)"));
        delate.click();
        WebElement success1 = driver.findElement(By.cssSelector(".alert > ul:nth-child(1) > li:nth-child(1)"));
        String actualText1 = success1.getText();
        System.out.println(success1.getText());
        driver.quit();


}}










