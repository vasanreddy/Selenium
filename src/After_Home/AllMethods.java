package After_Home;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMethods {

	public static void main(String[] args) throws IOException, BiffException {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();
	
	//implicity
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //Explicity  
     WebDriverWait wait=new WebDriverWait(driver,10);
     wait.until(ExpectedConditions.alertIsPresent());
     //chrome launch
     
     System.setProperty("webdriver.cherome.driver","C://My Data//browsers//chromedriver.exe");
     
     //tacksrennshot
     
    TakesScreenshot ts=(TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("c://my data//print//sceen.png"));
    
    //scroll down 
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("scroll(0,3500)");
    
    //with text
    JavascriptExecutor jsv=(JavascriptExecutor)driver;
    jsv.executeScript("arguments[0].scrollIntoView(true);");
    
    //Action class
    
    Actions actions=new Actions(driver);
    //actions.moveToElement(toElement)
   // actions.dragAndDrop(source, target)
   //actions.doubleClick();
    //actions.contextClick(onElement)
    actions.clickAndHold();
    actions.click();
    //actions.sendKeys(keysToSend)
    
    //Select class
    
    //Select select=new Select(Webelement);
	//select.deselectByIndex(index);
    //select.deselectByIndex(index);
    //select.selectByIndex(index);
   // select.selectByValue(value);
   // select.selectByVisibleText(text);
    
    //Propert File 
    
    Properties prop=new Properties();
    
    File f=new File(System.getProperty("user.dir")+"src\\pAfter_Home\\property.object");
    
    FileReader obj=new FileReader(f);
    
    prop.load(obj);
    
    
    //Excel read 
    
    FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
    Workbook wb=Workbook.getWorkbook(fis);
    Sheet sh=wb.getSheet("TestData1");
    int rownum=sh.getRows();
    int column=sh.getColumns();
    
    String inputdaTA[][]=new String[rownum][column];
    
    for(int i=0;i<rownum;i++){
    	
    	for(int j=1;j<column;j++){
    		
    	Cell c=sh.getCell(j,i);
    	inputdaTA[i][j]=c.getContents();
    	System.out.println(inputdaTA[i][j]);
    	
    	}
    
    
    }
    
    //Database Connection 
    try{
      Class.forName("oracle.jdbc.driver.OracleDriver") ;
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sreerama#123");
      
      Statement stm=con.createStatement();
      ResultSet rst=stm.executeQuery("select * from employee");
      
      while(rst.next())
    	  System.out.println(rst.getInt(1)+" "+rst.getString(2)+"  "+rst.getString(3));
    	  con.close();
      }catch(Exception e){
    	  System.out.println(e);
      }
    
    
    
    //Apachi.poi
    
    FileInputStream fi=new FileInputStream("C://My Data//browsers//testdatafile1.xlsx");
    XSSFWorkbook xb=new XSSFWorkbook(fi);
    XSSFSheet xs=xb.getSheet("TestData1");
    int rowcount=xs.getLastRowNum();
    
    for(int i=0;i<rowcount;i++){
    	
    	String username=xs.getRow(i).getCell(0).getStringCellValue();
    	String password=xs.getRow(i).getCell(1).getStringCellValue();
    	System.out.println(username+"---"+password);
    }
    
    
    //Alerts
    Alert alert=driver.switchTo().alert();
    alert.dismiss();// method clicks on the “Cancel” button as soon as the pop up window appears.
    alert.accept();//method clicks on the “Ok” button as soon as the pop up window appears.
    alert.getText();//method returns the text displayed on the alert box
    //alert.sendKeys(arg0);//method enters the specified string pattern into the alert box.
	}

}
