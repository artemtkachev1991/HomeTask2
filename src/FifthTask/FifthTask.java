package FifthTask;

//import java.util.Random;

/**
 * Created by artem on 07.12.17.
 */
public class FifthTask {
    public static void main(String[] args) {
        int[][] Mas = new int[8][5];


        for (int i = 0; i < Mas.length; i++) {
            for (int j = 0; j < Mas[i].length; i++) {
                Mas[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(Mas[i][j]+"");
            }
            System.out.println(" ");
        }

    }
}
/*        int[][]Mas=new int[8][5];
        int rand = 10;
        Random random = new Random();
        rand = random.nextInt();
        for (int i=0;i<Mas.length;i++){
            for (int j=0;j<Mas[i].length;i++){
            Mas[i][j]=(int)(random.nextInt(98)+1);;
            System.out.println(Mas[i][j]);
        }}
    }
}
*/