import java.util.Arrays;

public class Lexographicaloder {
    public static void main(String[] args) {
        char characterarray[] = {'x', 'r', 'r', 'g', 'v', 'f', 'd', 'b', 'f', 'c', 'v'};
        String stringarray[] = new String[characterarray.length];
        for (int i = 0; i < characterarray.length; i++) {
            stringarray[i] = String.valueOf(characterarray[i]);
        }
        Arrays.sort(stringarray);
        System.out.println(Arrays.toString(stringarray));
    }
}

