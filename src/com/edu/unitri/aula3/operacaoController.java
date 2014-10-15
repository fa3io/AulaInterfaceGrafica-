
package com.edu.unitri.aula3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class operacaoController {
    
    private OperacaoView view;
    private OperacaoModel model;

    public operacaoController(OperacaoView view, OperacaoModel model) {
        this.view = view;
        this.model = model;
        view.addoperacaoListener(new operacaoListener());
    }
    
    
    
    class operacaoListener implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent e) {
            
            model  = new OperacaoModel(view.getPrimeironumero(), view.getSegundonumero());
            
            view.insereSoma(model.soma(model.getPrimeiroNumero(), model.getSegundoNumero()));
             
             
             
             
        }
        
    }
}
