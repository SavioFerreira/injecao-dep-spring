package com.github.saviofc.injedep.manual;

import java.util.List;

class BdWriter implements Writer<User> {
    public void write(List<User> users) {
        System.out.println("Escrevendo os usuários no banco..");
        System.out.println(users);
    }
}
