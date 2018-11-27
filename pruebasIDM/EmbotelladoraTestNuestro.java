// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar EmbotelladoraTestNuestro.java

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTestNuestro
{
	// Embotelladora embotelladora = new Embotelladora();   	// Test fixture
	private int pequena, grande, total;

	// Test para calcular las botellas pequeñas según el bloque b1:
	// "Más botellas pequeñas que grandes y total de litros inferior o igual a la capacidad"
	// Recorre el camino de prueba iv = [1, 3, 5, 7]
	@Test
	public void testParaCalcularBotellasPequenasSegunB1()
	{
		pequena = 7;
		grande = 4;
		total = 25;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB1", numPequena == 5);
	}

	// Test para calcular las botellas pequeñas según el bloque b2:
	// "Más botellas pequeñas que grandes y total de litros superior a la capacidad"
	// Recorre el camino de prueba iii = [1, 3, 5, 6]
	@Test
	public void testParaCalcularBotellasPequenasSegunB2()
	{
		pequena = 7;
		grande = 4;
		total = 28;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB2", numPequena == -1);
	}

	// Test para calcular las botellas pequeñas según el bloque b3:
	// "Mismo número de botellas pequeñas que grandes y total de litros inferior o igual a la capacidad"
	// Recorre el camino de prueba iv = [1, 3, 5, 7]
	@Test
	public void testParaCalcularBotellasPequenasSegunB3()
	{
		pequena = 3;
		grande = 3;
		total = 18;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB3", numPequena == 3);
	}

	// Test para calcular las botellas pequeñas según el bloque b4:
	// "Mismo número de botellas pequeñas que grandes y total de litros superior a la capacidad"
	// Recorre el camino de prueba iii = [1, 3, 5, 6]
	@Test
	public void testParaCalcularBotellasPequenasSegunB4()
	{
		pequena = 3;
		grande = 3;
		total = 19;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB4", numPequena == -1);
	}

	// Test para calcular las botellas pequeñas según el bloque b5:
	// "Más botellas grandes que pequeñas y total de litros inferior o igual a la capacidad"
	// Recorre el camino de prueba iv = [1, 3, 5, 7]
	@Test
	public void testParaCalcularBotellasPequenasSegunB5()
	{
		pequena = 1;
		grande = 2;
		total = 10;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB5", numPequena == 0);
	}

	// Test para calcular las botellas pequeñas según el bloque b6:
	// "Más botellas grandes que pequeñas y total de litros superior a la capacidad"
	// Recorre el camino de prueba iii = [1, 3, 5, 6]
	@Test
	public void testParaCalcularBotellasPequenasSegunB6()
	{
		pequena = 1;
		grande = 2;
		total = 12;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB6", numPequena == -1);
	}

	// Test para calcular las botellas pequeñas según el bloque b7:
	// "Cantidad de botellas/total de litros inválidos"
	// Recorre el camino de prueba i = [1, 2]
	@Test
	public void testParaCalcularBotellasPequenasSegunB7()
	{
		pequena = -3;
		grande = -2;
		total = -1;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB7", numPequena == -1);
	}

	// Test para calcular las botellas pequeñas según el bloque b7:
	// "Cantidad de botellas/total de litros inválidos"
	// Recorre el camino de prueba ii = [1, 3, 4]
	// Según la implementación, que no haya botellas pequeñas no es inválido
	@Test
	public void testParaCalcularBotellasPequenasSegunB7v2()
	{
		pequena = 0;
		grande = 5;
		total = 5;
		int numPequena = Embotelladora.calculaBotellasPequenas(pequena, grande, total);
		assertTrue ("testParaAñoBisiestoSegunB7v2", numPequena == 0);
	}
}
