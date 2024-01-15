package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static String[][] readData() throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("./data/CreateleadTestData.xlsx");
		XSSFSheet sheetAt=book.getSheetAt(0);
		XSSFRow row=sheetAt.getRow(1);
		int rowCount=sheetAt.getLastRowNum(); //row count
		int colCount=row.getLastCellNum();   //column count
		
		String[][] data=new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				data[i-1][j]=sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data[i-1][j]+" ");
			}
			System.out.println();
		}
		
		book.close();
		
		return data;
	}

}
