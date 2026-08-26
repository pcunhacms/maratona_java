package com.cunha.pedro.maratonajava.introducaoJava;

public class Aula02TiposPrimitivos {
    static void main() {
        //tipos que guardam em memoria um valor 'simples'
        //int, double, float, char, byte, short, long, boolean
        int idade = 25; //cabe 4 bytes
        long numeroGrande = 100000; //cabe 8 bytes
        double salarioDouble = 2000; //8 bytes
        float salarioFloat = 2500; //4 bytes
        byte idadeByte = 25; //1 byte
        short idadeShort = 25; // 2 bytes
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; // 2 bytes


        System.out.println("Numero long: " + numeroGrande);
        System.out.println("idade INT: " + idade);
        System.out.println("idade BYTE: " + idadeByte);
        System.out.println("idade SHORT" + idadeShort);

        System.out.println("salario DOUBLE: " + salarioDouble);
        System.out.println("salario FLOAT: " + salarioFloat);

        System.out.println("verdadeiro: " + verdadeiro);
        System.out.println("falso: " + falso);

        System.out.println("char: " + caractere);

        //================== CASTING =====================//

        // 1. Casting Implicitio:
        int numero = 10;
        double numeroDecimal = numero;

        //2. Casting Explicito:
        double numeroDouble = 10.5;
        int numeroInteiro = (int) numeroDouble;


        //================= String ================//
        //String não é um tipo primitivo. é um tipo de referente. String é uma classe
        String nome = "DevDojo";

    }
}
