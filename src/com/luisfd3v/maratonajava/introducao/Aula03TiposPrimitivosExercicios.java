package com.luisfd3v.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imrpima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Luís";
        String endereco = "Rua Maria José Cordeiro";
        double salario = 1.666;
        String dataRecebimentoSalario = "10/03/2025";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de "
                + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(relatorio);
    }
}
