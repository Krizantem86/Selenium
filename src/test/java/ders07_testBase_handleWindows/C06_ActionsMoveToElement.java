package ders07_testBase_handleWindows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMethod;

public class C06_ActionsMoveToElement extends TestBaseMethod {

    @Test

    public void test01(){

        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
        //   mouse’u bu menunun ustune getirin
        WebElement accountListElementi= driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        Actions actions= new Actions(driver);
        actions.moveToElement(accountListElementi).perform();

        //3- “Create a list” butonuna basin

        driver.findElement(By.xpath("//span[text()='Create a List']")).click();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        WebElement yourLists= driver.findElement(By.xpath("//div[@aria-level='1']"));

        Assert.assertTrue(yourLists.isDisplayed());


    }
}