import java.util.Scanner;

public class fun {
    public static void helloWorld(){
        System.out.println("hello world");
       
    }
    public static int prod(int a , int b){
        int product = a * b ;
        return product;
    }
    public static int calcSum(int num1 , int num2){
int sum = num1 + num2 ;
return sum ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // no 1 sum 
        // System.out.println("enter a num1");
        // int num1 = sc.nextInt();
        // System.out.println("enter a num2");
        //   int num2 = sc.nextInt();
        //   int sum  = calcSum(num1,num2);
          
        //   System.out.println("sum is " + sum );
        // num 2 prod 
        int a=5, b = 6;
        int product = prod(a, b);
        System.out.println("product is :"+ product);
    }
    
}
/*public class fun_2 {
    public static int fact(int n){
        int fact = 1 ;
        for(int i = 1 ; i <= n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.println("factorial is "+ factorial);
    }
}
 */