import java.util.Scanner;
public class Equality_of_Numbers{

    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of 'a' and 'b':");

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        if( a == b){
            System.out.print(" Both values are equal.");
        }
        else if( a>b ){
            System.out.print(a + " is greater then " + b);
        }
        else{
            System.out.print( b + " is Greater than " + a);

        }
    }
}
    
