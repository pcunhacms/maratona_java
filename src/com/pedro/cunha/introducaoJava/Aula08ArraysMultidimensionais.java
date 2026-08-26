package com.pedro.cunha.introducaoJava;

public class Aula08ArraysMultidimensionais {
    static void main() {
        //meses: 1,2,3,4...12
        //dias em cada mes: mes 1 -> 31 dias, mes 2 -> 28 dias... mes 12 -> 31 dias.
        //int[][] dias = new int[2][2];
        //isso é um array que faz referencia a outros arrays ^
        //nesse caso, é um array de arrays que armazena dois arrays. int no caso fica dentro dos dois arrays.

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);

            }
        }


        //paramos na aula 37



    }
}
