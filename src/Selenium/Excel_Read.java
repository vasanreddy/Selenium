package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_Read {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
		
		Workbook wb=Workbook.getWorkbook(fis);
		
		Sheet sh=wb.getSheet("TestData1");
		
		int rownum=sh.getRows();
		int colmn=sh.getColumns();
		
		String inputvalue[][]=new String[rownum][colmn];
		
		for(int i=1;i<rownum;i++){
			
			for(int j=0;j<colmn;j++){
				
				
				Cell c=sh.getCell(j,i);
				inputvalue[i][j]=c.getContents();
				System.out.println(inputvalue[i][j]);
			}
		}
		
	}

}
