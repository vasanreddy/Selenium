package Excel_xls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Xls_exp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
        HSSFWorkbook hbk=new HSSFWorkbook(fis);
        HSSFSheet hs=hbk.getSheet("TestData1");
        int rncu=hs.getLastRowNum();
        
        for(int i=0;i<rncu;i++){
        	
        	String username=hs.getRow(i).getCell(0).getStringCellValue();
        	String password=hs.getRow(i).getCell(1).getStringCellValue();
        	//String value=hs.getRow(i).getCell(2).getStringCellValue();
        	System.out.println(username+"---"+password);
        }
	}

}
