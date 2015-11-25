import java.io.*;
public class Main {
	public static void main (String[ ] args)throws Exception {
		String filename = "c:\\test.txt";
		FileReader fr = new FileReader (filename);
		char c1 = (char) fr.read();
		char c2 = (char) fr.read();
		System.out.println(c1 + c2);
		fr.close ();
	}
}