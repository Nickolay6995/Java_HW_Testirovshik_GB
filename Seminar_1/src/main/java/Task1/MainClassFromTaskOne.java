package Task1;

//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class MainClassFromTaskOne {

    public static void main(String[] args) {
        int[] mas = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
        for(i = 0; i != mas.length; i++)
        {
            if(mas[i] < min){
                min = mas[i];
                imin = i;
            }
            if(mas[i] > max){
                max = mas[i];
                imax = i;
            }
            System.out.println("max = "+max+" min = "+min);
            System.out.println("imax = "+imax+" imin = "+imin);
        }
    }
}



