import java.util.Scanner;

/**
 * Created by artem on 07.12.17.
 */
public class FirstTask {
    public static void main(String[] args) {
        int a,c = 0;
        System.out.println("Введите пожалуйста число");
        Scanner scn=new Scanner(System.in);

        if(scn.hasNextInt()){
            a=scn.nextInt();
            while(a != 0){
                c = c + a % 10;
                a /= 10;
            }
            System.out.println("Сумма чисел введенного числа равна " + c);
        }
        else System.out.println("Введи пожалуйста ЧИСЛО");
    }
}

