package Task1;

//1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//2. Создать множество ноутбуков (ArrayList).
//3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//Выводить только те ноутбуки, что соответствуют условию.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Notebook n1 = new Notebook("Asus", 8, 256, "Windows 11", "Красный", "Intel Core i7", 59_999);
        Notebook n2 = new Notebook("Huawei", 8, 512, "Windows 11", "Серый", "Rayzen 7", 74_599);
        Notebook n3 = new Notebook("MacBook", 8, 512, "MacOs", "Темносерый", "Apple M1", 119_999);
        Notebook n4 = new Notebook("MSI", 16, 512, "Windows 11", "Черный", "Rayzen 9", 129_999);
        Notebook n5 = new Notebook("Dell", 4, 128, "Windows 10", "Белый", "Intel Core i3", 24_599);

        HashSet<Notebook> notebooks = new HashSet<>();
        notebooks.add(n1);
        notebooks.add(n2);
        notebooks.add(n3);
        notebooks.add(n4);
        notebooks.add(n5);

        System.out.println("-----------------------------");
        System.out.println("Выбор ноутбуков:");
        System.out.println("-----------------------------");
        PrintSet(notebooks);
        OutputByCriterion(notebooks);
        System.out.println();

        SortNotebooks(notebooks);
    }

    public static void PrintSet(Set<Notebook> set){
        System.out.println();
        System.out.println("Имя | ОЗУ | SSD | Операционная система | Цвет | Процессор | Цена");
        System.out.println("-----------------------------------------------------------------------");
        for (Notebook el: set){
            System.out.println(el);
        }
        System.out.println();
    }

    public static int GetInputInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void OutputByCriterion(HashSet<Notebook> set){
        System.out.println();
        HashMap<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "Оперативная память");
        criteria.put(2, "Объем памяти (SSD)");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Процессор");
        criteria.put(5, "Цвет");
        criteria.put(6, "Цена");
        System.out.println("Выберите критерий:");
        for (var el: criteria.entrySet()){
            System.out.println(el.getKey() + ": " + el.getValue());
        }
        System.out.println();
        System.out.print("Ответ: ");
        int choice = GetInputInt();
        while (choice < 1 || choice > criteria.size()) {
            System.out.print("Ошибка! Введите число от 1 до " + criteria.size() + ": ");
            choice = GetInputInt();
        }

        System.out.println();
        System.out.println("Имя | " + criteria.get(choice));
        System.out.println("---------------");
        for (Notebook el: set){
            if (choice == 1) {
                System.out.println(el.name + " | " + el.ram + " ГБ");
            } else if (choice == 2) {
                System.out.println(el.name + " | " + el.memory + " ГБ");
            } else if (choice == 3) {
                System.out.println(el.name + " | " + el.os);
            } else if (choice == 4) {
                System.out.println(el.name + " | " + el.cpu);
            } else if (choice == 5) {
                System.out.println(el.name + " | " + el.color);
            } else {
                System.out.println(el.name + " | " + el.price + " рублей");
            }

        }
        System.out.println();
    }

    public static void SortNotebooks(HashSet<Notebook> set){
        System.out.println();
        System.out.println("Как отсортировать ноутбуки?");
        System.out.println("1. В алфавитном порядке;");
        System.out.println("2. По цене (по убыванию).");
        System.out.println();
        System.out.print("Ответ: ");
        int choice = GetInputInt();
        while (choice < 1 || choice > 2) {
            System.out.print("Ошибка! Введите число от 1 до 2: ");
            choice = GetInputInt();
        }

        System.out.println();
        int finalChoice = choice;
        TreeSet<Notebook> notebookTreeSet = new TreeSet<>(new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                if (finalChoice == 1) {
                    return o1.toString().compareTo(o2.toString());
                }
                return o2.price - o1.price;
            }
        });
        notebookTreeSet.addAll(set);
        PrintSet(notebookTreeSet);
    }

}

