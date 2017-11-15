package All_methods;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_exam {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

	File file =new File("C://My Data//browsers//testdatafilexls.xls");
	Workbook wb=Workbook.getWorkbook(file);
	Sheet s=wb.getSheet("TestData1");
	int row=s.getRows();
	int col=s.getColumns();
	System.out.println("total rows"+row);
	System.out.println("total columa"+col);
	String inputData[][]=new String[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			
			Cell c=s.getCell(j,i);
			inputData[i][j]=c.getContents();
			System.out.println(inputData[i][j]);
			
			
		}
	}

	}

}
