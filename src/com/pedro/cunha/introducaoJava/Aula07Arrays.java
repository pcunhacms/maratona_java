package com.pedro.cunha.introducaoJava;

public class Aula07Arrays {
    static void main() {
        //quero que voce guarde tres idades de pessoas.
        //do jeito que sabemos seria:
//        int idade1 = 15;
//        int idade2 = 22;
//        int idade3 = 14;

        //Arrays => vai referenciar um objeto na memoria que pode ter mais de um valor
//        int[] idades = new int[3]; // crie um objeto em memoria com um espaço para 3 valores.
        //array SEMPRE será um objeto.
////        idades[0] = 15;
////        idades[1] = 22;
////        idades[2] = 14;

//        String[] nomes = new String[3];
//        nomes[0] = "Joao";
//        nomes[1] = "Goku";
//        nomes[2] = "Maria";
//
//        for (int i = 0; i <= (nomes.length - 1); i++) {
//            System.out.println(nomes[i]);
//
//        }

        //FORMAS DE INICIALIZAR UM ARRAY//
        int[] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int []{1,2,3,4,5};

        //================FOREACH ========================//
        for(int numero:numeros3) { //para cada numero (que é do tipo int) dentro do array numeros3, imprima o numero.
            System.out.println(numero);
        }




    }
}
