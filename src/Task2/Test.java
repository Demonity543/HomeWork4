package Task2;

public class Test {
    public static void main(String[] args) {
        SumaFraction suma = (num1, num2) -> num1 + num2;
        System.out.println("\nSuma: " + suma.addFraction(0.5f, 0.06f));

        Difference difference = (num1, num2) -> num2 - num1;
        System.out.println("\nDifference: " + difference.differenceFraction(0.5f, 0.06f));

        Multiplication multiplication = (num1, num2) -> num1 * num2;
        System.out.println("\nProduct: " + multiplication.multiplicationFraction(0.5f, 0.06f));

        Division division = (num1, num2) -> num2 / num1;
        System.out.println("\nFraction: " + division.divisionFraction(0.5f, 0.06f));
    }
}
