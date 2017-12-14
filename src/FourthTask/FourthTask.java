package FourthTask;

/**
 * Created by artem on 07.12.17.
 */
public class FourthTask {
    public static void main(String[] args) {
        int counter =0;
        for (int hour=1; hour<24; hour++){
            for (int minetes=0;minetes<=59; minetes++){
                if (hour /10%10==minetes%10&hour %10==minetes/10%10){
                    counter++;

                }
            }
        }
        System.out.println("Всего совпадений " +counter );
    }
}
