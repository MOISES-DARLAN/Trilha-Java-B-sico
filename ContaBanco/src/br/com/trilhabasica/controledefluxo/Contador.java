package br.com.trilhabasica.controledefluxo;
import br.com.trilhabasica.controledefluxo.calculador.Math;
import br.com.trilhabasica.controledefluxo.excepitions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Math math = new Math();
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            math.contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
