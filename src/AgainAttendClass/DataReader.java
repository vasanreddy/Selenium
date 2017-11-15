package AgainAttendClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {
	
	XSSFWorkbook xb;
	XSSFSheet sh;
	
	public DataReader(String excelpath) throws IOException{
			
	  try {
		File src=new File(excelpath);
		  FileInputStream fis=new FileInputStream(src);
			              xb=new XSSFWorkbook(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	// public String getData(int sheetno,int row,int cloumn){
		 
		 //sh=xb.getSheetAt("TestData1");
		// String date=sh.getRow(row).getCell(cloumn).getStringCellValue();
		// xb.close();
	 }
	
	

