package com.edu.unitri.aula3;

public class TesteOperacao {

    public static void main(String[] args) {
        OperacaoModel model = new OperacaoModel();
        OperacaoView view = new OperacaoView();

        operacaoController controller = new operacaoController(view, model);

        view.setVisible(true);
    }

}
