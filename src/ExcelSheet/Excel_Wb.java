package ExcelSheet;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_Wb {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C://My Data//browsers//testdatafilexls.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("TestData1");
		int row=s.getRows();
		int col=s.getColumns();
		System.out.println("no fo rows"+row);
		System.out.println("no of column:"+col);
		String inputdata[][]=new String[row][col];
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++){
				Cell c=s.getCell(j,i);
				inputdata[i][j]=c.getContents();
				System.out.println(inputdata[i][j]);
			}
		}
		

	}

}
