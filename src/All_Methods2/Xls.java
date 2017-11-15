package All_Methods2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafile1.xlsx");
		XSSFWorkbook xb=new XSSFWorkbook(fis);
		XSSFSheet xs=xb.getSheet("TestData1");
		int rowcn=xs.getLastRowNum();
		for (int i = 0; i <=rowcn; i++)
		{
			String userName=xs.getRow(i).getCell(0).getStringCellValue();
			String password=xs.getRow(i).getCell(1).getStringCellValue();
			//int seviority=(int) sh.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(userName+"---"+password);
		}
			

	}

}
