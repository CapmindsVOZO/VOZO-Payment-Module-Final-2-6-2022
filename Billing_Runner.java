package com.newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Billing_Runner extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		/////////// click appointment cal//////

		// get appointment
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// click pre

		Clickonelement(pom.getAppointmentService().getclickpre());

		// click appoi

		Thread.sleep(3000);

		// Clickonelement(pom.getAppointmentService().getcliccal());
		// clic Date

		// Clickonelement(pom.getAppointmentService().getclidate());

		// click appoi

		Thread.sleep(5000);

		Clickonelement(pom.getAppointmentService().getclicapp());

		/////////// ICD ///////////

		// Click Sevices
		Clickonelement(pom.getAppointmentService().getClickServices());

		// click CPT Codes
		Clickonelement(pom.getAppointmentService().getClickCPTCodes());

		// Enter CPT codes
		sendkeys(pom.getAppointmentService().getEnterCPTCodes(), "v");

		Thread.sleep(2000);

		// click CPT Codes
		Clickonelement(pom.getAppointmentService().getSelectCPTCodes());

		Thread.sleep(2000);
		// Clear fees
		clear(pom.getAppointmentService().getClearFees());

		// Enter Fees
		sendkeys(pom.getAppointmentService().getEnterFees(), "200");

		// click A1 Modifiers
		Clickonelement(pom.getAppointmentService().getclickModifiersA1());

		// select A1 Modifiers
		Clickonelement(pom.getAppointmentService().getselectkModifiersA1());

		Thread.sleep(3000);

		// click Level 2 Modifiers
		Clickonelement(pom.getAppointmentService().getclickModifiersA2());

		// select Level 2 Modifiers
		Clickonelement(pom.getAppointmentService().getselectkModifiersA2());

		Thread.sleep(3000);

		// click Level 3 Modifiers
		Clickonelement(pom.getAppointmentService().getclickModifiersA3());

		// select Level 3 Modifiers
		Clickonelement(pom.getAppointmentService().getselectkModifiersA3());

		// click Level 4 Modifiers
		Clickonelement(pom.getAppointmentService().getclickModifiersA4());

		// select Level 4 Modifiers
		Clickonelement(pom.getAppointmentService().getselectkModifiersA4());

		// Clear quantity
		clear(pom.getAppointmentService().getclearquantity());

		// Enter quantity
		sendkeys(pom.getAppointmentService().getEnterquantity(), "5");

		// Enter pointer
		sendkeys(pom.getAppointmentService().getEnterPointer(), "5");

		// //click Billing
		Clickonelement(pom.getAppointmentService().getClickBilling());

		// click Billing status
		Clickonelement(pom.getAppointmentService().getClickBillingStatus());

		// select Billing status
		Clickonelement(pom.getAppointmentService().getselectBillingStatus());
		//
		//// //click Create Invoice
////	    //Clickonelement(pom.getAppointmentService().getClickCreateInvoice());
		////
////	    //click Add payment
////	    Clickonelement(pom.getAppointmentService().getClickAddPayment());
		////
////	    Thread.sleep(3000);
		////
		//// //click Invoice Balance Button
////	    Clickonelement(pom.getAppointmentService().getClickInvoiceBalance());
		////
////		//select payment method
////	    Selectone(pom.getAppointmentService().getSelectPaymentMethod(),"Cash" );
		////
////	    //click Invoice Balance Button
////	    Clickonelement(pom.getAppointmentService().getClickaddpayment());
		////
		//
		// ICD-10-CM
		Thread.sleep(4000);

		// Click Sevices
		// Clickonelement(pom.getAppointmentService().getclcikservice());

		WebDriverWait wa = new WebDriverWait(driver, 10);
		WebElement ser = wa.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Services']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ser);
		//
		// //click search ICD-10-CM codes
		sendkeys(pom.getAppointmentService().getsearchcodes(), "v");

		// select code
		Clickonelement(pom.getAppointmentService().getselectcode());

		// click Billing
		Clickonelement(pom.getAppointmentService().getClickBilling());

		// click Billing status
		Clickonelement(pom.getAppointmentService().getClickBillingStatus());

		Thread.sleep(2000);

		// select Billing status
		Clickonelement(pom.getAppointmentService().getselectBillingStatus());

		////// click Create Invoice
		//// //Clickonelement(pom.getAppointmentService().getClickCreateInvoice());
		////
		//// //click Add payment
		//// Clickonelement(pom.getAppointmentService().getClickAddPayment());
		////
		//// Thread.sleep(3000);
		////
		////// click Invoice Balance Button
		//// Clickonelement(pom.getAppointmentService().getClickInvoiceBalance());
		////
////		//select payment method
		//// Selectone(pom.getAppointmentService().getSelectPaymentMethod(),"Cash" );
		////
		//// //click Invoice Balance Button
		//// Clickonelement(pom.getAppointmentService().getClickaddpayment());
		////

		//Clickonelement(pom.getAppointmentService().getclickcancel());

		// click appoi

		Thread.sleep(4000);

		Clickonelement(pom.getAppointmentService().getclicserv());

		/////////// HCPCS Code//////////

		// click HCPCS Code

		sendkeys(pom.getAppointmentService().getclicfindhcpc(), "1");

		// click appoi

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclichcpcs());

		// click HCPCS Code

		// sendkeys(pom.getAppointmentService().getsendfee(), "500");

		// clci mod1

		Clickonelement(pom.getAppointmentService().getclicmod1());

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselecmod1());

		// clci mod1

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclicmod2());

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod2());

		// clci mod1

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclicmod3());

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod3());

		// clci mod1

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclicmod4());

		// sele mod1

		// Clickonelement(pom.getAppointmentService().getselemod4());

		// sele quan

		sendkeys(pom.getAppointmentService().getquant(), "2");

		// sele poin

		sendkeys(pom.getAppointmentService().getpointe(), "2");

		// sele ndc

		Clickonelement(pom.getAppointmentService().getNDCPL());

		// sele ndcq
		Thread.sleep(5000);

//		sendkeys(pom.getAppointmentService().getNDCPLqua(), "1");
//		
//		Clickonelement(pom.getAppointmentService().getselNDCPLqua());

		// sele ndcq

//		sendkeys(pom.getAppointmentService().getNDCPLqua(), "2");
//
//		// sele ndcq
//
//		selectone(pom.getAppointmentService().getNDCPUnits(), "ML (MilliLiter)");

		// sele ndcq

		sendkeys(pom.getAppointmentService().geticd9(), "1");

		// sele icd9

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().geticd9sele());

		// clic cus code
		sendkeys(pom.getAppointmentService().getcusco(), "1");

		Clickonelement(pom.getAppointmentService().getcuscosele());
		// get text

		Clickonelement(pom.getAppointmentService().getgetbal());

		gettext(pom.getAppointmentService().getgetbal());
		// sele Billing

		Thread.sleep(3000);

		Clickonelement(pom.getAppointmentService().getBillingsel());

		// crea invo

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getsupbill());

		// clos in

		Thread.sleep(2000);

		Clickonelement(pom.getAppointmentService().getclosenvo());

	}

}
