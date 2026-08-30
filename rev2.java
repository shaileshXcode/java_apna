import java.util.Scanner;

public class rev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int n = 12036;
    //    while ( n > 0 ) {
    //        int lastDigit = n % 10 ;
    //        System.out.print(lastDigit + " ");
    //        n = n / 10 ;
    // for(int i = 1 ; i <=10 ; i ++ ){
    //     System.out.println( i );
    //     if (i ==3 ) {
    //         break;
    //     }
    // }
       
        // do {
        //     System.out.println( "enetr your number ");
        //     int n = sc.nextInt();
        //     if (n %10 == 0 ) {
        //         break;
        //     }
        // }while(true);
        int num = 20 ; 
        for(int i = 2 ;i < num ; i ++){
            if(num % i != 0){
                System.out.println("prime number ");
                break;
            }
            
        }
    }
    }

/*  System.out.println("eneter value of n ");
     int n = sc.nextInt();
     int sum = 0 ; 
     int i = 1;
     while (i <= n) {
        sum = sum +i ;
        i++;
     }
System.out.println(sum);
 */