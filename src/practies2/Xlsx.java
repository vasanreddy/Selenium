package practies2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafile1.xlsx");
		XSSFWorkbook xb=new XSSFWorkbook(fis);
		XSSFSheet xf=xb.getSheet("TestData1");
		int rcw=xf.getLastRowNum();
		for(int i=0;i<rcw;i++){
			
			String username=xf.getRow(i).getCell(0).getStringCellValue();
			String password=xf.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"---"+password);
		}

	}

}
