package com.github.saviofc.injedep.manual;


public class InjedepManualApplication {

    public static void main(String[] args) {
        new MigracaoUsuario(new FileReader(), new BdWriter()).migrar();
    }
}
