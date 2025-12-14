import java.util.ArrayList;
public class Twod_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
//        for(int i=0;i<3;i++){
//        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(new ArrayList<>(i));
        }
//        ArrayList<Integer> al2 = new ArrayList<>();
        for (int j = 4; j < 7; j++) {
            al.add(new ArrayList<>(j));
        }
//        al.add(al1);
//        al.add(al2);
        System.out.println(al);
//        System.out.println(al.get(0).get(2));
    }
}
