package AgainAttendClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File obj=new File("C://My Data//browsers//testdatafile1.xlsx");
		FileInputStream fis=new FileInputStream(obj);
		XSSFWorkbook xb=new XSSFWorkbook(fis);
		XSSFSheet sh=xb.getSheet("TestData1");
		
		String data1=sh.getRow(0).getCell(0).getStringCellValue();
		String data2=sh.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(" "+data1+""+data2);
		xb.close();
		
		
	}

}
