package com.github.saviofc.injedep;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class BdWriterSpring implements Writer<User> {
    public void write(List<User> users) {
        System.out.println("Escrevendo os usuários no banco..");
        System.out.println(users);
    }
}
