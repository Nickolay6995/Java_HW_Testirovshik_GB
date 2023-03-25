package Task2;


//2. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class MainClassFromTaskTwo {
    public static void main(String[] args) {
        int k = 3;
        int[] b = {1,2,4,5,6,7,3,4,3,5,3,4,3,6,3,8};
        int[] a = b;

        for(int i =0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        numtoend(a, b, k);
    }
    public static void numtoend (int[]a, int[]b, int k){
        int j =0;
        for(int i = 0; i<b.length; i++){
            if (b[i] != k) {
                a[j]=b[i];
                j++;
            }
        }
        for(int i = j; i<a.length; i++){
            a[i]=k;
        }
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
