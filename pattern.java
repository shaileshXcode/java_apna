public class pattern {
    public static void hollowRectangle(int totRow, int totCol) {
        for (int i = 1; i <= totRow; i++) {
            for (int j = 1; j <= totCol; j++) {
                if (i == 1 || i == totRow || j == 1 || j == totCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void inverted_half_pyramid_with_Nmubers( int n ){
        for( int i = 1 ; i <= n ; i ++){
            for( int j = 1 ;  j <= n-i+1 ; j ++){
                System.out.print( j );
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int  n ){
       int  counter = 1 ;
        for(int i = 1 ; i <= n ; i ++){
            for( int j = 1 ; j <=i ; j++){
                System.out.print( counter);
                counter ++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n ){
        for( int i = 1 ; i<= n ; i++){
           
            for (int j = 1 ; j <= i ; j++){
                      if( (i+j) % 2 ==0 ){
                System.out.print( "1");
            }
            else{
                System.out.print("0");
            }
            }
            System.out.println();
      }
    }
    public static void butterfly(int n){
        for( int i = 1 ; i <= n ; i ++){
             //stars
            for (int j =1 ; j <= i ; j ++){
                System.out.print("*");

            }
            //spaces
             for (int k =1 ; k <= 2*(n-i) ; k ++){
                System.out.print(" ");
            }
            //stars
             for (int l =1 ; l <= i ; l ++){
                System.out.print("*");
                
            }
            System.out.println();
        }
         for( int i = n ; i >= 1 ; i--){
            for (int j =1 ; j <= i ; j ++){
                System.out.print("*");

            }
             for (int k =1 ; k <= 2*(n-i) ; k ++){
                System.out.print(" ");
            }
             for (int l =1 ; l <= i ; l ++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollowRectangle(4, 5);
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid_with_Nmubers( 4);
        // floyds_triangle(4);
        // zero_one_triangle(80);
        butterfly(4);
    }

}
