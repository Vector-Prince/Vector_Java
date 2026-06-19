
import java.util.Scanner;
public class Loops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("---MENU---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter you choice:");
             choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Selected Addition");
                    break;

                case 2:
                    System.out.println("Selected Subtraction");
                    break;

                case 3:
                    System.out.println("Selected Multiplication");
                    break;

                case 4:
                    System.out.println("Selected Division");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice ");
            }

            }while( choice != 5);

        }
    }
