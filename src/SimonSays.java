public class SimonSays {
	private Bomb bomb;
	private String pattern;
	
	public SimonSays(Bomb bomb, String pattern) {
		this.bomb = bomb;
		this.pattern = pattern.trim().toUpperCase();
	}
	
	public String solve() {
		String solution = "";
		for (String s : pattern.split("")) {
			if (bomb.serialContainsVowel()) {
				if (bomb.getStrikes() == 0) {
					if (s.equals("R")) {
						solution += "B";
					} else if (s.equals("B")) {
						solution += "R";
					} else if (s.equals("G")) {
						solution += "Y";
					} else if (s.equals("Y")) {
						solution += "G";
					}
				} else if (bomb.getStrikes() == 1) {
					if (s.equals("R")) {
						solution += "Y";
					} else if (s.equals("B")) {
						solution += "G";
					} else if (s.equals("G")) {
						solution += "B";
					} else if (s.equals("Y")) {
						solution += "R";
					}
				} else if (bomb.getStrikes() == 2) {
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
				if (bomb.getStrikes() == 0) {
					if (s.equals("R")) {
						solution += "B";
					} else if (s.equals("B")) {
						solution += "Y";
					} else if (s.equals("G")) {
						solution += "G";
					} else if (s.equals("Y")) {
						solution += "R";
					}
				} else if (bomb.getStrikes() == 1) {
					if (s.equals("R")) {
						solution += "R";
					} else if (s.equals("B")) {
						solution += "B";
					} else if (s.equals("G")) {
						solution += "Y";
					} else if (s.equals("Y")) {
						solution += "G";
					}
				} else if (bomb.getStrikes() == 2) {
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
