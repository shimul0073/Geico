package ins.geico.management;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public ArrayList<String> getData(String CaseName) throws IOException {
		
		ArrayList <String> a= new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C://GeicoProject//demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {

				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {

					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCaseName")) {

						column = k;
					}
					k++;
				}
				//System.out.println(column);

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(CaseName)) {

						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							
						Cell c=cv.next();
						if (c.getCellTypeEnum()==CellType.STRING)
						{
							a.add(c.getStringCellValue());	
						}
						else{
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							
						}
						}
					}
					
				}
			}

		}
		return a;
		

	}
	
}
