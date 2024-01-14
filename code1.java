

import java.io.*;

 class FileWriter{
	 public static void main(String[] args)throws IOException{

		 filewriter fw = new filewrite("Khalane.txt");

		 fw.writer("OM");
		 fw.writer("ak");
		 fw.writer("Kp");
		 fw.writer("Mayer");

		 fw.close();
	 }
 }
