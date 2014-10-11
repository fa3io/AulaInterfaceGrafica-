
package com.edu.unitri.aula3;

public class OperacaoModel {
    
    private int primeiroNumero;
    private int segundoNumero;

    public OperacaoModel() {
    }
    public int soma (int numero1, int numero2){
        return numero1 + numero2;
    }

    public OperacaoModel(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(int primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    
    
    
}
