package lox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AstPrinterTest {
    @Test
    public void testAstPrinterBinaryExpression() {
        Expr expression = new Expr.Binary(
                new Expr.Unary(new Token(TokenType.MINUS, "-", null, 1), new Expr.Literal(123)),
                new Token(TokenType.STAR, "*", null, 1), new Expr.Grouping(new Expr.Literal(45.67)));

        AstPrinter ap = new AstPrinter();
        assertEquals("Ast must same", ap.print(expression), "(* (- 123) (group 45.67))");
    }
}