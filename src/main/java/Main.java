import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Welcome to the calculator");
        System.out.println("Enter a command:");

        while(true) {
            // Reading data using readLine
            String line = reader.readLine();
            String[] tokens = line.split(" "); // Split by whitespace

            String command = tokens[0];

            Calculator calculator = new Calculator();

            if(tokens.length == 2) {
                final int NUMBER_1 = Integer.parseInt(tokens[1]);
                if(command.equals("binary")) {
                    String result = calculator.intToBinaryNumber(NUMBER_1);
                    System.out.println(result);
                } else if(command.equals("fibonacci")) {
                    int result = calculator.fibonacciNumberFinder(NUMBER_1);
                    System.out.println(Integer.toString(result));
                }
            } else if(tokens.length == 3) {
                final int NUMBER_1 = Integer.parseInt(tokens[1]);
                final int NUMBER_2 = Integer.parseInt(tokens[2]);
                int result = 0;

                if(command.equals("divide")) {
                    result = calculator.divide(NUMBER_1, NUMBER_2);
                } else if(command.equals("multiply")) {
                    result = calculator.multiply(NUMBER_1, NUMBER_2);
                } else if(command.equals("subtract")) {
                    result = calculator.subtract(NUMBER_1, NUMBER_2);
                } else if(command.equals("add")) {
                    result = calculator.add(NUMBER_1, NUMBER_2);
                }

                System.out.println(Integer.toString(result));
            } else {
                System.exit(0);
            }
        }
    }
}