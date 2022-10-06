import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

        scanner.close();
    }


    private static void task1() {
//  Задание 1. Создать трехмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву и увеличить каждый
//              элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
        System.out.println("""

                Задание 1. Создать трехмерный массив из целых чисел и\s
                            увеличить каждый элемент на заданное число.""");

        int[][][] bmassiv = new int[4][2][3];
        int x,y,z ;
        for (x = 0; x < bmassiv.length; x++) {
            for (y = 0; y < bmassiv[x].length; y++) {
                for (z = 0; z < bmassiv[x][y].length; z++)
                    bmassiv[x][y][z] = x+y+z;
            }
        } for (int[][] a : bmassiv)
            System.out.println(Arrays.deepToString(a));

        System.out.println("Введите число на которое следует увеличить элементы:");
        int n = scanner.nextInt();
        for (x = 0; x < bmassiv.length; x++) {
            for (y = 0; y < bmassiv[x].length; y++) {
                for (z = 0; z < bmassiv[x][y].length; z++)
                    bmassiv[x][y][z] = (x+y+z)+n;
            }
        } for (int[][] a : bmassiv)
            System.out.println(Arrays.deepToString(a));
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
            System.out.println("""

                    Задание 3. Создайте двумерный массив целых чисел.\s
                               Выведите на консоль сумму всех элементов массива.""");
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

    private static void task4() {
//        Задание 4. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
        System.out.println("""

                Задание 4. Создайте двумерный массив целых чисел.\s
                           Отсортируйте элементы в строках двумерного массива по возрастанию.""");
        int[][] massiv4 = {{6, 5, 1}, {9, 2, 3}, {7, 4, 8}};
        for (int x = 0; x < massiv4.length; x++) {
            for (int y = 0; y < massiv4[x].length; y++) {
            }
        }System.out.println("Исходный массив:\n"+Arrays.deepToString(massiv4));
        for (int i = 0; i < massiv4.length; i++){
            Arrays.sort(massiv4[i]);
        }System.out.println("Отсортированный массив:\n"+Arrays.deepToString(massiv4));
    }
}