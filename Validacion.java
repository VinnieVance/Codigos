package conversion;
//Declaracion de la clase
public class Validacion {
	
	//Metodo para validar si el numero es decimal
	public boolean validarDecimal (int decimal) {
		return true;
	}
	
	//Metodo para validar si el numero es binario
	public boolean validarBinario (int binario) {
		String binString = String.valueOf(binario);
		for(char chBin: binString.toCharArray()) {
			if(chBin != '0' && chBin != '1') {
				return false;
			}
		}
		return true;
	}
	
	//Metodo para validar si el numero es octal
	public boolean validarOctal(int octal) {
		String octString = String.valueOf(octal);
		String numOctales = "01234567";
		for (int i = 0; i < octString.length(); i++) {
			char charOctal = octString.charAt(i);
			if (numOctales.indexOf(charOctal) == -1) {
				 return false;
			}
		}
		return true;
	}
	
	//Metodo para validar si el numero es hexadecimal
	public boolean validarHexadecimal(String hexadecimal) {
		String caractHexadecimales = "0123456789ABCDEF";
		for (int i = 0; i < hexadecimal.length(); i++) {
			char cHexa = hexadecimal.charAt(i);
			if (caractHexadecimales.indexOf(cHexa) == -1) {
				return false;
	        }
	    }
	    return true;
	}
}
