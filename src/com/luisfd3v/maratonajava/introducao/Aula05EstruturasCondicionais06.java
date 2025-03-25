package com.luisfd3v.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como Domingo
        byte diaDaSemana = 1;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo, final de semana.");
                break;
            case 2:
                System.out.println("Segunda, dia útil.");
                break;
            case 3:
                System.out.println("Terça, dia útil.");
                break;
            case 4:
                System.out.println("Quarta, dia útil.");
                break;
            case 5:
                System.out.println("Quinta, dia útil.");
                break;
            case 6:
                System.out.println("Sexta, dia útil.");
                break;
            case 7:
                System.out.println("Sábado, final de semana.");
                break;
            default:
                System.out.println("Opção Inválida.");
        }

        // RESOLUÇÃO:
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
