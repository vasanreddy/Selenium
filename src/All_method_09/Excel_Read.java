package All_method_09;

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

	FileInputStream file=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
	Workbook wb=Workbook.getWorkbook(file);
	Sheet sh=wb.getSheet("TestData1");
	int rownum=sh.getRows();
	int column=sh.getColumns();
	System.out.println("total rows"+rownum);
	System.out.println("total rows"+column);
	String inputdata[][]=new String[rownum][column];
	
	for(int i=1;i<rownum;i++){
		
		for(int j=0;j<column;j++){
			Cell c=sh.getCell(j,i);
			inputdata[i][j]=c.getContents();
			System.out.println(inputdata[i][j]);
			
		}
	}
	
	
	
	
	}

}
