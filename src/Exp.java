public class Exp {
    public static void main(String[] args) {
        try {
            try {
                int x = 50 / 0;
            } catch (Exception e) {
                int y = 30 / 0;
            }
            System.out.println("hello");
        } catch (ArithmeticException e) {
            System.out.println("hello");
        }
    }
}
