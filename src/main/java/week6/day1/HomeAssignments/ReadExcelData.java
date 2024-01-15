package week6.day1.HomeAssignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String[][] readData(){
		XSSFWorkbook book = null;
		try {
			book = new XSSFWorkbook("./data/RedHatData.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet=book.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		int rowcount=sheet.getLastRowNum();
		int colcount=row.getLastCellNum();
		
		String[][] data=new String[rowcount][colcount];
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i-1][j]+" ");
			}
		}
		
		return data;
		
	}

}
