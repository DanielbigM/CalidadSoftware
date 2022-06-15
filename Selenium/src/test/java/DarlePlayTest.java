/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.sql.Driver;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Margarita E
 */
public class DarlePlayTest {

    public DarlePlayTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Object> vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void darleplay() {
        driver.get("https://soundcloud.com/you/likes");
        driver.manage().window().setSize(new Dimension(1296, 736));
        {
            WebElement element = driver.findElement(By.cssSelector(".m-loaded > .sc-artwork-placeholder-7"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.linkText("Reproducir")).click();
        driver.findElement(By.cssSelector(".playbackSoundBadge__like")).click();
        driver.findElement(By.cssSelector(".playbackSoundBadge__like")).click();
        driver.findElement(By.cssSelector(".playControl")).click();
        driver.findElement(By.linkText("Historial")).click();
        driver.findElement(By.cssSelector(".historicalPlays__item:nth-child(1) .soundTitle__usernameTitleContainer")).click();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
