package br.user.passwordgenerator;

import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGenerator{
    public int length;
    public String symbols;
    public boolean useLetters;
    public boolean useNumbers;

    public PasswordGenerator(int length, boolean useLetters, boolean useNumbers) {
        this.length = length;
        this.symbols = "!@#$%*&";
        this.useLetters = useLetters;
        this.useNumbers = useNumbers;
    }

    public String baseCharGenerator() {
        String baseChars = RandomStringUtils.random(length - 2, useLetters, useNumbers);
        return baseChars;
    }

    public String setSymbolsGenerator() {
        String symbolPart = RandomStringUtils.random(3, symbols);
        return symbolPart;
    }

    public String generatePassword(String baseChars, String symbolPart) {return baseChars + symbolPart;}
}
