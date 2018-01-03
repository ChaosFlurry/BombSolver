import java.util.ArrayList;
import java.util.Arrays;

public class BombSolver {
    public static void main(String[] args) {
    	Bomb bomb = setupBomb();
    	
	    String delimiter = ">> ";
    	while (true) {
    		System.out.println("Enter a command.");
    		String command = Input.getInput(delimiter).trim().toLowerCase();
    		
    		if (command.equals("sw")) {
    			System.out.println("Wires:");
    			String wires = Input.getInput(delimiter).trim().toUpperCase();
    			if (!wires.matches("[RBYWK]{3,6}")) {
    				System.out.println("Invalid wire sequence.");
    				continue;
			    }
			    String result = new SimpleWires(bomb, wires).solve();
    			System.out.println(result);
		    } else if (command.equals("button")) {
    			System.out.println("Color:");
    			// TODO check colors (could be more than base expansion in mods)
			    String color = Input.getInput(delimiter).trim().toUpperCase();
			    System.out.println("Text:");
			    String text = Input.getInput(delimiter).trim().toUpperCase();
			    String result = new Button(bomb, color, text).solve();
			    System.out.println(result);
		    } else if (command.equals("ss")) {
    			System.out.println("Pattern:");
    			String pattern = Input.getInput(delimiter).trim().toUpperCase();
    			String result = new SimonSays(bomb, pattern).solve();
    			System.out.println(result);
		    } else if (command.equals("wof")) {
    			// not supported (yet)
		    	System.out.println("Display:");
		    	String display = Input.getInput(delimiter).trim().toUpperCase();
		    } else if (command.equals("memory")) {
		    	String fullSequence = "";
		    	String result;
		    	
		    	for (int i = 0; i < 5; i++) {
				    System.out.println("Sequence (Stage " + (i + 1) + "):");
		    	    String currentSequence = Input.getInput(delimiter).trim();
			        while (!currentSequence.matches("[1-4]{5}")) {
			    	    System.out.println("Invalid sequence.");
			    	    currentSequence = Input.getInput(delimiter).trim();
			        }
			        fullSequence += " " + currentSequence;
			        fullSequence = fullSequence.trim();
				    result = new Memory(bomb, fullSequence).solve();
				    System.out.println("PRESS " + result);
			    }
		    } else if (command.equals("morse")) {
    			System.out.println("Pattern:");
    			String pattern = Input.getInput(delimiter).trim();
    			ArrayList<String> results = new MorseCode(bomb, pattern).solve();
			    System.out.println("Possible words:");
			    for (String result : results) {
			    	System.out.println(result);
			    }
		    } else if (command.equals("cw")) {
    			String wire = Input.getInput(delimiter).trim().toUpperCase();
    			String result = new ComplicatedWires(bomb, wire).solve();
    			System.out.println(result);
		    } else if (command.equals("ws")) {
    			int redCount = 0;
    			int blueCount = 0;
    			int blackCount = 0;
    			int currentOccurrence;
			    String input = Input.getInput(delimiter).trim().toUpperCase();
    			while (!input.equals("DONE")) {
    				if (!input.matches("[RBK][ABC]")) {
    					System.out.println("Invalid wire-letter combination.");
    					input = Input.getInput(delimiter).trim().toUpperCase();
    					continue;
				    }
				    if (input.startsWith("R")) {
    					redCount++;
    					currentOccurrence = redCount;
				    } else if (input.startsWith("B")) {
    					blueCount++;
    					currentOccurrence = blueCount;
				    } else {
    					blackCount++;
    					currentOccurrence = blackCount;
				    }
				    String color = Character.toString(input.charAt(0));
    				String letter = Character.toString(input.charAt(1));
				    String result = new WireSequence(bomb, color, letter, currentOccurrence).solve();
				    System.out.println(result);
			    }
    			
		    } else if (command.equals("maze")) {
    			
		    } else if (command.equals("pw")) {
			    System.out.println("Columns: ");
			    String columns = Input.getInput();
			    ArrayList<String> results = new Password(bomb, columns).solve();
			    System.out.println("Possible words:");
			    for (String result : results) {
			    	System.out.println(result);
			    }
		    } else if (command.equals("knob")) {
    			
		    }
	    }
    }
    
    private static Bomb setupBomb() {
    	String delimiter = ">> ";
	    String input;
	    
        System.out.println("Serial number:");
        input = Input.getInput(delimiter).trim();
        while (!input.matches("\\w*\\d")) {
            System.out.println("Invalid serial number.");
            input = Input.getInput(delimiter).trim();
	    }
        String serial = input;
        
        System.out.println("Indicators:");
        input = Input.getInput(delimiter).trim().toUpperCase();
        while (!input.matches("(\\w{3} )*\\w{3}") && input.length() != 0) {
            System.out.println("Invalid indicator(s).");
            input = Input.getInput(delimiter).trim().toUpperCase();
	    }
	    ArrayList<String> indicators = new ArrayList<>(Arrays.asList(input.split(" ")));
        
        System.out.println("Number of batteries:");
        input = Input.getInput(delimiter).trim();
        while (!input.matches("\\d+")) {
            System.out.println("Invalid response.");
            input = Input.getInput(delimiter).trim();
	    }
        int batteries = Integer.parseInt(input);
        
        System.out.println("Parallel port?");
        input = Input.getInput(delimiter).trim().toLowerCase();
        while (!input.matches("yes|no|y|n|true|false")) {
            System.out.println("Invalid response.");
            input = Input.getInput(delimiter).trim().toLowerCase();
	    }
	    boolean parallelPort = false;
	    if (input.matches("yes|y|true")) {
            parallelPort = true;
	    }
	    
	    System.out.println("Number of strikes:");
	    input = Input.getInput(delimiter).trim();
	    while (!input.matches("[012]")) {
            System.out.println("Invalid response.");
            input = Input.getInput(delimiter).trim();
	    }
        int strikes = Integer.parseInt(input);
	    
	    return new Bomb(serial, indicators, batteries, parallelPort, strikes);
    }
}