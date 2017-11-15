package practies2;

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
		int rown=s.getRows();
		int coln=s.getColumns();
		String inputData[][]=new String[rown][coln];
		
		for(int i=1;i<rown;i++){
			//System.out.println(rown);
			for(int j=0;j<coln;j++){
				
				Cell c=s.getCell(j,i);
				inputData[i][j]=c.getContents();
				System.out.println(inputData[i][j]);
			}
		}

	}

}
