package com.company.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class Excel {
	private FileInputStream file;
	private HSSFWorkbook wb;
	private HSSFSheet sheet;
	private HSSFCell cell;
	private DataFormatter df;
	
	public void setexcel(String path,String Sheetname) throws IOException{
		file=new FileInputStream(path);
		wb=new HSSFWorkbook(file);
		sheet=wb.getSheet(Sheetname);
		
	}
	public String getCellValue(int row,int col){		
		
		cell=sheet.getRow(row).getCell(col);
		System.out.println("Hello");
		df =new DataFormatter();
		return df.formatCellValue(cell);
    
		}
	

}
