package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        int[] firstArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayCompare ac = new ArrayCompare();
        System.out.println( ac.arrayCompare(firstArray, secondArray));
    }
}