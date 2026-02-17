import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tell me your first name");
        String personName = input.nextLine();

        System.out.println("Tell me your first initial");
        String initialOne = input.nextLine();

        System.out.println("Tell me your last initial");
        String initialTwo = input.nextLine();

        System.out.println("Tell me a whole number");
        Double numberOne = input.nextDouble();

        System.out.println("Tell me another number");
        Double numberTwo = input.nextDouble();

        String initials = (initialOne + initialTwo);
        Double adicion = (numberOne + numberTwo);
        Double resta = (numberOne - numberTwo);
        Double multiplo = (numberOne * numberTwo);
        Double division = (numberOne / numberTwo);

        System.out.println("Thanks for the data");
        System.out.printf("Results: %s %s %.2f %.2f %.2f %.2f", personName, initials, adicion, resta, multiplo, division);
    }
}
