package Write;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainC {

	public static void main(String[] args) throws IOException {
		FileOutputStream Fout = new FileOutputStream("file.txt");
		int ch;
		String str = "Mandar";
		byte arr[] = str.getBytes();
		Fout.write(arr);
		Fout.close();
		

	}

}
