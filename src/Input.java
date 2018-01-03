import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	public static String getInput() {
		String input = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}
	
	public static String getInput(String delimiter) {
		System.out.print(delimiter);
		return getInput();
	}
}
