public class patterns {

    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}

// this for upright star for( int line = 1 ; line <=4 ; line++){/
// for(int star = 1 ; star <= line ; star ++){
// System.out.print("*");
// }
// System.out.println();
/*
 * public class patterns {
 * public static void main(String[] args) {
 * 
 * int n = 4;
 * 
 * for (int line = 1; line <= n; line++) {
 * for (int star = 1; star <= n - line + 1; star++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * }
 * }
 * 
 * 
 * for (int line = 1; line <= 4; line++) {
 * for (int n = 1; n <= line; n++) {
 * System.out.print(n);
 * }
 * System.out.println();
 * 1
 * 12
 * 123
 * 1234
 */