//package utility;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelUtility {
//	
//	static FileInputStream fle;
//	static XSSFWorkbook workbook;
//	static XSSFSheet sheet;
//	
//	public static String readExcel(int rowc,int colc) throws FileNotFoundException {
//		fle=new FileInputStream("C:\\Users\\LAB-USER-01\\Desktop\\Machine_Test_sayoojya\\BuyerTest\\src\\test\\resources\\login.xlsx");
//		workbook=new XSSFWorkbook(fle);
//		sheet=workbook.getSheetIndex(0);
//		return readExcel(colc, colc).getRow(rowc).getCell(colc).getStringCellValue();
//		
//		
//	}
//
//}
