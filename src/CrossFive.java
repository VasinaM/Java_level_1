import java.util.Random;
import java.util.Scanner;

public class CrossFive {

    static int SIZE_X = 5;
    static int SIZE_Y = 5;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'x';
    static char AI_DOT = 'o';
    static char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    //метод заполняющий поле
    private static void initField(){
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j]=EMPTY_DOT;
            }
        }
    }

    //печать поля
    private static void printField(){
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(i+1);
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    //метод для установки символа
    private static void setSym(int y, int x, char sym){
        field[y][x]=sym;
    }

    //проверка валидности ячейки
    private static boolean isCellValid(int y, int x){
        if(x < 0 || y < 0 || x > SIZE_X-1 || y > SIZE_Y-1){
            return false;
        }
        return (field[y][x]==EMPTY_DOT);
    }

    //ход человека
    private static void playerStep(){
        int x;
        int y;
        do{
            System.out.println("Введите координаты: X Y (1-5)");
                x = scanner.nextInt()-1;
                y = scanner.nextInt()-1;
        } while(!isCellValid(y,x));
        setSym(y,x,PLAYER_DOT);
    }

    //ход ПК
    private static void aiStep(){
        int x;
        int y;
        do{
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while(!isCellValid(y,x));
        setSym(y,x,AI_DOT);
    }

    //проверка на заполненность поля
    private static boolean isDraw(){
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if(field[i][j]==EMPTY_DOT){
                    return false;
                }
            }
        }
        return true;
    }

    //проверка победы
    private static boolean checkWin(char sym){
        for (int i = 0; i < SIZE_X; i++) {

            for (int j = 0; j < SIZE_Y; j++) {
                if (field[0][j] == sym && field[1][j] == sym && field[2][j] == sym && field[3][j] == sym) {
                    return true;
                }
                if (field[i][0] == sym && field[i][1] == sym && field[i][2] == sym && field[i][3] == sym) {
                    return true;
                }
            }
        }
        if(field[0][0]==sym && field[1][1]==sym && field[2][2]==sym && field[3][3] == sym){
            return true;
        }
        if(field[3][0]==sym && field[2][1]==sym && field[1][2]==sym && field[0][3] == sym){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        initField();
        printField();
        while(true){
            playerStep();
            printField();
            if(checkWin(PLAYER_DOT)){
                System.out.println("Player Win!");
                break;
            }
            if(isDraw()){
                System.out.println("Draw");
                break;
            }
            aiStep();
            printField();
            if(checkWin(AI_DOT)) {
                System.out.println("Skynet Win!");
                break;
            }
            if(isDraw()) {
                System.out.println("Draw");
                break;
            }
        }
    }

}
