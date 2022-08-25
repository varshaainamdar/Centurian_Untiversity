package org.sdet38.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1 : read the file using fileInpuStream
		FileInputStream fis = new FileInputStream(".\\Data\\Book1.xlsx");
		
		//step2: create workbook
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3 :load the sheet
		 Sheet s = workbook.getSheet("sheet3");
		
		//step4 :navigate to the row 
		Row row = s.getRow(1);
		
		//step5:navigate the cell
		      Cell cell = row.getCell(2);
		
		//step6:read the value inside the cell
		      System.out.println(cell.getStringCellValue());

	}

}
