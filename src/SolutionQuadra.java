import java.util.Scanner;

public class SolutionQuadra {
    public static void main(String[] args) {
        System.out.println("Quadratic Equaiton: ax^2 + bx +c = 0; Enter a, b, c :");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadra = new QuadraticEquation(a, b, c);
        System.out.println("The solution 1 is : x = " + quadra.getRoot1());
        System.out.println("The solution 2 is : x = " + quadra.getRoot2());
    }
}
