package br.user;
import br.user.passwordgenerator.PasswordInterface;
import org.apache.commons.lang3.RandomStringUtils;
import br.user.passwordgenerator.PasswordGenerator;


public class User extends br.user.passwordgenerator.PasswordGenerator implements PasswordInterface {
    private String username;
    private String password;
    PasswordGenerator passwordGenerator;

    public User(String username, boolean useLetters, boolean useNumbers) {
        this.username = username;
        this.passwordGenerator = new PasswordGenerator();
        this.passwordGenerator.useLetters = useLetters;
        this.passwordGenerator.useNumbers = useNumbers;
    }

    @Override
    public String baseCharGenerator() {
        String baseChars = RandomStringUtils.random(passwordGenerator.length - 2, passwordGenerator.useLetters, passwordGenerator.useNumbers);
        return baseChars;
    }

    @Override
    public String setSymbolsGenerator() {
        String symbolPart = RandomStringUtils.random(3, symbols);
        return symbolPart;
    }

    @Override
    public void generatePassword(String baseChars, String symbolPart) {
        this.password = baseChars + symbolPart;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
