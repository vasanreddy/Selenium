package Excel_xls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor.ROSE;
import org.apache.poi.ss.usermodel.Row;

public class Xls_file {

	public static void main(String []args) throws IOException{
	
	FileInputStream fs= new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
	HSSFWorkbook hb=new HSSFWorkbook(fs);
	HSSFSheet hf=hb.getSheet("TestData1");
	Iterator <Row> ir=hf.iterator();
	
	while(ir.hasNext()){
		
		System.out.println(ir.next().getCell(0).getStringCellValue()+ "---"+ ir.next().getCell(1).getStringCellValue() 
				+ "---"+ir.next().getCell(2).getStringCellValue());
		//System.out.println(ir.next().getCell(1).getStringCellValue());
		//System.out.println(ir.next().getCell(2).getStringCellValue());
		
	}
	
}
}
