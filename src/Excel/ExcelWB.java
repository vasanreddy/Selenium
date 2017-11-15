package Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelWB {
	public static void main(String args[]) throws BiffException, IOException
	{
	
	File f=new File("C://My Data//browsers//testdatafilexls.xls");
	Workbook wb=Workbook.getWorkbook(f);
	Sheet s=wb.getSheet("TestData1");
	
	int rows = s.getRows();
	int columns =s.getColumns();
	
	System.out.println("no of rows:" + rows);
	System.out.println("no of columns:" + columns);
	String inputData[][]=new String [rows][columns];

	
	
	for(int i=1;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			Cell c=s.getCell(j, i);
			inputData[i][j]=c.getContents();
			
			//System.out.println(inputData[21][11]);
			
			if(i==21 && j==11){		
				System.out.println(inputData[i][j]);	
			}	
			
		}
	}
	
}

	
}
