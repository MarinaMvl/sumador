package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class ASumarTest {

	//Probar con un número de sólo un dígito.
	
<<<<<<< HEAD
		 @Test
		public void testUnaCifra() {
		        ASumar sumi = new ASumar();
		        String resultado = sumi.mostrar("5");
		        assertEquals("5 = 5",resultado );
		    }
		 
		 
	
=======
	//Probar con un número negativo.
	 
		 @Test
		 public void testNegativo() {
		 ASumar sumi1=new ASumar();
		 String resultado = sumi1.mostrar("-5" );
		 assertEquals("", resultado);
		 }
>>>>>>> refs/heads/prueba2

}
