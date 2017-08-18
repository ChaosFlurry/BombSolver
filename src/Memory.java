import java.util.Arrays;
import java.util.List;

public class Memory {
	private Bomb bomb;
	private List<String> numbers;
	
	public Memory(Bomb bomb, String numbers) {
		this.bomb = bomb;
		this.numbers = Arrays.asList(numbers.split(" "));
	}
	
	public String solve() {
		int stage = numbers.size();
		int display = numbers.get(stage - 1).charAt(0);
		
		if (stage == 1) {
			if (display == 1) {
				return String.valueOf(numbers.get(stage - 1).charAt(2));
			} else if (display == 2) {
				return String.valueOf(numbers.get(stage - 1).charAt(2));
			} else if (display == 3) {
				return String.valueOf(numbers.get(stage - 1).charAt(3));
			} else if (display == 4) {
				return String.valueOf(numbers.get(stage - 1).charAt(4));
			} else {
				return "Invalid Number Sequence";
			}
		} else if (stage == 2) {
			if (display == 1) {
				return "4";
			} else if (display == 2) {
				int prerequisiteStage = 1;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				String prerequisiteLabel = new Memory(bomb, prerequisiteNumbers).solve();
				int prerequisitePosition = numbers.get(prerequisiteStage - 1).lastIndexOf(prerequisiteLabel);
				return String.valueOf(numbers.get(stage - 1).charAt(prerequisitePosition));
			} else if (display == 3) {
				return String.valueOf(numbers.get(stage - 1).charAt(1));
			} else if (display == 4) {
				int prerequisiteStage = 1;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				String prerequisiteLabel = new Memory(bomb, prerequisiteNumbers).solve();
				int prerequisitePosition = numbers.get(prerequisiteStage - 1).lastIndexOf(prerequisiteLabel);
				return String.valueOf(numbers.get(stage - 1).charAt(prerequisitePosition));
			} else {
				return "Invalid Number Sequence";
			}
		} else if (stage == 3) {
			if (display == 1) {
				int prerequisiteStage = 2;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				return new Memory(bomb, prerequisiteNumbers).solve();
			} else if (display == 2) {
				int prerequisiteStage = 1;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				return new Memory(bomb, prerequisiteNumbers).solve();
			} else if (display == 3) {
				return String.valueOf(numbers.get(stage - 1).charAt(3));
			} else if (display == 4) {
				return "4";
			} else {
				return "Invalid Number Sequence";
			}
		} else if (stage == 4) {
			if (display == 1) {
				int prerequisiteStage = 1;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				String prerequisiteLabel = new Memory(bomb, prerequisiteNumbers).solve();
				int prerequisitePosition = numbers.get(prerequisiteStage - 1).lastIndexOf(prerequisiteLabel);
				return String.valueOf(numbers.get(stage - 1).charAt(prerequisitePosition));
			} else if (display == 2) {
				return String.valueOf(numbers.get(stage - 1).charAt(1));
			} else if (display == 3) {
				int prerequisiteStage = 2;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				String prerequisiteLabel = new Memory(bomb, prerequisiteNumbers).solve();
				int prerequisitePosition = numbers.get(prerequisiteStage - 1).lastIndexOf(prerequisiteLabel);
				return String.valueOf(numbers.get(stage - 1).charAt(prerequisitePosition));
			} else if (display == 4) {
				int prerequisiteStage = 2;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				String prerequisiteLabel = new Memory(bomb, prerequisiteNumbers).solve();
				int prerequisitePosition = numbers.get(prerequisiteStage - 1).lastIndexOf(prerequisiteLabel);
				return String.valueOf(numbers.get(stage - 1).charAt(prerequisitePosition));
			} else {
				return "Invalid Number Sequence";
			}
		} else if (stage == 5) {
			if (display == 1) {
				int prerequisiteStage = 1;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				return new Memory(bomb, prerequisiteNumbers).solve();
			} else if (display == 2) {
				int prerequisiteStage = 2;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				return new Memory(bomb, prerequisiteNumbers).solve();
			} else if (display == 3) {
				int prerequisiteStage = 4;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				return new Memory(bomb, prerequisiteNumbers).solve();
			} else if (display == 4) {
				int prerequisiteStage = 3;
				String prerequisiteNumbers = numbers.subList(0, prerequisiteStage + 1).toString();
				return new Memory(bomb, prerequisiteNumbers).solve();
			} else {
				return "Invalid Number Sequence";
			}
		} else {
			return "Invalid Sequence Length";
		}
	}
}
