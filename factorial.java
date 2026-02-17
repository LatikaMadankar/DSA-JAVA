package MATHS;
import java.util.Scanner;

//fac using loops
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int factorial = 2;
        for(int i =1;i<=num;i++){
            factorial *= i;
        }
        System.out.println("The factorial is : " + factorial);
    }
}
