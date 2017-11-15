package All_Methods2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Read_Excel {
	
	public static void main(String []args) throws BiffException, IOException{
	
	FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
    Workbook wb=Workbook.getWorkbook(fis);
    Sheet st=wb.getSheet("TestData1");
    int rown=st.getRows();
    int column=st.getColumns();
    System.out.println("dispay the row data"+rown);
    System.out.println("display the column data"+column);
    String Inputdata[][]=new String[rown][column];
    for(int i=1;i<rown;i++){
    	//System.out.println(rown);
    	for(int j=0;j<column;j++){
    		
    		Cell c=st.getCell(j,i);
    		Inputdata[i][j]=c.getContents();
    		System.out.println(Inputdata[i][j]);
    		
    	}
    }

	}	
	

}
