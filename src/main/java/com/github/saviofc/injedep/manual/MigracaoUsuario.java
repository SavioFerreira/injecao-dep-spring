package com.github.saviofc.injedep.manual;

import java.util.List;

class MigracaoUsuario {

    Reader<User> reader;
    Writer<User> writer;

    public MigracaoUsuario(Reader<User> reader, Writer<User> writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void migrar() {
        List<User> users = reader.read();
        writer.write(users);
    }
}
