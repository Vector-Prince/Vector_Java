
import java.util.Scanner;
public class Quadratic {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter the coefficient a :");
        int a = sc.nextInt();
        System.out.print("Enter the coefficient b :");
        int b = sc.nextInt();
        System.out.print("Enter the coefficient c :");
        int c = sc.nextInt();

        // calculate discriminant


        int dis = ((b * b) - (4 * a * c));
        if (dis > 0) {
            double r1 = (-b + Math.sqrt(dis)) / (2 * a);
            double r2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.print("Roots of the Equation are real and distinct;");
            System.out.print("Root1 = " + r1);
            System.out.print("Root2 = " + r2);

        } else if (dis == 0) {
            int r1 = -b / (2 * a);
            int r2 = -b / (2 * a);
            System.out.print("The Roots are real and equal :");
            System.out.print("Roots are : "  +  r1 +   "and " + r2);
        } else {
            System.out.println("Roots are complex:");
            int real_part = -b / (2 * a);
            double imaginary_part = Math.sqrt(-dis) / (2 * a);
            System.out.println("Root1 = "  +  real_part );
            System.out.print("Root2 = "  + imaginary_part  +  "i");
        }
    }

}

