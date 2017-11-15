package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class xls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
	
	HSSFWorkbook hb=new HSSFWorkbook(fis);
	
	HSSFSheet sh=hb.getSheet("TestData1");
	
	int rowcount=sh.getLastRowNum();
	
	for(int i=0;i<rowcount;i++){
		
		
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		String Employee=sh.getRow(i).getCell(2).getStringCellValue();
		System.out.println(username+""+password+""+Employee);

	}
	
	}

}
