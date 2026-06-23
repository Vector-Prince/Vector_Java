import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Number : ");

        int n = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i<= n; i++){
            if(n%i == 0){
                count = count + 1;  // count the number of factors of n.
            }
        }

            if(count == 2){
                System.out.print("The given number is a Prime Number .");
            }
            else{
                System.out.print("The given Number is not a Prime Number .");
            }

        }
        
}


