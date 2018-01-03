import java.util.ArrayList;

public class Bomb {
	private String serial;
	private ArrayList<String> indicators;
	private int batteryCount;
	private boolean hasParallelPort;
	private int strikes;
	
	public Bomb(String serial, ArrayList<String> indicators, int batteryCount, boolean hasParallelPort, int strikes) {
		this.serial = serial.trim().toUpperCase();
		
		// Removes duplicate indicators
		indicators = new ArrayList<>();
		for (String indicator : indicators) {
			if (!this.indicators.contains(indicator)) {
				this.indicators.add(indicator.trim().toUpperCase());
			}
		}
		this.batteryCount = batteryCount;
		this.hasParallelPort = hasParallelPort;
		this.strikes = strikes;
	}
	
	public static boolean isValidSerial(String serial) {
		return serial.trim().matches("\\w*\\d");
	}
	
	public boolean serialContainsVowel() {
		String[] vowels = {"A", "E", "I", "O", "U"};
		for (String vowel : vowels) {
			if (serial.contains(vowel)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean lastSerialDigitIsEven() {
		int serialLastDigit = Integer.parseInt(String.valueOf(serial.charAt(serial.length() - 1)));
		return serialLastDigit % 2 == 0;
	}
	
	public boolean lastSerialDigitIsOdd() {
		return !lastSerialDigitIsEven();
	}
	
	public String getSerial() {
		return serial;
	}
	
	public ArrayList<String> getIndicators() {
		return indicators;
	}
	
	public int getBatteryCount() {
		return batteryCount;
	}
	
	public boolean hasParallelPort() {
		return hasParallelPort;
	}
	
	public int getStrikes() {
		return strikes;
	}
	
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public void setIndicators(ArrayList<String> indicators) {
		this.indicators = indicators;
	}
	
	public void setBatteryCount(int batteryCount) {
		this.batteryCount = batteryCount;
	}
	
	public void setHasParallelPort(boolean hasParallelPort) {
		this.hasParallelPort = hasParallelPort;
	}
	
	public void setStrikes(int strikes) {
		this.strikes = strikes;
	}
	
	public boolean containsIndicator(String indicator) {
		if (indicators.contains(indicator)) {
			return true;
		}
		return false;
	}
}
