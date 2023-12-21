package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
       public static String[][] getexcel() throws IOException {
    	   
    	 //locate the file
   		String filename = "./ExcelData/questions.xlsx"; 
   		//locate the excel sheet
   		XSSFWorkbook book= new XSSFWorkbook(filename);
   		//Read the data from excel
   		//get sheet
   		XSSFSheet sheet1 = book.getSheetAt(0);//0 represent first sheet of exce
   			//get the row
   				XSSFRow row = sheet1.getRow(1);
   				//get the cell
   				XSSFCell cell = row.getCell(0);
   				//rowcount
   				int rowcount = sheet1.getLastRowNum();
   				//column count
   				int colcount = row.getLastCellNum();
   				String[][] data = new String[rowcount][colcount];
   				for(int i=1;i<=rowcount;i++)
   				{
   					for(int j=0;j<colcount;j++)
   					{
   						String stringCellValue = sheet1.getRow(i).getCell(j).getStringCellValue();
   						//System.out.println(stringCellValue);
   						data[i-1][j]=stringCellValue;
   					}
   				}
   				book.close();
   				return data;
   	}
	
}

