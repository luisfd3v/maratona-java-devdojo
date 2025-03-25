package com.luisfd3v.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxaAnual;

        if (salarioAnual < 34712) {
            taxaAnual = 9.70;
        } else if (salarioAnual > 34713 && salarioAnual < 68507 ) {
            taxaAnual = 37.35;
        } else {
            taxaAnual = 49.50;
        }
        System.out.println("Com base no seu salaário, você irá pagar " + taxaAnual + "% de taxa anual.");
    }
}
