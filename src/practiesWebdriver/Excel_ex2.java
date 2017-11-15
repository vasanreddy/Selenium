package practiesWebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C://My Data//browsers//testdatafilexls.xls");
		HSSFWorkbook hb=new HSSFWorkbook(fis);
		HSSFSheet hs=hb.getSheet("TestData1");
		int rnc=hs.getLastRowNum();
		for(int i=1;i<rnc;i++){
			//System.out.println(hs.get);
			
			String username=hs.getRow(i).getCell(0).getStringCellValue();
			String password=hs.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(username+"----"+password);
			
		}
		
		
	}

}
