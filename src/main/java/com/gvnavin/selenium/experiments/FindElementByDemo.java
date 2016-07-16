package com.gvnavin.selenium.experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by gnavin on 5/22/16.
 */
public class FindElementByDemo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println("tagName : " + tagName);
        System.out.println(driver.findElement(By.className("uiContextualLayerParent")));
        System.out.println(driver.findElement(By.cssSelector("input#email")));
        //System.out.println(driver.findElement(By.linkText("REGISTRATION")));
        System.out.println(driver.findElement(By.name("lsd")));
        /*System.out.println(driver.findElement(By.partialLinkText("REG")));*/
        System.out.println(driver.findElement(By.tagName("div")));
        System.out.println(driver.findElement(By.tagName("div")));
        //driver.findElement(By.cssSelector()) //By.cssSelector() does not support the "contains" feature
        //driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[5]"))
        WebElement webElement = driver.findElement(By.id("email"));
        webElement.sendKeys("email@gmail.com");

        WebElement webElement2 = driver.findElement(By.id("pass"));
        webElement2.sendKeys();

        WebElement webElement3 = driver.findElement(By.id("u_0_o"));
        webElement3.click();


        //driver.close();
        //System.exit(0);
    }
}
