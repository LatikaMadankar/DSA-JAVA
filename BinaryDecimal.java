package MATHS;
public class BinaryDecimal {
    public static void BtoD(int n){
        int myNum = n;
        int pow = 0;
        int dec = 0;
        
        while(n>0){
            int lastdigit = n%10;
            dec = dec + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            n = n/10;

        }

        System.out.println("the decimal of "+ myNum + " = " + dec);
    }

    public static void DtoB (int decNum){
        int myNN = decNum;
        int pow =0;
        int binNum =0;

        while(decNum>0){
            int rem =decNum % 2;

            binNum = binNum + (rem  * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum/2;
        }

        System.out.println("the binary of " + myNN + " = " + binNum);
    }

    public static void main(String[] args) {

        BtoD(11111);
        DtoB(31);
    }
}
