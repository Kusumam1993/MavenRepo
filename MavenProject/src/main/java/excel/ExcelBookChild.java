package excel;

import java.io.IOException;

public class ExcelBookChild {

	public static void main(String[] args) throws IOException
	{
		System.out.println(ExcelBook1.getStringData(0,0));
		
		System.out.println(ExcelBook1.getStringData(1, 0));	
		System.out.println(ExcelBook1.getStringData(0,1));
		System.out.println(ExcelBook1.getIntegerData(1,1));
		System.out.println(ExcelBook1.getStringData(2, 0));	
		System.out.println(ExcelBook1.getIntegerData(2,1));

	}

}
