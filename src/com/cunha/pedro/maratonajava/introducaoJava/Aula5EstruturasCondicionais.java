package com.cunha.pedro.maratonajava.introducaoJava;

public class Aula5EstruturasCondicionais {
    static void main() {
        //IF, ELSE, ELSE IF




        //======= OPERADOR TERNARIO ==========//

        //decidir se vai fazer doacao, mas doacao so vai ser feita se o salario for acima de 5k

//        double salario = 6000;
//        String mensagemDoar = "Eu vou doar 500 reais";
//        String mensangemNaoDoar = "Ainda nao consigo contribuir";
//
//        String resultado;
//
//        if(salario > 5000) {
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensangemNaoDoar;
//        }
//
//        System.out.println(resultado); => desse jeito ok, mas fazendo com operadores ternarios:


        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais";
          String mensangemNaoDoar = "Ainda nao consigo contribuir";

          String resultado = salario > 5000 ? mensagemDoar : mensangemNaoDoar;

            System.out.println(resultado);

        //============================ SWITCH ==============================//
        //Imprima o dia da semana, considerando 1 como domingo.

        byte dia = 5;
        //no siwth so aceita paramentros de char, int, byte, short enum e String.

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        //nesse caso, ele vai imprimir a partir do 5, entao vai imprimir 6 e 7 tambem.
        //pra isso nao acontecer, pra ele parar no 5, precisa da palavra break
    }
}
