package homework_2_67;

public class HomeWork_2_67 {
    //6. место в массиве, где сумма правой и левой части равны

        public static boolean sum_equal(int[] mass){
            for(int i=0; i<mass.length; i++){
                int a = 0, b = 0;
                a+=mass[i];
                b+=mass[i-1];
                if(a>b){
                    a+=mass[i];
                }else if(b>a){
                    b+=mass[i-1];
                }else if(a==b){
                    return true;
                }
            }
            return false;
        }

    //7. сместить все элементы массива на n позиций
    public static void revers(int[] mass, int n){

        for (int i = 1; i < n; i++){
            int tmp = mass[i-1];
            mass[i-1] = mass[i];
            mass[i] = tmp;

        }

    }


    public static void main(String[] args) {

    }
//sum_equal (new int{1,1,1,2,1}); //здесь что-то не так
}