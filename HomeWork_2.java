package homework_2;

public class HomeWork_2 {
    public static void main(String[] args) {

        //1. заменить 0 на 1 в целочисленном массиве
        int[] mass = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            } else {//if(mass[i]==1){
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }

        //2. заполнить пустой целочисленный массив
//        int[] mass = new int[8];
//
//        for(int i=1; i < mass.length; i++){
//
//            mass[i]= mass[i-1]+3;
//        }
//        System.out.print(Arrays.toString(mass));

        //3. числа меньше 6 умножить на 2
//        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for(int i=0; i < mass.length; i++){
//            if(mass[i]<6){
//                mass[i]=mass[i]*2;
//            }
//        }
//        System.out.print(Arrays.toString(mass));

        //4. квадратный двумерный массив с 1 по диагонали, вторая диагональ - ?
//        int[][]mass = new int[5][5];
//        for(int i=0; i < 5; i++){
//            for(int j=0; j < 5; j++){
//                if(i==j){
//                    mass[i][j]=1;
//                }
//                System.out.print(mass[i][j]+" ");
//            }
//            System.out.println();
//        }

        //5. найти min и max в одномерном массиве 2 варианта
//        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        int min=mass[0];
//        int max=mass[0];
//        for(int i=1; i < mass.length; i++){
//            if(mass[i]<min){
//                min=mass[i];
//            }else if(mass[i]>max){
//                max=mass[i];
//            }
//        }
//        System.out.println(min + " " + max);

// 2 вариант
//        int[]mass=new int[10];
//        int min=mass[0];
//        int max=mass[0];
//        for(int i=1; i < mass.length; i++){
//            mass[i]= mass[i-1]+3;
//            if(mass[i]<min){
//                min=mass[i];
//            }else if(mass[i]>max){
//                max=mass[i];
//            }
//        }
//        System.out.println(min + " " + max);
    }
}