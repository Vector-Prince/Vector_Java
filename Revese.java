import java.util.Scanner;
public class Revese {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the the number: ");
        int n = sc.nextInt();
        int rev = 0;
        int rem = 0;

        while(n>0){

            rem = n%10;
            rev = rev*10+rem;
            n = n/10;         // update the value of n by removing the last digit
        }
        System.out.print("Reverse of the number is : " + rev);
    }

}

    
    