package Excel.practise;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {





	public static String[][] readExcel(String filename) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook=new XSSFWorkbook("./worksheet/"+filename+".xlsx");
		XSSFSheet sheetAt = workbook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		XSSFRow row = sheetAt.getRow(0);
		int lastCellNum = row.getLastCellNum();
		String[][] data=new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			 XSSFRow row2 = sheetAt.getRow(i);
			 for (int j = 0; j < lastCellNum; j++)
			 {
				 XSSFCell cell = row2.getCell(j);
				 String Value = cell.getStringCellValue();
				 data[i-1][j]=Value;
				 System.out.println(Value);
			 }
		

	}
		workbook.close();
		return data;

}


	
}
