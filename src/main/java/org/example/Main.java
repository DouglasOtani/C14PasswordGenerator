package org.example;

import br.user.passwordgenerator.PasswordGenerator;
import br.user.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Douglas", true, true);

        String baseChar = user1.baseCharGenerator();
        String symbolPart = user1.setSymbolsGenerator();
        user1.generatePassword(baseChar, symbolPart);
        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());
    }
}