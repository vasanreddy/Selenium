package Excel_xls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//http://www.java67.com/2014/09/how-to-read-write-xlsx-file-in-java-apache-poi-example.html
public class Exa1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C://My Data//browsers//testdatafile1.xlsx");
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		 XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		 Iterator<Row> rowIterator = mySheet.iterator();
		 
		 while (rowIterator.hasNext()) {
             Row row = rowIterator.next();
             
             Iterator<Cell> cellIterator = row.cellIterator();
             while (cellIterator.hasNext()) {
            	 
            	 /*switch (cell.getCellType()) {
            	 
            	 case Cell.CELL_TYPE_STRING:
            	 }
            	 */
             }
            	 
            	 
             }
		
	}

}
