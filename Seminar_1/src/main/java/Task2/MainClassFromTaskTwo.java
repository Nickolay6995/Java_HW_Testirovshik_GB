package Task2;


//2. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class MainClassFromTaskTwo {
    public static void main(String[] args) {
        int val = 3;
        int[] b = {1,2,4,5,6,7,3,4,3,5,3,4,3,6,3,8};
        int[] a;
        a = b;

        for (int j : b) {
            System.out.print(j + " ");
        }
        System.out.println();
        numtoend(a, b, val);
    }
    public static void numtoend (int[]a, int[]b, int val){
        int j =0;
        for (int k : b) {
            if (k != val) {
                a[j] = k;
                j++;
            }
        }
        for(int i = j; i<a.length; i++){
            a[i]=val;
        }
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}
