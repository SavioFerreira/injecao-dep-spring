package com.github.saviofc.injedep;


public class InjedepManualApplication {

    public static void main(String[] args) {
        new MigracaoUsuario(new FileReader(), new BdWriter()).migrar();
    }
}
