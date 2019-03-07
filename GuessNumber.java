package homework_3_1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадайте число за 3 попытки.");
        Random random = new Random();
        guess_number_a(random.nextInt(99));

        System.out.println("Повторить игру еще раз? 1 - да, 0 - нет.");
        //эта часть кода не работает
        int res = sc.nextInt();
        if(res == 1){
            guess_number_a(random.nextInt(99));
        }else if(res == 0){
            System.out.println("Спасибо за игру!");
        }
        sc.close();
    }

    public static void guess_number_a(int a) {

        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=3;i++){
            System.out.println("Попытка "+i);
            int input_a = sc.nextInt();
            if(input_a == a){
                System.out.println("Вы угадали!");
                break;
            }else if(input_a > a){
                System.out.println("Загаданное число меньше.");
            }else{
                System.out.println("Загаданное число больше.");
            }
        }
        sc.close();
    }
}
