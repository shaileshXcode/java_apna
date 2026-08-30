public class BtoD {

    public static void decnum(int b) {
        int pow = 0;
        int d = 0;

        while (b > 0) {
            int lastDig = b % 10;

            d = d + (lastDig * (int)Math.pow(2, pow));

            pow++;
            b = b / 10;
        }

        System.out.println( d);
    }

    public static void main(String[] args) {
       decnum(101);
       
    }
}
