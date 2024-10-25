package by.bsuir.levelup.lesson02;

import java.util.List;

public class ArraysAndLoops {

    /**
     * Напишите метод, который принимает массив целых чисел и возвращает максимальное, минимальное и среднее значение.
     */
    public static double[] calculateStatistics(int[] array) {
        // TODO: реализуйте метод
        if (array == null || array.length == 0) {
            System.out.println("Массив пустой");
        }

        double min = array[0];
        double max = array[0];
        double sum = 0;

        for (int i = 0; i < array.length;i++) {
            if (array[i]>max) {
                max = array[i];
            }

            if (array[i]<min) {
                min = array[i];
            }
            sum+=array[i];
        }

        double average = sum/ array.length;
        return new double[]{max, min, average}; // заглушка
    }

    /**
     * Реализуйте алгоритм сортировки пузырьком для сортировки массива целых чисел.
     */
    public static void bubbleSort(int[] array) {
        // TODO: реализуйте метод
        boolean isSorted = false;
        while  (!isSorted) {
            isSorted = true;
            for (int i = 1; i<array.length;i++) {
                if (array[i] < array[i-1]) {
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }

        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Напишите метод, который выводит все простые числа в заданном диапазоне.
     */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num);i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findPrimes(int range) {
        // TODO: реализуйте метод
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= range; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }


}
