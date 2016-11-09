package keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Functions.orgMaster;

public class KeywordDiverScript
{
	@Test
	public void driverscript() throws IOException
	{
		orgMaster om=new orgMaster();
		String res=null;
		String xlpath="F:\\Morning630AM\\Selenium\\src\\TestData\\Keyword.xlsx";
		String xlout="F:\\Morning630AM\\Selenium\\src\\Results\\KeyRes1.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		//Getting last row number
		int TcRc=ws.getLastRowNum();
		int TsRc=ws1.getLastRowNum();

		//working with testcase sheet
		
		for (int i = 1; i <= TcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String strExe=ws.getRow(i).getCell(2).getStringCellValue();
			if (strExe.equalsIgnoreCase("Y"))
			{
				String TcId=ws.getRow(i).getCell(0).getStringCellValue();
				//Working Test steps sheet
				for (int j = 1; j <= TsRc; j++) 
				{
					String TsTcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (TcId.equalsIgnoreCase(TsTcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
							break;
						case "login":	
							res=om.org_Login("Admin", "admin");
							break;
						case "Empreg":
							res=om.org_EmpReg("Sharath", "Chandra");
							break;
						case "logout":
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Usereg":	
							res=om.org_UserReg("Sharath Chandra", "Sharath123456", "Sharath123456", "Sharath123456");
							break;
						case "Ulogin":
							res=om.org_Login("Sharath123456", "Sharath123456");
							break;
						default:
							System.out.println("select a proper keyword");
							break;
						}
						//Update result in test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//Update the result in Test case sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						else
						{
							ws.getRow(i).getCell(3).setCellValue("Fail");
						}
						
					}
				}
			}
			else
			{
				ws.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}