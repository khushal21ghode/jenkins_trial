package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.LoginPage;

@Listeners(CustomeListener.class)
public class ActitimeInvalidLoginTestCase  extends BaseTest{
    
	@Test
	public void invalidLoginTestScript() throws EncryptedDocumentException, InterruptedException, IOException
	{
     		   LoginPage lp = new LoginPage(driver);
     		    Flib flib = new Flib();
     		    int rc = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);
     		    
     		  for(int i=1;i<=rc;i++)
     		  {
     		   lp.invalidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 0),flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 1)); 
     		  }
	}
}
