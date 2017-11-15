package Excel_xls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsz_ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("C://My Data//browsers//testdatafile1.xlsx");
		XSSFWorkbook xb=new XSSFWorkbook(fis);
		XSSFSheet sh=xb.getSheet("TestData1");
	    int rcnt=sh.getLastRowNum();

	for (int i = 0; i <=rcnt; i++)
	{
		String userName=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		//double Employename= sh.getRow(i).getCell(2).getNumericCellValue();
		System.out.println(userName+"---"+password);
	}
		
		
	
	}

}
