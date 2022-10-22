package OneQ2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainQ {

	public static void main(String[] args) throws IOException {
		String name;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(ir);
		
		while(true) {
			name = buffer.readLine();
			System.out.println(name);
			if(name.equals("quit")) {
				break;
			}
		}
	}
}
