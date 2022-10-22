package OneQ1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainC {

	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(ir);
		
		int ch;
		while((ch=buffer.read())!='q'){
			System.out.println((char)ch);
			
		}
	}
}
