package ExcelOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Functions.orgMaster;

public class ExcelOpsEg {

	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		
		String xlpath="F:\\Morning630AM\\Selenium\\src\\TestData\\EmpTestData.xlsx";
		String xlout="F:\\Morning630AM\\Selenium\\src\\Results\\Empfontcolours.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
//		XSSFRow r=ws.getRow(6);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		
		om.org_Launch("http://orangehrm.qedgetech.com");
		om.org_Login("Admin", "admin");
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			
			System.out.println(f+"--------"+l);
			
			String res=om.org_EmpReg(f, l);
			
			c2.setCellValue(res);
			if (res.equalsIgnoreCase("Pass")) 
			{
//				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				font.setColor(IndexedColors.GREEN.getIndex());
			}
			else
			{
//				style.setFillForegroundColor(IndexedColors.RED.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				font.setColor(IndexedColors.RED.getIndex());
			}
		
			style.setFont(font);
			c2.setCellStyle(style);
		}

		FileOutputStream f0=new FileOutputStream(xlout);
		wb.write(f0);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
