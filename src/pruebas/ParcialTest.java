package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

class ParcialTest {

	private int a;
	private int b;
	private int c;
	private Parcial parcial;



	@BeforeEach
	public void setUp() throws Exception {
		this.parcial = new Parcial(a, b, c);
	}

	@Test
	public void casoDosRaicesReales() {
			try {
				assertEquals("3.0, 2.0", this.parcial.calcularRaices(1, -5, 6));
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void excepcionDiscrNeg() throws Exception {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.calcularRaices(1, 1, 1)
				);
		
		assertEquals("Las raices son complejas", excepcion.getMessage());
	}

	@Test
	public void excepcionIndeterminado() throws Exception {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.calcularRaices(0, 1, 1)
				);
		
		assertEquals("No se puede ejecutar la solucion", excepcion.getMessage());
	}


}
