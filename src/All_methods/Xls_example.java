package All_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Workbook;

public class Xls_example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
		HSSFWorkbook hb=new HSSFWorkbook(file);
		HSSFSheet s=hb.getSheet("TestData1");
		int rncw=s.getLastRowNum();
		
		for(int i=0;i<rncw;i++){
			
			String Username=s.getRow(i).getCell(0).getStringCellValue();
			String password=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Username+"---"+password);
		
			
		}

	}

}
