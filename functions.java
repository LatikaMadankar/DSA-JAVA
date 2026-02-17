package BASICS;
public class functions {
    //print HW using functions
    public static void printHelloworld(){
        System.out.println("Hello world");
    }

    //sum of 2num using func
    public static int calSum(int num1, int num2) {
        
        int sum  = num1+num2;
        return sum;
    }

    //swap of value and call by values.
    public static void swap (int a,int b) {
        int temp = a;
        a = b;
        b=temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    //product of two numbers
    public static int multiply(int a, int b){
        int product = a* b;
        return product;
    }    

    //factorial of number
    public static int factorial(int n){
        int f = 1;
        for(int i =1; i<=n ; i++){
            f *= i;
        }
        return f;
    }

    //p&c formula
    public static int binCoeff(int n, int r){
        int nFac = factorial(n);
        int rFac = factorial(r);
        int nrFac = factorial(n-r);

        int bc = nFac/ (rFac*nrFac);
        return bc;
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    
    public static void main(String[] args) {

        // int sum = calSum(3, 4);
        // System.out.println(sum);

        // int a = 2;
        // int b= 4;
        // swap(a, b);
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // int prod = multiply(3,4);
        // System.out.println("1st " + prod);
        // prod = multiply(2, 5);
        // System.out.println("2nd " + prod);
        // prod = multiply(23, 78);
        // System.out.println("3rd " + prod);

        // System.out.println(factorial(4));

        // System.out.println(binCoeff(12, 2));

        // System.out.println(sum(2, 4));
        // System.out.println(sum(6, 9, 5));

        

    }
}
