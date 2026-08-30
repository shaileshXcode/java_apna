public class fun_3 {
    // function overloading
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(3, 4, 6));
        System.out.println(sum(32.3f, 4.5f));
        // // output
        // 7
        // 13
        // 36.8

    }

}
