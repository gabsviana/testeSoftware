package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
@Test
void testSomar() {
Calculadora calc = new Calculadora();
assertEquals(10, calc.somar(7, 3));
}
@Test
void testSubtrair() {
Calculadora calc = new Calculadora();
assertEquals(4, calc.subtrair(7, 3));
}
@Test

void testMultiplicar() {
Calculadora calc = new Calculadora();
assertEquals(21, calc.multiplicar(8, 3));
}
@Test
void testDividir() {
Calculadora calc = new Calculadora();
assertEquals(2, calc.dividir(10, 5));
}
@Test
void testDividirPorZero() {
Calculadora calc = new Calculadora();
assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
}
}
