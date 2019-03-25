package testDataAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelData {
	public static String[][] getDataFromExcel(String FileName,String SheetName) throws IOException
	{
		
		File file1=new File(System.getProperty("user.dir")+"\\src\\testData\\"+FileName);
		FileInputStream inp=new FileInputStream(file1);
		HSSFWorkbook wb=new HSSFWorkbook(inp);
		Sheet sh=wb.getSheet(SheetName);
		int rowNum=sh.getLastRowNum()+1;
		int colNum=sh.getRow(0).getLastCellNum();
		String[][] data=new String[rowNum][colNum];
		String value="";
		for(int i=0;i<rowNum;i++)
		{
			Row row=sh.getRow(i);
			for (int j = 0; j <colNum ; j++) {
				if(row.getCell(j).getCellType()==HSSFCell.CELL_TYPE_STRING)
				{
					value =row.getCell(j).getStringCellValue();
				}
				else
				{
					value=""+row.getCell(j).getNumericCellValue();
				}
				data[i][j]=value;
			}
		}
		return data;
		
	}
}
