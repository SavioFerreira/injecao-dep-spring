package com.github.saviofc.injedep;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class MigracaoUsuarioSpring {

    Reader<User> reader;
    Writer<User> writer;

    public MigracaoUsuarioSpring(Reader<User> reader, Writer<User> writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void migrar() {
        List<User> users = reader.read();
        writer.write(users);
    }
}
