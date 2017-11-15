package After_Home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet("TestData1");
		int rownum=s.getRows();
		int column=s.getColumns();
		System.out.println("number of columnns:"+rownum);
		System.out.println("number of rows:"+column);
		String InputData[][]=new String [rownum][column];
		
		for(int i=1;i<rownum;i++){
			
			for(int j=0;j<column;j++){
				
				Cell c=s.getCell(j,i);
				InputData[i][j]=c.getContents();
				System.out.println(InputData[i][j]);
				
			}
		}
		

	}

}
