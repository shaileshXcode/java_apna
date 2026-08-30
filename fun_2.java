public class fun_2 {
    public static int fact( int a ){
        int facto= 1;
        for(int i = 1 ; i <= a; i++){
            facto = facto *i;
        }
        return facto;

    }
    public static int bincoef(int n, int r) {
        int N_fact = fact(n);
        int r_Fact = fact(r);
        int nmr_fact = fact(n - r);
       int bc =  N_fact/((r_Fact)*(nmr_fact));
       return bc;


    }

    public static void main(String[] args) {
        int bc = bincoef(5, 2);
        System.out.println("bino coef is "+ bc);

    }
}