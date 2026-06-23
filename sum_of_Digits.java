import java.util.Scanner;
public class sum_of_Digits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        int sum = 0;
        int rem = 0;  // variable to store the remainder when dividing by 10.


        while(n>0){
            rem = n%10;
            sum = sum + rem ;
            n = n/10;         // update the value of n by removing the last digit.
        }
         
        System.out.println("Sum of the digits of given number is : " + sum);



    }

    
}
