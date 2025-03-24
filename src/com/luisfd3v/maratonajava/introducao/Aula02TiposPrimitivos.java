package com.luisfd3v.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; // também pode ser usado unicode e ASCII
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(idade);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é " + nome);
    }
}
