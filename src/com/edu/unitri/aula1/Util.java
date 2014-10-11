
package com.edu.unitri.aula1;

import java.text.NumberFormat;

public class Util {

    Double calculaAreaTriangulo(double baseMaior, double baseMenor, double altura) {
        double area = (baseMaior + baseMenor)* altura / 2;
        return area;
    }

    String calculaEmprestimo(double valor , double taxa, int periodo) {
       
        double taxames = (taxa / 12)/100;
        
        double total = valor *taxames * periodo;
        
        NumberFormat formatador = NumberFormat.getCurrencyInstance();
        String valorFormatado = formatador.format(total);
        
        return valorFormatado;
        
    }
    
}
