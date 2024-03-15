package test;
import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void soloClaudators() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{a}"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[1]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("( )"));
    }
    @Test
    public void claudatorsImbricados() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[]}"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[()]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("({})"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[}]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[(])"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("({]}"));
    }
    @Test
    public void ordenAperturaCierre() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("}{"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets(")("));
    }
    @Test
    public void claudatorAbiertoSinCierre() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{["));
    }
    @Test
    public void claudatorCierreSinApertura() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]}"));
    }
    @Test
    public void claudatorsImbricadosDiferentesTipos() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[()]}"));
    }
    @Test
    public void secuenciaOrdenCorrectoSinImbricacion() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("()[]{}()[]{}"));
    }
    @Test
    public void secuenciaOrdenIncorrecto() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("({)}"));
    }
    @Test
    public void secuenciaOrdenCorrectoCierreExtra() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("()[]{}()[]{}]"));
    }
    @Test
    public void secuenciaOrdenCorrectoAperturaExtra() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("()[]{}()[]{}("));
    }
    @Test
    public void secuenciaVacia() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }


}
