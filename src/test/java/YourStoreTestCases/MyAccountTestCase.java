package YourStoreTestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import BankingBase.BaseClass;
import BankingUtilities.XTentReport;
import YourStorePages.MyAccountPage;

@Listeners(BankingUtilities.TestNGListener.class)

public class MyAccountTestCase extends BaseClass{
 
	@Test
	public void myAccount() throws InterruptedException {

		Report=XTentReport.getReport();
		test=Report.startTest("MyAccount test started");
		//test=Report.startTest("MyAccount test started");
		MyAccountPage ap = new MyAccountPage(driver);
		ap.clickMyAccount();
		test.log(LogStatus.INFO, "Clicked MyAccount");
		String actualTitle=driver.getTitle();
		String expectedTitle ="Your Store";	
		Assert.assertEquals(actualTitle, expectedTitle);

	
	}
	}




