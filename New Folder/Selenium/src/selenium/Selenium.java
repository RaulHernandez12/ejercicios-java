/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Raul
 */
public class Selenium {

   
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","C:\\geckodriver");
        WebDriver driver = new FirefoxDriver();
        
        driver.navigate().to("https://www.youtube.com/");
        driver.manage().window().maximize();
        
    }
    
}
