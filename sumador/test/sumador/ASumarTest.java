package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class ASumarTest {

	//Probar con un número de sólo un dígito.
	
		 @Test
		public void testUnaCifra() {
		        ASumar sumi = new ASumar();
		        String resultado = sumi.mostrar("5");
		        assertEquals("5 = 5",resultado );
		    }
		 
		 
	

}
