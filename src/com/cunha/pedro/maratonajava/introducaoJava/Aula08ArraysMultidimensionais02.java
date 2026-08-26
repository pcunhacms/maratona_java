package com.cunha.pedro.maratonajava.introducaoJava;

public class Aula08ArraysMultidimensionais02 {
    static void main() {
        int[][] arrayInt = new int[3][];


        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrays : arrayInt) {
            for (int num: arrays) {
                System.out.println(num);
            }
        }

    }
}
