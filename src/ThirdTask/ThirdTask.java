package ThirdTask;

/**
 * Created by artem on 07.12.17.
 */
public class ThirdTask {
    public static void main(String[] args) {
        int summ=0;
        int i=1;
        for (i=1;i<=999999;i++ ){
            int number1=i/10000;
            int number2=(i%10000)/10000;
            int number3=(i%1000)/1000;
            int number4=(i%100)/100;
            int number5=(i%10)/10;
            int number6=i%10;
            if (number1+number2+number3==number4+number5+number6){

                summ++;
            }
        }
        System.out.println("В рулоне с билетами, с номерами от 000001 до 999999 имеется " + summ+ " счастливых билетов");
    }

}
