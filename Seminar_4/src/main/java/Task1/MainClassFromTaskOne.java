package Task1;

//1. Реализовать консольное приложение, которое:
//   Принимает от пользователя и “запоминает” строки.
//   Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//   Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class MainClassFromTaskOne {

        public static void main(String[] args) {
            LinkedList<String> inputLinkedList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            String srtFromCons;
            System.out.println("Введите значение для строки.\nДля выхода используйте 'print'");

            while (!(srtFromCons = scanner.nextLine()).equals("print"))
                inputLinkedList.addFirst(srtFromCons);
            scanner.close();
            System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());

        int stop = 0;
        System.out.println("Введите желаемое количество элементов: ");
        int countElements = scanner.nextInt();
        System.out.println("Заполните LinkedList строками.\nДля выхода используйте слово 'print'");
        while (stop <= countElements) {
            inputLinkedList.add(scanner.nextLine());
            if (!(srtFromCons = scanner.nextLine()).equals("print")) {
                inputLinkedList.addFirst(srtFromCons);
                if (!(srtFromCons = scanner.nextLine()).equals("exit")) {
                    inputLinkedList.addLast(srtFromCons);
                }
            }
            stop++;
        }

        }
}
