package Aug_practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xlsx {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
		HSSFWorkbook hw=new HSSFWorkbook(file);
		HSSFSheet hf=hw.getSheet("TestData1");
		int rowcount=hf.getLastRowNum();
		
		for(int i=0;i<rowcount;i++){
			
			String Username=hf.getRow(i).getCell(0).getStringCellValue();
			String Password=hf.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(Username+"    "+Password);
		}
	
		
		
	}

}
