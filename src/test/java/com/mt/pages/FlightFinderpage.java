package com.mt.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mt.config.Config;
import com.mt.utility.LaunchApp;

public class FlightFinderpage {
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objflightfinder;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignoff;
	
	public void loadFlightfinderpage()
	{
		System.out.println("loadFlightfinderpage method under");
		PageFactory.initElements(Config.driver, this);
	}
	public void verifyFlightFinderimg()
	{
		boolean flag=objflightfinder.isDisplayed();	
		System.out.println("Flight finder image is displayed: " +flag);
		}
	public void clickonSignoff()
	{
		System.out.println("hello");
		objsignoff.click();
	}
	
	public static void main(String[] args) throws IOException {
		LaunchApp lp=new LaunchApp();
		lp.openBrowser("chrome");
		lp.EnterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lp.maximizeBrowser();
		lp.waittillLoginpageLoaded(15);
		
		Loginpage lg=new Loginpage();
		lg.loadLoginpage();
		lg.enterUsername("Pratiksha2Bele");
		lg.enterPassword("nidhi@#");
		lg.clickonLogin();
		
		FlightFinderpage fg=new FlightFinderpage();
		fg.loadFlightfinderpage();
		fg.verifyFlightFinderimg();
		fg.clickonSignoff();
		
		
		}	

	}



