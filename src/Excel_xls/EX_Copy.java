package Excel_xls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class EX_Copy {

	public static void main(String [] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C://Iquiz Progs//browsers//testdatafile.xls");
		System.out.println("hello");
		System.out.println(fis);
		HSSFWorkbook  wb= new HSSFWorkbook(fis);
		System.out.println("nar	esh");
		HSSFSheet s=wb.getSheet("TestData");
		Iterator <Row> rowit =s.iterator();
		while(rowit.hasNext())
		{
			System.out.println(rowit.next().getCell(0).getStringCellValue());
			System.out.println(rowit.next().getCell(1).getStringCellValue());
			//System.out.println(rowit.next().getCell(2).getStringCellValue());
		}


	}

}
