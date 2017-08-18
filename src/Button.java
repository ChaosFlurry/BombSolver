public class Button {
	private Bomb bomb;
	private String color;
	private String text;
	
	public Button(Bomb bomb, String color, String text) {
		this.bomb = bomb;
		this.color = color.trim().toUpperCase();
		this.text = text.trim().toUpperCase();
	}
	
	public String solve() {
		if (color.equals("BLUE") || (color.equals("B")) && (text.equals("ABORT"))) {
			return "PRESS AND HOLD";
		} else if (bomb.getBatteryCount() > 1 && text.equals("DETONATE")) {
			return "PRESS AND RELEASE";
		} else if (color.equals("WHITE") || (color.equals("W")) && bomb.containsIndicator("CAR")) {
			return "PRESS AND HOLD";
		} else if (bomb.getBatteryCount() > 2 && bomb.containsIndicator("FRK")) {
			return "PRESS AND RELEASE";
		} else if (color.equals("YELLOW") || color.equals("Y")) {
			return "PRESS AND HOLD";
		} else if ((color.equals("RED") || color.equals("R")) && text.equals("HOLD")) {
			return "PRESS AND RELEASE";
		} else {
			return "PRESS AND HOLD";
		}
	}
	
	public String getReleaseTime(String stripColor) {
		stripColor = stripColor.trim().toUpperCase();
		if (stripColor.equals("BLUE") || stripColor.equals("B")) {
			return "RELEASE ON 4";
		} else if (stripColor.equals("WHITE") || stripColor.equals("W")) {
			return "RELEASE ON 1";
		} else if (stripColor.equals("YELLOW") || stripColor.equals("Y")) {
			return "RELEASE ON 5";
		} else {
			return "RELEASE ON 1";
		}
	}
}
