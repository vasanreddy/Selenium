package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelEX3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafile1.xlsx");
		XSSFWorkbook xb=new XSSFWorkbook(fis); 
		XSSFSheet shet=xb.getSheet("TestData1");
		
		int countrownum=shet.getLastRowNum();
		
		for(int i=0;i<countrownum;i++){
			
			String username=shet.getRow(i).getCell(0).getStringCellValue();
			String password=shet.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println("   "+username+"--"+password);
		}
		
		

	}

}
