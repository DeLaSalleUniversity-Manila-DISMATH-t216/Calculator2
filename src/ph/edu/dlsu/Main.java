package ph.edu.dlsu;
import java.io.*;

public class Main {

    public static void main(String[] Args){

        String input1 = getInput("Enter a number: ");
        String input2 = getInput("Enter a number: ");

        System.out.println("MENU:");
        String stringOption = getInput("Press 1 to add, Press 2 to subtract, Press 3 to multiply, or Press 4 to divide: ");

        int intOption = Integer.parseInt(stringOption);
        double result = 0;

        switch(intOption){
            case 1:
                result = addInputs(input1, input2);
                System.out.println(input1+ " + " +input2+ " is equal to: " +result);
                break;
            case 2:
                result = subtractInputs(input1, input2);
                System.out.println(input1+ " - " +input2+ " is equal to: " +result);
                break;
            case 3:
                result = multInputs(input1, input2);
                System.out.println(input1+ " * " +input2+ " is equal to: " +result);
                break;
            case 4:
                result = divInputs(input1, input2);
                System.out.println(input1+ " / " +input2+ " is equal to: " +result);
                break;
            default:
                System.out.println("Input cannot be recognized.");
        }

    }

    private static double addInputs(String input1, String input2) {
        Double value1 = Double.parseDouble(input1);
        Double value2 = Double.parseDouble(input2);

        return value1 + value2;
    }

    private static double subtractInputs(String input1, String input2) {
        Double value1 = Double.parseDouble(input1);
        Double value2 = Double.parseDouble(input2);

        return value1 - value2;
    }

    private static double multInputs(String input1, String input2) {
        Double value1 = Double.parseDouble(input1);
        Double value2 = Double.parseDouble(input2);

        return value1 * value2;
    }

    private static double divInputs(String input1, String input2) {
        Double value1 = Double.parseDouble(input1);
        Double value2 = Double.parseDouble(input2);

        return value1 / value2;
    }

    private static String getInput(String prompt) {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
