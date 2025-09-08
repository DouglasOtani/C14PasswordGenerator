package br.user.test;

import br.user.passwordgenerator.PasswordGenerator;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordGeneratorTest {

    @Test
    public void baseCharGeneratorNotNullTest() {
        PasswordGenerator passwordGenerator = new PasswordGenerator(15, true, true);
        String baseChar = passwordGenerator.baseCharGenerator();
        assertNotNull(baseChar);
    }

    @Test
    public void setSymbolsGeneratorNotNullTest() {
        PasswordGenerator passwordGenerator = new PasswordGenerator(15, true, true);
        String symbolPart = passwordGenerator.setSymbolsGenerator();
        assertNotNull(symbolPart);
    }

    @Test
    public void baseCharGeneratorLengthTest() {
        PasswordGenerator passwordGenerator = new PasswordGenerator(15, true, true);
        String baseChar = passwordGenerator.baseCharGenerator();
        assertEquals(passwordGenerator.length-2, baseChar.length());
    }

    @Test
    public void baseCharGeneratorAlphaNumericalTest() {
        PasswordGenerator passwordGenerator = new PasswordGenerator(15, true, true);
        String baseChar = passwordGenerator.baseCharGenerator();
        String regex = "^[a-zA-Z0-9]+$";
        assertTrue(baseChar.matches(regex));
    }

    @Test
    public void setSymbolsGeneratorTest() {
        PasswordGenerator passwordGenerator = new PasswordGenerator(15, true, true);
        String symbolPart = passwordGenerator.setSymbolsGenerator();
        String regex = "^[!@#$%*&]+$";
        assertTrue(symbolPart.matches(regex));
    }


}
