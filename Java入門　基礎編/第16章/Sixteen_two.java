import java.io.*;
public class Sixteen_two {
	public static void main (String[ ] args)throws Exception {
		String filename = "c:\\test.txt";
		FileWriter fw = new FileWriter (filename);
		fw.write('‚»');
		fw.write('‚ê');
		fw.close();
	}
}