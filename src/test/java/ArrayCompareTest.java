import org.example.ArrayCompare;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCompareTest {

    //Тест проверяет правильно ли вычисляется среднее арифметическое
    @Test
    public void test_findAvg() {
        // Arrange
        int[] list = {1, 2, 3, 4, 5};
        ArrayCompare arrayCompare = new ArrayCompare();

        // Act
        Double result = arrayCompare.findAvg(list);

        // Assert
        assertEquals(3.00, result);
    }

    //Тест проверяет правильно ли сравниваются 2 списка
    @Test
    public void test_calculateAverageAndCompare() throws Exception {
        // Arrange
        int[] list1 = {21, 22, 3, 41, 52};
        int[] list2 = {6, 7, 8, 9, 10};
        ArrayCompare arrayCompare = new ArrayCompare();

        // Act
        String result = arrayCompare.arrayCompare(list1, list2);

        // Assert
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    //Тест проверяет как сравниваются 2 списка, если участвуют негативные числа
    @Test
    public void test_negativeNumbers() throws Exception {
        // Arrange
        int[] list1 = {3, 5, 2, 1, 1};
        int[] list2 = {-5, -2, -1, -7, -10};
        ArrayCompare arrayCompare = new ArrayCompare();

        // Act
        String result = arrayCompare.arrayCompare(list1, list2);

        // Assert
        assertEquals("Первый список имеет большее среднее значение", result);

    }

    //Тест проверяет сравнение 2 пустых списков
    @Test
    public void test_compareEmptyLists() throws Exception {
        // Arrange
        int[] list1 = {};
        int[] list2 = {};
        ArrayCompare arrayCompare = new ArrayCompare();

        // Act
        String result = arrayCompare.arrayCompare(list1, list2);

        // Assert
        assertEquals("Средние значения равны", result);
    }

    //Тест проверяет является ли один из списков NULL
    @Test
    public void test_ifListIsNull() throws Exception {
        // Arrange
        int[] list1 = null;
        int[] list2 = {1, 2, 3};

        // Act
        ArrayCompare arrayCompare = new ArrayCompare();

        // Assert
        assertThrows(Exception.class, () -> {
            arrayCompare.arrayCompare(list1, list2);
        });
    }


}
