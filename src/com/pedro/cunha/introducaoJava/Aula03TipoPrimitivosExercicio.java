package com.pedro.cunha.introducaoJava;

public class Aula03TipoPrimitivosExercicio {
    static void main() {
//        crie variaveis para os campos descritos abaixo e imprima a seguinte mensagem:
//        Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário <salario>, na data <data>

        String nome = "Joao";
        String endereco = "Rua Rio de Janeiro, 123";
        double salario = 3200;
        String data = "06/07/2026";

       String mensagem = "Eu " +nome+", morando no endereço: "+endereco+", confirmo que recebi o salário "+ salario +" na data "+data;
        System.out.println(mensagem);

    }
}
