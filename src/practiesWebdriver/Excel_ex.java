package practiesWebdriver;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Excel_ex {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		File f =new File ("C://My Data//browsers//testdatafilexls.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("TestData1");
		int rows=s.getRows();
		int colm=s.getColumns();
		System.out.println("-----:"+rows);
		System.out.println("----"+colm);
		String inputvalue[][]=new String[rows][colm];
		
		for(int i=1;i<rows;i++){
			//System.out.println("number of rows:"+rows.);
			for(int j=0;j<colm;j++){
				
				Cell c=s.getCell(j, i);
				inputvalue[i][j]=c.getContents();
				System.out.println(inputvalue[i][j]);
			}
		}
		

	}

}
