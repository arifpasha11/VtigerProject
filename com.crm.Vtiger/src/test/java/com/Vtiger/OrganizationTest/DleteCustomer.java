package com.Vtiger.OrganizationTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Vtiger.GenericLibrary.Baseclass;
import com.crm.Vtiger.GenericLibrary.FileUtility;
import com.crm.Vtiger.GenericLibrary.ListenerImplementation;
import com.crm.Vtiger.GenericLibrary.SeleniumUtility;

import ObjectRepository.Homepage;
import ObjectRepository.OrgainzationPage;
@Listeners(ListenerImplementation.class)
public class DleteCustomer  extends Baseclass

{
	
	@Test
	public void createOrg() throws EncryptedDocumentException, IOException {
	Homepage hp=new Homepage(driver);
	hp.getOrglink().click();
	OrgainzationPage op=new OrgainzationPage(driver);
	op.getPlusicon().click();
	FileUtility f=new FileUtility();
	String name = f.readDataFromExcelString("OrganizationDetails", 1, 1);
	op.getOrgname().sendKeys(name);
	String email = f.readDataFromExcelString("OrganizationDetails", 1, 2);
	op.getEmailaddress().sendKeys(email);
	WebElement industry = op.getIndusrtrydrop();
	SeleniumUtility s=new SeleniumUtility();
	s.selectOptionFromDropdownByContainsText(industry, "Education");
	WebElement type = op.getTypedrop();
	s.selectOptionFromDropdownByContainsText(type, "Customer");
	String billingaddress = f.readDataFromExcelString("OrganizationDetails", 1, 3);
	String shipaddress = f.readDataFromExcelString("OrganizationDetails", 1, 4);
	op.getBillingaddress().sendKeys(billingaddress);
	op.getShippingaddress().sendKeys(shipaddress);
	
	String billingcity = f.readDataFromExcelString("OrganizationDetails", 1, 5);
	String shipcity = f.readDataFromExcelString("OrganizationDetails", 1, 6);
	op.getBillingcity().sendKeys(billingcity);
	op.getShippingcity().sendKeys(shipcity);
	
	String billingstate = f.readDataFromExcelString("OrganizationDetails", 1, 7);
	String shipstate = f.readDataFromExcelString("OrganizationDetails", 1, 8);
	op.getBillingstate().sendKeys(billingstate);
	op.getShippingstate().sendKeys(shipstate);
	
	String billingcountry = f.readDataFromExcelString("OrganizationDetails", 1, 9);
	String shipcountry = f.readDataFromExcelString("OrganizationDetail", 1, 10);
	op.getBillingcountry().sendKeys(billingcountry);
	op.getShippingcountry().sendKeys(shipcountry);
	String desp = f.readDataFromExcelString("OrganizationDetails", 1, 11);
	op.getDesp().sendKeys(desp);
	
	op.getSavebtn().click();
	
}
@Test
public void createOrg1() throws EncryptedDocumentException, IOException {
	Homepage hp=new Homepage(driver);
	hp.getOrglink().click();
	OrgainzationPage op=new OrgainzationPage(driver);
	op.getPlusicon().click();
	FileUtility f=new FileUtility();
	String name = f.readDataFromExcelString("OrganizationDetails", 1, 1);
	op.getOrgname().sendKeys(name);
	String email = f.readDataFromExcelString("OrganizationDetails", 1, 2);
	op.getEmailaddress().sendKeys(email);
	WebElement industry = op.getIndusrtrydrop();
	SeleniumUtility s=new SeleniumUtility();
	s.selectOptionFromDropdownByContainsText(industry, "Education");
	WebElement type = op.getTypedrop();
	s.selectOptionFromDropdownByContainsText(type, "Customer");
	String billingaddress = f.readDataFromExcelString("OrganizationDetails", 1, 3);
	String shipaddress = f.readDataFromExcelString("OrganizationDetails", 1, 4);
	op.getBillingaddress().sendKeys(billingaddress);
	op.getShippingaddress().sendKeys(shipaddress);
	
	String billingcity = f.readDataFromExcelString("OrganizationDetails", 1, 5);
	String shipcity = f.readDataFromExcelString("OrganizationDetails", 1, 6);
	op.getBillingcity().sendKeys(billingcity);
	op.getShippingcity().sendKeys(shipcity);
	
	String billingstate = f.readDataFromExcelString("OrganizationDetails", 1, 7);
	String shipstate = f.readDataFromExcelString("OrganizationDetails", 1, 8);
	op.getBillingstate().sendKeys(billingstate);
	op.getShippingstate().sendKeys(shipstate);
	
	String billingcountry = f.readDataFromExcelString("OrganizationDetails", 1, 9);
	String shipcountry = f.readDataFromExcelString("OrganizationDetail", 1, 10);
	op.getBillingcountry().sendKeys(billingcountry);
	op.getShippingcountry().sendKeys(shipcountry);
	String desp = f.readDataFromExcelString("OrganizationDetails", 1, 11);
	op.getDesp().sendKeys(desp);
	
	op.getSavebtn().click();
	
}


}
