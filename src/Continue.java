public class Continue {
    public static void main(String... args) {
        // 1.for loop
      /* for(int i=0;i<10;i++){
           if(i==4){
               continue;
           }
           System.out.println(i);
       }*/
        // 2.whileloop
       /* for (int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 4 & j == 5) {
                    continue;
                }

                System.out.println(i + " " + j);
            }
        }*/
        // 3.while loop
       /* int i = 10;
        while (i <= 12) {
            if (i == 11) {
                continue;

            }
            System.out.println(i);
            i++;
        }*/
        // 4.do while
        int i=10;
        do{
            if(i==14){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while(i<=19);

    }
}

