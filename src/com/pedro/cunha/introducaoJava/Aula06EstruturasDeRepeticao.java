package com.pedro.cunha.introducaoJava;

public class Aula06EstruturasDeRepeticao {
    static void main() {
        int count = 1;

//        while(count <= 10) {
//            System.out.println(count);
//            count++;
//        }
//
//        do {
//            System.out.println("Dentro do do-while");
//        } while (count < 10) ;

        //===================== EXERCICIO ======================== //
        // imprima os numeros pares de 0 ate 1000000.

//        int countFor = 1000000;
//
//        for (int i = 0; i <= countFor; i++) { //i+=2
//            //System.out.println("Contagem: " + i);
//
//            if (i % 2 == 0 ){
//                System.out.println("Contagem: " + i);
//            }
//
//        }

        //===================== EXERCICIO ======================== //
        // imprima os primeiros 25 numeros de um dado valor.

//        int valorMax = 50;
//        for(int i = 0; i <= valorMax; i++) {
//            if (i >25 ) {
//                break;
//            } else {
//                System.out.println("Valor: " + i);
//            }
//        }


        //===================== EXERCICIO ======================== //
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
//        double valorCarro = 30000;
//
//        for (int parcela = 1; parcela < valorCarro; parcela++) {
//            double valorParcela = valorCarro / parcela;
//            if(valorParcela >= 1000) {
//                System.out.println("Parcela " + parcela+ " R$ "+valorParcela);
//
//            } else {
//                break;
//            }
//        }

        double valorCarro = 30000;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (parcela < 1000) {
                continue; //ele ignora tudo que é menor que 1000. o sout so começa a aparece a partir de onde a parcela for > 1000
            }

            System.out.println("Parcela " + parcela+ " R$ "+valorParcela);
        }

    }
}
