public class Amstrong {
    public static void main(String[] atg) {
        int n = 153;
        int temp = n;
        int count = 0;
        int sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp=n;
        while (temp > 0) {
            int lst = temp % 10;
            sum += Math.pow(lst, count);
            temp = n / 10;
        }
            System.out.println(sum);
        System.out.println("hwllo");
        }
    }


