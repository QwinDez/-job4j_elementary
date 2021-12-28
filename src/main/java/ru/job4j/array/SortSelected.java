package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int num = FindLoop.indexOf(data, min, index, data.length - 1);
            int temp = data[index];
            data[index] = data[num];
            data[num] = temp;
        }
        return data;
    }
}
