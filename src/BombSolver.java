import java.util.ArrayList;

public class BombSolver {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Module: ");
            String input = Input.getInput();
            if (input.equals("s wires") || input.equals("simple wires")) {
                System.out.println("");
                System.out.println("Simple Wires");
                System.out.println("Wires: ");
                String wires = Input.getInput();
                System.out.println("Last Digit Serial: ");
                String serial = Input.getInput();
                SimpleWires sw = new SimpleWires(wires, serial);
                System.out.println("");
                System.out.println("Cut " + sw.solve());
            } else if (input.equals("pw") || input.equals("password")) {
                System.out.println("Columns: ");
                String columns = Input.getInput();
                Password pw = new Password(columns);
                System.out.println("");
                System.out.println("Possible Words: ");
                ArrayList<String> solutions = pw.solve();
                for (String word : solutions) {
                    System.out.println(word);
                }
            } else {
                System.out.println("Invalid Module");
            }
            System.out.println("");
        }
    }
}