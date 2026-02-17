package BASICS;
//a program that reads a set of integers,and then prints the sum of the even and odd integers
import java.util.Scanner;

public class EvenOddInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        int n;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("enter the number");
            
            n = sc.nextInt();

            if(n % 2 == 0){
                evenSum += n;
                // System.out.println(evenSum);
            }else {
                oddSum += n;
                // System.out.println(oddSum);
            }
            
            System.out.println("do you want to continue press 1 else press 0");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("even sum is " + evenSum);
        System.out.println("odd sum is " + oddSum);
    }
}
