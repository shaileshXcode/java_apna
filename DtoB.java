public class DtoB {
    public static void biNum(int d){
        double b = 0 ;
        int pow = 0 ;
        while( d > 0 ){
            int rem = d % 2 ;
            b = b + ((double)rem*(Math.pow(10, pow)));
            d = d/2;
            pow++;

        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        biNum(7);
    }
}
