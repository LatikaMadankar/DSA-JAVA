package BASICS;

public class primeNum {
    

    //optimized way
    public static boolean isPrime(int n){
        boolean isPrime =true;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    //Prime in the given range
    public static void primeRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    //normal way using function
    // public static boolean isPrime (int n){
    //     if (n == 2){
    //         return true;
    //     }

    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1;i++){
    //         if (n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static void main(String args[]) {

        primeRange(200);

        // System.out.println(isPrime(3));

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // boolean isPrime = true;
        // for(int i = 2; i<=Math.sqrt(n);i++){
        //     if(n % i ==0){
        //         isPrime = false;
        //     }
        // }

        // if(isPrime == true){
        //     System.out.println("n is a prime number");
        // }else{
        //     System.out.println("n is not a prime number");
        // }
    }

}

