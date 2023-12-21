/*
 * package marathon3;
 * 
 * import java.io.IOException;
 * 
 * import org.apache.poi.xssf.usermodel.XSSFCell; import
 * org.apache.poi.xssf.usermodel.XSSFRow; import
 * org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
 * 
 * public class ReadExcelData {
 * 
 * public static void main(String[] args) throws IOException {
 * 
 * //locate the file String filename = "./ExcelData/questions.xlsx"; //locate
 * the excel sheet XSSFWorkbook book= new XSSFWorkbook(filename); //Read the
 * data from excel //get sheet XSSFSheet sheet1 = book.getSheetAt(0);//0
 * represent first sheet of exce for (int i = 1; i <=2; i++) { for (int j = 0; j
 * < 2; j++) { //get the row XSSFRow row = sheet1.getRow(i); //get the cell
 * XSSFCell cell = row.getCell(j);
 * 
 * //get the value of respective cell in rows String stringCellValue =
 * cell.getStringCellValue(); System.out.println(stringCellValue); } }
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */