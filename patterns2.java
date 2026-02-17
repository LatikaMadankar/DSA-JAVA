package BASICS;
public class patterns2 {
    public static void hollowRec(int totRow, int totcolm){
        for(int i = 1; i<=totRow; i++){

            for(int j=1; j<=totcolm; j++){

                if(i == 1 || i == totRow || j == 1 || j == totcolm ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void inv_Rot_Half_Pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void inv_Half_Pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void floyds_triangle(int n){

        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }

    }

    public static void  zero_one_Triangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1; j<=i;j++){
                if((i+j) % 2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

    public static void butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd haf
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){

            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                if(i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        //1st half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        // hollowRec(6, 10);
        // inv_Rot_Half_Pyramid(8);
        // inv_Half_Pyramid(5);
        // floyds_triangle(5);
        // zero_one_Triangle(5);
        // butterfly(10);
        // solid_rhombus(5);
        // hollow_Rhombus(5);
        diamond(3);
    }
}
