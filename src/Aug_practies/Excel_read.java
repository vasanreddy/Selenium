package Aug_practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_read {
	
	public static void main(String [] args) throws BiffException, IOException{
	
			
		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet("TestData1");
		int rwn=s.getRows();
		int colm=s.getColumns();
		System.out.println("number of rows"+rwn);
		System.out.println("number of columns"+colm);
		String inputdata[][]=new String[rwn][colm];
		
		for(int i=1;i<rwn;i++){
			
			for(int j=0;j<colm;j++){
				Cell c=s.getCell(j,i);
				inputdata[i][j]=c.getContents();
				System.out.println(inputdata[i][j]);
			}
		}
		
	}

}
