package tests.seleniumIleOtomasyon;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.utilities.ReusableMethods;
import tests.utilities.TestBase;

public class P01_yanlisLoginTesti extends TestBase {

    @Test
    public void yanlisEmailTesti(){

        driver.get("https://www.qualitydemy.com/");

        driver.findElement(By.xpath("//a[text()='Accept']")).click();

        WebElement ilkLoginLinki = driver.findElement(By.xpath("//*[text()='Log in']"));

        ilkLoginLinki.click();

        WebElement kullaniciEmailKutusu = driver.findElement(By.id("login-email"));
        kullaniciEmailKutusu.sendKeys("mehmet@abc.com");

        WebElement passwordKutusu = driver.findElement(By.id("login-password"));
        passwordKutusu.sendKeys("Az.123123123");

        driver.findElement(By.xpath("(//*[text()='Login'])[2]"));

        ReusableMethods.bekle(1);

        kullaniciEmailKutusu = driver.findElement(By.id("login-email"));
        Assert.assertTrue(kullaniciEmailKutusu.isDisplayed());


    }

    @Test
    public void yanlisPasswordTesti(){

        driver.get("https://www.qualitydemy.com/");

        driver.findElement(By.xpath("//a[text()='Accept']")).click();

        WebElement ilkLoginLinki = driver.findElement(By.xpath("//*[text()='Log in']"));

        ilkLoginLinki.click();

        WebElement kullaniciEmailKutusu = driver.findElement(By.id("login-email"));
        kullaniciEmailKutusu.sendKeys("a@a.com");

        WebElement passwordKutusu = driver.findElement(By.id("login-password"));
        passwordKutusu.sendKeys("123456");

        driver.findElement(By.xpath("(//*[text()='Login'])[2]"));

        ReusableMethods.bekle(1);

        kullaniciEmailKutusu = driver.findElement(By.id("login-email"));
        Assert.assertTrue(kullaniciEmailKutusu.isDisplayed());


    }

    @Test
    public void yanlisUsernameYanlisPasswordTesti(){

        driver.get("https://www.qualitydemy.com/");

        driver.findElement(By.xpath("//a[text()='Accept']")).click();

        WebElement ilkLoginLinki = driver.findElement(By.xpath("//*[text()='Log in']"));

        ilkLoginLinki.click();

        WebElement kullaniciEmailKutusu = driver.findElement(By.id("login-email"));
        kullaniciEmailKutusu.sendKeys("mehmet@abc.com");

        WebElement passwordKutusu = driver.findElement(By.id("login-password"));
        passwordKutusu.sendKeys("Az.123123123");

        driver.findElement(By.xpath("(//*[text()='Login'])[2]"));

        ReusableMethods.bekle(1);

        kullaniciEmailKutusu = driver.findElement(By.id("login-email"));
        Assert.assertTrue(kullaniciEmailKutusu.isDisplayed());


    }
}



