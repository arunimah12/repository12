package excel;



import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class excel_creation {
  @Test	
  public void step1() throws Exception{
	  FileOutputStream fo=new FileOutputStream("D:\\SeleniumAutomation_27Dec_11AM\\Results\\LoginRes1.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(fo);
	 
	  WritableSheet ws=wb.createSheet("Results", 0);
	  	  
	  Label un=new Label(0,0,"Username");
	  ws.addCell(un);
	 
	  Label pw=new Label(1,0,"Password");
	  ws.addCell(pw);
	
	  Label rs=new Label(2,2,"Result");
	  ws.addCell(rs);

	  wb.write();
	  wb.close();
  }
}



