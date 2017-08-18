import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {
	private Map<String, String> morseTable;
	private Map<String, String> answerTable;
	private Bomb bomb;
	private String pattern;
	
	public MorseCode(Bomb bomb, String pattern) {
		// Initializes morseTable
		morseTable = new HashMap<>();
		morseTable.put(".-", "A");
		morseTable.put("-...", "B");
		morseTable.put("-.-.", "C");
		morseTable.put("-..", "D");
		morseTable.put(".", "E");
		morseTable.put("..-.", "F");
		morseTable.put("....", "H");
		morseTable.put("..", "I");
		morseTable.put(".---", "J");
		morseTable.put("-.-", "K");
		morseTable.put(".-..", "L");
		morseTable.put("--", "M");
		morseTable.put("-.", "N");
		morseTable.put("---", "O");
		morseTable.put(".--.", "P");
		morseTable.put("--.-", "Q");
		morseTable.put(".-.", "R");
		morseTable.put("...", "S");
		morseTable.put("-", "T");
		morseTable.put("..-", "U");
		morseTable.put("...-", "V");
		morseTable.put(".--", "W");
		morseTable.put("-..-", "X");
		morseTable.put("-.--", "Y");
		morseTable.put("--..", "Z");
		morseTable.put(".----", "1");
		morseTable.put("..---", "2");
		morseTable.put("...--", "3");
		morseTable.put("....-", "4");
		morseTable.put(".....", "5");
		morseTable.put("-....", "6");
		morseTable.put("--...", "7");
		morseTable.put("---..", "8");
		morseTable.put("----.", "9");
		morseTable.put("-----", "0");
		
		// Initializes answerTable
		answerTable = new HashMap<>();
		answerTable.put("shell", "3.505");
		answerTable.put("halls", "3.515");
		answerTable.put("slick", "3.522");
		answerTable.put("trick", "3.532");
		answerTable.put("boxes", "3.535");
		answerTable.put("leaks", "3.542");
		answerTable.put("strobe", "3.545");
		answerTable.put("bistro", "3.552");
		answerTable.put("flick", "3.555");
		answerTable.put("bombs", "3.565");
		answerTable.put("break", "3.572");
		answerTable.put("brick", "3.575");
		answerTable.put("steak", "3.582");
		answerTable.put("sting", "3.592");
		answerTable.put("vector", "3.595");
		answerTable.put("beats", "3.600");
		
		this.bomb = bomb;
		this.pattern = pattern;
	}
	
	public ArrayList<String> solve() {
		ArrayList<String> letters = new ArrayList<>();
		for (String letter : pattern.split(" ")) {
			letters.add(morseTable.get(letter));
		}
		
		ArrayList<String> reducedAnswerList = new ArrayList<>();
		reducedAnswerList.addAll(answerTable.keySet());
		ArrayList<String> answerShortlist = new ArrayList<>();
		for (int i = 0; i < letters.size(); i++) {
			for (String letter : letters.get(i).split("")) {
				for (String answer : reducedAnswerList) {
					if (answer.substring(i, i + 1).toUpperCase().equals(letter.toUpperCase())) {
						answerShortlist.add(answer.toUpperCase());
					}
				}
			}
			reducedAnswerList.clear();
			for (String answer : answerShortlist) {
				reducedAnswerList.add(answer + " - " + answerTable.get(answer));
			}
			answerShortlist.clear();
		}
		return reducedAnswerList;
	}
}
