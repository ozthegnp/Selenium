import java.awt.Window.Type;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class dataDriven {
	// Identify test cases column by scanning entire first row
	// once column is identify scan the column and find "Purchase" test case
	// then the test row will be grabbed into a test
	
	public ArrayList<String> getData(String testCaseName) throws IOException {
		ArrayList<String> cellArray = new ArrayList();

		// File input stream argument		
		FileInputStream fis = new FileInputStream("//Users//Oz//Documents//Selenium//SeleniumRepo//ExcelDriven//demoData.xlsx");

		// instantiating workbook reading  object 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// read only sheet1
		int numOfSheets = workbook.getNumberOfSheets();
		for (int i = 0; i < numOfSheets; i++ ) {

			if (workbook.getSheetName(i).equals("testData")) { 
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row>  rows = sheet.iterator();
				Row firstRow = (Row) rows.next();
				Iterator<Cell> cell = ((Row) firstRow).cellIterator();


				//find column number of "TestCase"
				int k = 0;
				int colIndex = 99; 

				while(cell.hasNext()) {					
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCase")) {
						//desired column
						colIndex = k;
						break;
					}

					k++;
				}				

				// iterating through every row
				while(rows.hasNext()) {					
					Row value = rows.next();
					if (value.getCell(colIndex).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv = value.cellIterator();
						while(cv.hasNext()) {
							Cell c = cv.next();
							
							if(cv.next().getStringCellValue().getClass().equals(Type.class) ) {
								cellArray.add(cv.next().getStringCellValue());								
							} else {
								 cellArray.add(NumberToTextConverter.toText(cv.next().getNumericCellValue()));
							}
								
														
						}
						break;
					}

					k++;
				}
			}
		}
		
		return cellArray;


	}
}
