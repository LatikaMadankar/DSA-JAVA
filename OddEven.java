package BASICS;
//using if-else
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc); //just to make it normal
        int Num = sc.nextInt();
        if(Num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
