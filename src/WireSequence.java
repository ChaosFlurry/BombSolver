public class WireSequence {
	private Bomb bomb;
	private String color;
	private String letter;
	private int occurrence;
	
	public WireSequence(Bomb bomb, String color, String letter, int occurrence) {
		this.bomb = bomb;
		this.color = color.trim().toUpperCase();
		this.letter = letter.trim().toUpperCase();
		this.occurrence = occurrence;
	}
	
	public String solve() {
		if (occurrence == 1) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else if (occurrence == 2) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else if (occurrence == 3) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		}  else if (occurrence == 4) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else if (occurrence == 5) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else if (occurrence == 6) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else if (occurrence == 7) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else if (occurrence == 8) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else if (occurrence == 9) {
			if (color.equals("R")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("B")) {
				if (letter.equals("A")) {
					return "CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "DO NOT CUT";
				} else {
					return "Invalid Letter";
				}
			} else if (color.equals("K")) {
				if (letter.equals("A")) {
					return "DO NOT CUT";
				} else if (letter.equals("B")) {
					return "DO NOT CUT";
				} else if (letter.equals("C")) {
					return "CUT";
				} else {
					return "Invalid Letter";
				}
			} else {
				return "Invalid Color";
			}
		} else {
			return "Invalid Sequence Number";
		}
	}
}
