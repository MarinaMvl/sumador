package sumador;

import java.util.*;


public class ASumar {
	
	public ASumar() {
		// TODO Auto-generated constructor stub
		}
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
	

