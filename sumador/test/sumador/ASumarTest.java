package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class ASumarTest {

	
	//Probar con un número negativo.
	 
		 @Test
		 public void testNegativo() {
		 ASumar sumi1=new ASumar();
		 String resultado = sumi1.mostrar("-5" );
		 assertEquals("", resultado);
		 }

}
