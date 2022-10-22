package Two_Question6;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainC {

	public static void main(String[] args) {
		String name = "Maharashtra";
		char temp;

		Map<Character, Integer> pandu = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {
			temp = name.charAt(i);
			if (pandu.containsKey(temp)) {
				int no = pandu.get(temp);
				no++;
				pandu.put(temp, no);
				
			} else {
				pandu.put(temp, 1);

			}
		}
		System.out.println(pandu);
	}
}
