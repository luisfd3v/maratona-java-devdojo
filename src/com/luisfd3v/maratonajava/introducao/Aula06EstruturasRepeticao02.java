package com.luisfd3v.maratonajava.introducao;

public class Aula06EstruturasRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        for (int i = 0; i <= 100; i+=2) {
            System.out.println(i);
        }

        // RESOLUÇÃO
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
