public class rev3 {
    public static void main(String[] args) {
        int num = 103982;
        int rev = 0 ; 
        while (num > 0 ) {
          int lastDigit =   num % 10 ; 
          rev = (rev *10) + lastDigit ;
          num = num / 10 ; 

            
        }
        System.out.println( rev );
    }
}
