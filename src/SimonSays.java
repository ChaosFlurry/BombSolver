import java.util.ArrayList;
import java.util.Arrays;

public class SimonSays {
	private ArrayList<String> pattern = new ArrayList<>();
	private boolean containsVowel = false;
	private int strikes = 0;
	
	public SimonSays(String pattern, String serial, int strikes) {
		pattern = pattern.trim().toUpperCase();
		serial = serial.trim().toUpperCase();
		this.pattern.addAll(Arrays.asList(pattern.split("")));
		String[] vowels = new String[]{"A", "E", "I", "O", "U"};
		for (String s : serial.split("")) {
			for (String vowel : vowels) {
				if (s.equals(vowel)) {
					containsVowel = true;
					break;
				}
			}
			if (containsVowel) {
					break;
			}
		}
		this.strikes = strikes;
	}
	
	public String solve() {
		String solution = "";
		for (String s : pattern) {
			if (containsVowel) {
				if (strikes == 0) {
					if (s.equals("R")) {
						solution += "B";
					} else if (s.equals("B")) {
						solution += "R";
					} else if (s.equals("G")) {
						solution += "Y";
					} else if (s.equals("Y")) {
						solution += "G";
					}
				} else if (strikes == 1) {
					if (s.equals("R")) {
						solution += "Y";
					} else if (s.equals("B")) {
						solution += "G";
					} else if (s.equals("G")) {
						solution += "B";
					} else if (s.equals("Y")) {
						solution += "R";
					}
				} else if (strikes == 2) {
					if (s.equals("R")) {
						solution += "G";
					} else if (s.equals("B")) {
						solution += "R";
					} else if (s.equals("G")) {
						solution += "Y";
					} else if (s.equals("Y")) {
						solution += "B";
					}
				}
			} else {
				if (strikes == 0) {
					if (s.equals("R")) {
						solution += "B";
					} else if (s.equals("B")) {
						solution += "Y";
					} else if (s.equals("G")) {
						solution += "G";
					} else if (s.equals("Y")) {
						solution += "R";
					}
				} else if (strikes == 1) {
					if (s.equals("R")) {
						solution += "R";
					} else if (s.equals("B")) {
						solution += "B";
					} else if (s.equals("G")) {
						solution += "Y";
					} else if (s.equals("Y")) {
						solution += "G";
					}
				} else if (strikes == 2) {
					if (s.equals("R")) {
						solution += "Y";
					} else if (s.equals("B")) {
						solution += "G";
					} else if (s.equals("G")) {
						solution += "B";
					} else if (s.equals("Y")) {
						solution += "R";
					}
				}
			}
		}
		return solution;
	}
}
