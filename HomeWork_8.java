package hw_8;

public class HomeWork_8 {


    public static void main(String[] args) {

        printYear(2021);
    }

        public static void printYear(int year){
            int vis = year%4;
            int vis_400 = year%400;
            int vis_100 = year%100;
            if (vis_100 ==0 && vis_400!=0){
                System.out.println(year + " год - невисокосный");
                return;
            }
            else if (vis_400 ==0){
                System.out.println(year + " год - високосный");
                return;
            }
            if (vis==0){
                System.out.println(year + " год - високосный");
            }else if (vis != 0){
                System.out.println(year + " год - невисокосный");
            }
        }
    }


