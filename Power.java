import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner dc = new Scanner(System.in);
        System.out.print("Enter the base number : ");
      int base = dc.nextInt();
    System.out.print("Enter the power number : ");
      int power = dc.nextInt();

    long answer  = 1 ;
      
    for(int i = 1 ; i<= power ; i++){
        answer*= base;

    }
    System.out.println(base + " raised to the power of " + power + " is : " + answer);


    }

    
}
