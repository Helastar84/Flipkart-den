package comm.BasicFunctionalitiesPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelInput implements ConstantValues

{
	public static String excelvalue(String sheet_name, int row, int cell) throws EncryptedDocumentException, IOException 
	{
	FileInputStream Fis = new FileInputStream(excel_path );
    Workbook wb = WorkbookFactory.create(Fis);
    Sheet s= wb.getSheet(sheet_name);
    Row r= s.getRow(row);
    Cell c= r.getCell(cell);
    String data = c.getStringCellValue();    
    return data;
	}

}
