package com.github.saviofc.injedep;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class FileReaderSpring implements Reader<User> {
    public List<User> read() {
        System.out.println("Lendo usuários do arquivo..");
        return List.of(new User("email", "username", "password"));
    }
}
