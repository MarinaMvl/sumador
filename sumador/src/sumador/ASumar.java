package sumador;

import java.util.*;
/**
 * 
 * @author Maryna Ulasava
 * el método ASumar suma los digitos de un numero y devuelve el resultado, si es negativo devuelve 
 * la cadena vacía.
 *
 */

public class ASumar {
	
	public ASumar() {
		// TODO Auto-generated constructor stub
		}
	
	/**
	 * 
	 * @param cad : el numero recibido
	 * @return devuelve el numero recibido, en el caso de tener mas de un digito, devuelve los sumandos y el resultado.
	 */
	
	public String mostrar(String cad) {
		
		if (cad.length() == 1) {
            return (cad + " = " + cad);
           
	}

	if(cad.charAt(0)=='-'){
		
		return "";
			
	}
	if(cad.length()>1) {
		
		int suma=0;
		String cadena="";
		
		for (int i=0; i<cad.length(); i++) {
			char digito=cad.charAt((i));
			if(i==0){
	            cadena+=digito;
				} else{
	            cadena+= "+" + digito;
	            }
			 suma+=Integer.parseInt(String.valueOf(digito));
		
		}	
		
		
		return cadena + "=" + suma;
}
	
	
	return null;
	
	}

}
	

