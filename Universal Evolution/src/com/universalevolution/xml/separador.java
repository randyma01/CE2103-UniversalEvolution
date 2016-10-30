package com.universalevolution.xml;

import java.util.Vector;

import javax.xml.transform.TransformerException;

/**
 * Separates elements inside the String. 
 * 
 * @autor Fernanda, Ricardo on 15/09/16.
 */
public class separador {

	String arrayParameter[] = {"", "", "", "", "", ""};
	XMLgenerations f = new XMLgenerations("generacion");
		
	
	/**
	 * Separate the characters inside a String.
	 * 
	 * @param xml
	 * @throws TransformerException
	 */
	public void separar(String xml) throws TransformerException{
	String delimiter = ",";
	int pos = 0;
	int cantidad = 0;
	String[] tokens = xml.split(delimiter);
	while(pos < tokens.length){
		for (int i = 0; i < 6; i++){
			while(true){
				arrayParameter[i] = tokens[pos];
				pos++;
				if (i < 6){
					break;
				}
			}
		}
		f.añadirGen(arrayParameter);
		System.out.println("Cantidad enemigos " + cantidad);
		cantidad++;
	}
	
}
}
