package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class fleetPage {



    public fleetPage(){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetTab;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-2058013302\"]/div[2]/div[2]/div[2]/div/table")
    public WebElement tableVehicleInfo;


}
