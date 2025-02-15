package br.com.trilhabasica.controledefluxo.calculador;

import br.com.trilhabasica.controledefluxo.excepitions.ParametrosInvalidosException;

public class Math {
    public Math() {
    }

    public void contar(int parUm, int parDois){
        if(parUm< parDois){
            int numeroContagem = parDois - parUm;

            for(int num = 0; num!=numeroContagem; num++){
                System.out.println("Imprimindo o número "+ (num +1));
            }
        } else {
            throw new ParametrosInvalidosException();
        }


    }
}
