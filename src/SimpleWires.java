import java.util.ArrayList;

public class SimpleWires {
    private Bomb bomb;
    private ArrayList<String> wires = new ArrayList<>();
    private int wireCount = 0;
    private int redCount = 0;
    private int blueCount = 0;
    private int yellowCount = 0;
    private int whiteCount = 0;
    private int blackCount = 0;
    private String lastWire = "";
    
    public SimpleWires(Bomb bomb, String wires) {
        this.bomb = bomb;
        wires = wires.trim().toUpperCase();
        wireCount = wires.length();
        for (String s : wires.split("")) {
            this.wires.add(s);
            if (s.equals("R")) {
                redCount++;
            } else if (s.equals("B")) {
                blueCount++;
            } else if (s.equals("Y")) {
                yellowCount++;
            } else if (s.equals("W")) {
                whiteCount++;
            } else if (s.equals("K")) {
                blackCount++;
            }
        }
        lastWire = this.wires.get(wires.length() - 1);
    }
    
    public String solve() {
        int solution = 0;
        if (wireCount == 3) {
            if (redCount == 0) {
                solution = 2;
            } else if (lastWire.equals("W")) {
                solution = 3;
            } else if (blueCount > 1) {
                solution = wires.lastIndexOf("B") + 1;
            } else {
                solution = 3;
            }
        } else if (wireCount == 4) {
            if (redCount > 1 && bomb.lastSerialDigitIsOdd()) {
                solution = wires.lastIndexOf("R") + 1;
            } else if (lastWire.equals("Y") && redCount == 0) {
                solution = 1;
            } else if (blueCount == 1) {
                solution = 1;
            } else if (yellowCount > 1) {
                solution = 4;
            } else {
                solution = 2;
            }
        } else if (wireCount == 5) {
            if (lastWire.equals("K") && bomb.lastSerialDigitIsOdd()) {
                solution = 4;
            } else if (redCount == 1 && yellowCount > 1) {
                solution = 1;
            } else if (blackCount == 0) {
                solution = 2;
            } else {
                solution = 1;
            }
        } else if (wireCount == 6) {
            if (yellowCount == 0 && bomb.lastSerialDigitIsOdd()) {
                solution = 3;
            } else if (yellowCount == 1 && whiteCount > 1) {
                solution = 4;
            } else if (redCount == 0) {
                solution = 6;
            } else {
                solution = 4;
            }
        }
        return "CUT WIRE " + solution;
    }
}
