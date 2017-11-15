package After_Home;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsx {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

	File f=new File("C://My Data//browsers//testdatafile1.xlsx");
    XSSFWorkbook wb=new XSSFWorkbook(f);
    XSSFSheet xs=wb.getSheet("TestData1");
    int rowcount=xs.getLastRowNum();
    
    for(int i=0;i<rowcount;i++){
    	
    	String username=xs.getRow(i).getCell(0).getStringCellValue();
    	String password=xs.getRow(i).getCell(1).getStringCellValue();
    	
    	System.out.println(username+"---"+password);
    }

	}

}
