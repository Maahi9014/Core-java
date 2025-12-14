public class Fndmax {
    public static void main(String[] args) {
        int num = 231;
        int digit = 0;
        int highest=9;
        while (num > 0) {
            digit = num % 10;
            highest=Math.min(digit,highest);
            num = num / 10;
        }
        System.out.println(highest);
    }
}
