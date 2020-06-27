package lox;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class ScannerTest {
    @Test
    public void testPlus() {
        final Scanner scanner = new Scanner("2 + 2 - 2");
        final List<Token> tokens = scanner.scanTokens();
        
        assertEquals(tokens.get(1).type,TokenType.PLUS);
        assertEquals(tokens.get(3).type,TokenType.MINUS);
    }
}