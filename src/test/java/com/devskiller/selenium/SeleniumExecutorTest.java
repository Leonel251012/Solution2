package com.devskiller.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static org.junit.Assert.assertEquals;

public class SeleniumExecutorTest extends BaseSeleniumTest {

  @Test
  public void shouldExtractHelloWorldText() {
    webDriver.get("http://localhost:8089/index.html");
    SeleniumExecutor executor = new SeleniumExecutor(webDriver);
    assertEquals("Hello world!", executor.extractHeader());

    webDriver.get("http://localhost:63342/f3b019cb-1e1e-428d-bf59-6347a579740d/selenium-exercise/src/test/resources/__files/index.html?_ijt=4i31u0ukrpaajhr9o8j78aj3r9&_ij_reload=RELOAD_ON_SAVE");
    webDriver.manage().window().maximize();

    System.out.println(webDriver.findElement(By.xpath("/html/body/div/h1")).getText());

    webDriver.close();


  }


  @Test
  public void shouldClickAndExtractLink() {
    webDriver.get("http://localhost:63342/f3b019cb-1e1e-428d-bf59-6347a579740d/selenium-exercise/src/test/resources/__files/index.html?_ijt=4i31u0ukrpaajhr9o8j78aj3r9&_ij_reload=RELOAD_ON_SAVE");
    webDriver.manage().window().maximize();

    WebElement btn = webDriver.findElement(By.id("generateLink()"));

    btn.click();

    System.out.println(webDriver.getCurrentUrl());

    webDriver.close();

  }

  @Test
  public void shouldFindInvisibleText() {
    webDriver.get("http://localhost:63342/f3b019cb-1e1e-428d-bf59-6347a579740d/selenium-exercise/src/test/resources/__files/index.html?_ijt=4i31u0ukrpaajhr9o8j78aj3r9&_ij_reload=RELOAD_ON_SAVE");
    webDriver.manage().window().maximize();

    System.out.println();
  }
}