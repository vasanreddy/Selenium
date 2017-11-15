package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelEX2 {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet("TestData1");
		int rownu=s.getRows();
		int column=s.getColumns();
		
		String InputStream[][]=new String[rownu][column];
		
		for(int i=1;i<rownu;i++){
			
			for(int j=0;j<column;j++){
				
				Cell c=s.getCell(j, i);
				InputStream[i][j]=c.getContents();
				System.out.println(InputStream[i][j]);
			}
		}
		

	}

}
