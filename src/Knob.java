public class Knob {
	private Bomb bomb;
	private String state;
	
	public Knob(Bomb bomb, String state) {
		this.bomb = bomb;
		this.state = state;
	}
	
	public String solve() {
		if (state.equals("001011 111101") || state.equals("101010 011011")) {
			return "UP";
		} else if (state.equals("011001 111101") || state.equals("101010 010001")) {
			return "DOWN";
		} else if (state.equals("000010 100111") || state.equals("000010 000110")) {
			return "LEFT";
		} else if (state.equals("101111 111010") || state.equals("101100 111010")) {
			return "RIGHT";
		} else {
			return "Invalid knob combination.";
		}
	}
}
