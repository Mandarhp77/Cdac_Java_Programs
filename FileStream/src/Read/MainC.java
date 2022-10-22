package Read;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class MainC {

	public static void main(String[] args)throws IOException {
		FileInputStream fin = new FileInputStream("file.txt");
		
		int ch = fin.read();
		
		while((ch=fin.read())!=-1) {
			System.out.println((char)ch);
		}
		fin.close();
	}
}
