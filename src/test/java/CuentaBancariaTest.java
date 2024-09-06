
public class CuentaBancariaTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
    // @Test
    // public void miPrueba() {
    //      double valorEsperado = 10;
    //      double valorActual = Calculadora.calcular(7, 3, '+');
    //      assertEquals(valorEsperado, valorActual);
    // }
     public void testSetTipoInteresValido() {
        // Prueba con un tipo de interés válido (5%)
        CuentaBancaria.setTipoInteres(5.0);
        assertEquals(5.0, CuentaBancaria.getTipoInteres(), "El tipo de interés debería ser 5.0%");
    }

 
    public void testSetTipoInteresInvalidoNegativo() {
        // Prueba con un tipo de interés negativo (-2%)
        CuentaBancaria.setTipoInteres(-2.0);
        assertEquals(1.5, CuentaBancaria.getTipoInteres(), "El tipo de interés no debería cambiar de 1.5% al intentar establecer un valor negativo.");
    }
}
