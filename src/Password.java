import java.util.ArrayList;
import java.util.Arrays;

public class Password {
	private final String[] answerList = {
			"about", "after", "again", "below", "could",
			"every", "first", "found", "great", "house",
			"large", "learn", "never", "other", "place",
			"plant", "point", "right", "small", "sound",
			"spell", "still", "study", "their", "there",
			"these", "thing", "think", "three", "water",
			"where", "which", "world", "would", "write"
	};
	private ArrayList<String> letters = new ArrayList<>();
	
	public Password(String letters) {
		letters = letters.trim().toUpperCase();
		this.letters.addAll(Arrays.asList(letters.split(" ")));
	}
	
	public ArrayList<String> solve() {
		ArrayList<String> reducedAnswerList = new ArrayList<>();
		reducedAnswerList.addAll(Arrays.asList(answerList));
		ArrayList<String> answerShortlist = new ArrayList<>();
		for (int i = 0; i < letters.size(); i++) {
			for (String letter : letters.get(i).split("")) {
				for (String answer : reducedAnswerList) {
					if (answer.substring(i, i + 1).toUpperCase().equals(letter)) {
						answerShortlist.add(answer.toUpperCase());
					}
				}
			}
			reducedAnswerList.clear();
			reducedAnswerList.addAll(answerShortlist);
			answerShortlist.clear();
		}
		return reducedAnswerList;
	}
}
