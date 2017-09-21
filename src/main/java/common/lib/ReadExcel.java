package common.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	XSSFWorkbook wb;
	XSSFSheet ws;
	
	public ReadExcel(String excelPath) {
		// TODO Auto-generated constructor stub
		try {
			
		File fs = new File(excelPath);
		
		FileInputStream fis = new FileInputStream(fs);
		
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public String getData(int sheetno,int row, int col)
	{
		ws = wb.getSheetAt(sheetno);
		String strData = ws.getRow(row).getCell(col).getStringCellValue();
		return strData;
	}
	
	public int getRowCnt(int sheetIndex)
	{
		int rCnt =  wb.getSheetAt(sheetIndex).getLastRowNum();
		rCnt = rCnt +1;
		return rCnt;
	}

}
