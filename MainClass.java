package Lesson_1;

public class MainClass {
    public static void main(String[] args) {

        //примитивные
//        byte b1 = 10;
//        short s1 = 2000;
//        int x = 3;
//        long l1 = 367489L;
//
//        float f1 = 23.7f;
//        double d1 = 45.567;
//
//        boolean bl1 = true;
//        char cr = 'a';

        //ссылочные
        //String str = "Hello";


    }
    //метод, вычисляющий выражение 3.
    public static float calculator(float a, float b, float c, float d){
        return a*(b+(c/d));
    }
    //метод 4.
    public static boolean summa(int a, int b){
        int sum = a+b;
        if (sum > 10 && sum <= 20){
            return true;
        } else return false;
    }
    //метод 5.
    public static void number_sign(int x) {
        if (x >= 0) {
            System.out.println("Число" + a + "положительное");
        } else if (x < 0) {
            System.out.println("Число" + a + "отрицательное");
        }
    }
     //метод 6.
        public static boolean neg(int y){
            if (y<0){
                return true;
            }
            return false;
        }
        public static void name(String str){
            System.out.println("Привет, " + str + "!");
        }
}
