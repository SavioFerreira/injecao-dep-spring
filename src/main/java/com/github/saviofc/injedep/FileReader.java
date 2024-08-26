package com.github.saviofc.injedep;

import java.util.List;

class FileReader implements Reader<User> {
    public List<User> read() {
        System.out.println("Lendo usuários do arquivo..");
        return List.of(new User("email", "username", "password"));
    }
}
