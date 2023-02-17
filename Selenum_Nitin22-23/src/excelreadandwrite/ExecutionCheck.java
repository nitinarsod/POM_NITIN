package excelreadandwrite;

import java.io.IOException;

public class ExecutionCheck {
	
	public static void main(String[]args) throws IOException {
		ExcelReadWriteUtility utWrite = new ExcelReadWriteUtility();
		utWrite.excelread(0, 1, 0);
	}

}
