package com.Vytrack.test;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class testCase1 extends TestBase{

    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();



    @Test
    public void testVehiclePageInfo()  {

        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitFor(3);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleBtn).click().perform();
        BrowserUtils.waitFor(5);

        WebElement table = Driver.getDriver().findElement(By.xpath("//table"));

        List<WebElement> rowData = table.findElements(By.tagName("tr"));

        for(WebElement row : rowData){
            List<WebElement> cellData = row.findElements(By.tagName("td"));

            for(WebElement cell : cellData){
                System.out.println(cell.getText());
            }
        }

        System.out.println(BrowserUtils.getElementsText(rowData));

        String actual = rowData.get(1).getText();
        System.out.println("actual = " + actual);
        String expected =





    }


}
