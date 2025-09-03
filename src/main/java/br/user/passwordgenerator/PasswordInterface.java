package br.user.passwordgenerator;

public interface PasswordInterface {

    String baseCharGenerator();

    String setSymbolsGenerator();

    void generatePassword(String baseChars, String symbolPart);
}
