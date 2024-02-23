package org.example;

/*a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны. */

import java.lang.reflect.Array;

public class ArrayCompare {


    public String arrayCompare(int[] arr1, int[] arr2) throws Exception {
        double avg1 = findAvg(arr1);
        double avg2 = findAvg(arr2);

        if(arr1 == null || arr2 == null) {
            throw new Exception("Один из списков является NULL");
        }
        if(avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avg1 < avg2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    public double findAvg(int[] arr) {
        int arrSum = 0;
        for(int d : arr) arrSum += d;
        double avg = 1.0d * arrSum/arr.length;
        return avg;
    }


}
