import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
 //       task1(); //не готово, не работает:(
        task2();
        task3();
//        task4();


        scanner.close();
    }





        private static void task2 () {
//  Задание 2. Создать программу для раскраски шахматной доски.
            System.out.println("\nЗадание 2. Создать программу для раскраски шахматной доски.");
            String[][] chess = new String[8][8];
            for (int x = 0; x < chess.length; x++) {
                for (int y = 0; y < chess[0].length; y++) {
                    if ((x + y) % 2 == 0) chess[x][y] = "W";
                    else chess[x][y] = "B";
                    System.out.print(chess[x][y] + " ");
                }
                System.out.println(" ");
            }


        }


        private static void task3 () {
//  Задание 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
            System.out.println("\nЗадание 3. Создайте двумерный массив целых чисел. \n" +
                                "           Выведите на консоль сумму всех элементов массива.");

            int[][] massiv3 = {{2, 5, 1}, {8, 1, 3}, {6, 5, 8}};
            for (int[] a : massiv3)
                System.out.println(Arrays.deepToString(new int[][]{a}));
            int sum = 0;
            for (int x = 0; x < massiv3.length; x++) {
                for (int y = 0; y < massiv3[x].length; y++) {
                    sum = sum + massiv3[x][y];
                }

            }
            System.out.println("Сумма элементов массива: " + sum);
        }























    private static void task1() {
//  Задание 1. Создать трехмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву и увеличить каждый
//              элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
        System.out.println("\nЗадание 1. Создать трехмерный массив из целых чисел и \n" +
                           "            увеличить каждый элемент на заданное число.");

        int[][][] cmassiv = {{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}, {{4, 4, 4}, {5, 5, 5}, {6, 6, 6}}, {{7, 7, 7}, {8, 8, 8}, {9, 9, 9}}};

        int[][][] bmassiv = new int[2][2][3];
        for (int x = 0; x < bmassiv.length; x++) {
            for (int y = 0; y < bmassiv[x].length; y++) {
                int z;
                for (z = 0; z < bmassiv[x][y].length; z++)
                    bmassiv[x][y][z] = x + y + z;
            }
            System.out.println(" ");
            for (int[][] a : bmassiv)
                System.out.println(Arrays.deepToString(a));
        }
        System.out.println("Введите число на которое следует увеличить элементы:");
        //     int n = scanner.nextInt();
        int n = 1;
        n = n + 1;
        for (int x = 0; x < cmassiv.length; x++) {
            for (int y = 0; y < cmassiv[x].length; y++) {
                for (int z = 0; z < cmassiv[x][y].length; z++) {
                    cmassiv[x][y][z] = x + y + z;
                    //                 x=x+n; y=y+n; z=z+n;
                    //                  System.out.print(bmassiv[x][y][z] + " ");
                    System.out.print(" ");
                }


            }

        }
        //      for (int[][] a : cmassiv)
        //         System.out.println(Arrays.deepToString(a));
    }
}

