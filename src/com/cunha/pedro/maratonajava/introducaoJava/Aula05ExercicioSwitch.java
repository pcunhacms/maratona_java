package com.cunha.pedro.maratonajava.introducaoJava;

public class Aula05ExercicioSwitch {
    static void main() {
        //dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //considerando 1 como domingo (utilizando switch)

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Domingo. Final de semana.");
            case 2:
                System.out.println("Segunda-Feira. Dia útil");
            case 3:
                System.out.println("Terça-Feira. Dia útil");
            case 4:
                System.out.println("Quarta-Feira. Dia útil");
            case 5:
                System.out.println("Quinta-Feira. Dia útil");
            case 6:
                System.out.println("Sexta-Feira. Dia útil");
            case 7:
                System.out.println("Sábado. Final de semana.");
        }
    }
}
