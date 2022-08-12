package mystore;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;


import java.io.File;

public class Procurement {




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
        WebElement clothes = driver.findElement(By.xpath("//*[@id=\"category-3\"]/a"));
        clothes.click();
        WebElement sweater = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[2]/div/a/img"));
        sweater.click();
        WebElement size = driver.findElement(By.cssSelector("#group_1"));
        size.click();
        WebElement s = driver.findElement(By.cssSelector("#group_1 > option:nth-child(1)"));
        s.click();
        WebElement size1 = driver.findElement(By.cssSelector("#group_1"));
        size1.click();
        WebElement m = driver.findElement(By.cssSelector("#group_1 > option:nth-child(2)"));
        m.click();
        WebElement quantity1 = driver.findElement(By.cssSelector("#quantity_wanted"));
        quantity1.click();
        quantity1.clear();
        quantity1.sendKeys("5");
        WebElement cart1 = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button"));
        cart1.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement check = driver.findElement(By.cssSelector("a.btn"));
        check.click();
        WebElement check1 = driver.findElement(By.cssSelector("a.btn"));
        check1.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        WebElement cont = driver.findElement(By.cssSelector(".btn"));
        cont.click();
        WebElement shipping = driver.findElement(By.cssSelector("div.delivery-option:nth-child(1) > label:nth-child(2) > div:nth-child(1) > div:nth-child(2)"));
        shipping.click();
        WebElement cont1 = driver.findElement(By.cssSelector("button.continue:nth-child(2)"));
        cont1.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        WebElement agree = driver.findElement(By.cssSelector("#conditions_to_approve\\[terms-and-conditions\\]"));
        agree.click();
        WebElement pay = driver.findElement(By.cssSelector("#payment-option-1"));
        pay.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        WebElement order = driver.findElement(By.cssSelector("div.ps-shown-by-js > button:nth-child(1)"));
        order.click();
        WebElement prize = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section[2]/div/div/div[1]/div/div/div[3]/div/div[3]"));
        String x = prize.getText();
        System.out.println(x);
        WebElement edektestowy = driver.findElement(By.cssSelector(".account > span:nth-child(2)"));
        edektestowy.click();
        WebElement history = driver.findElement(By.cssSelector("#history-link > span:nth-child(1) > i:nth-child(1)"));
        history.click();
       WebElement await = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/table/tbody/tr[1]/td[4]/span"));
       String a = await.getText();
        System.out.println(a);
        WebElement cena = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/table/tbody/tr[1]/td[2]"));
        String v = cena.getText();
        System.out.println(v);
        driver.quit();
    }}