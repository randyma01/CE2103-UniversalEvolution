package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Vector;

/**
 * Created by Fernanda on 21/09/16.
 */

public class XMLgenerations extends XML {
    Document documento;
    Element raiz;

    /**
     * esta funcion se encarga de crear un XML que almacena
     * los datos del dispositivo
     * @param nombreXML
     */

    public XMLgenerations(String nombreXML) {
        super(nombreXML);
        //Obtenemos la referencia al documento que queremos modificar
        this.documento = super.documento;

        //Obtiene el elemento raíz del documento
        this.raiz = super.raiz;
    }

    /**
     * Funcion que añade un la información de las generaciones nuevo al xml
     * @param enemigo
     * @throws TransformerConfigurationException
     * @throws TransformerException
     */
    

    public void añadirGen(Vector enemigo) throws TransformerException{
    	
    	int i=0;
    	
    	if(enemigo.contains("O")){
    	
    		Element enemigo1=documento.createElement("Ogres");
    		Element vid=documento.createElement("vida");
    		Element vel=documento.createElement("velocidad");
    		Element restFec=documento.createElement("resistenciaFechas");
    		Element restMag=documento.createElement("resistenciaMagia");
    		Element restArt=documento.createElement("resistenciaArtilleria");
    	
    		Text cont=documento.createTextNode((String) enemigo.get(1));
    		Text cont1=documento.createTextNode((String) enemigo.get(2));
    		Text cont2=documento.createTextNode((String) enemigo.get(3));
    		Text cont3=documento.createTextNode((String) enemigo.get(4));
    		Text cont4=documento.createTextNode((String) enemigo.get(5));
    	
    		vid.appendChild(cont);
    		vel.appendChild(cont1);
    		restFec.appendChild(cont2);
    		restMag.appendChild(cont3);
    		restArt.appendChild(cont4);
    	    enemigo1.appendChild(vid);
    		enemigo1.appendChild(vel);
    		enemigo1.appendChild(restFec);
    		enemigo1.appendChild(restMag);
    		enemigo1.appendChild(restArt);
    	
    		raiz.appendChild(enemigo1);
    	
    		//"Cerramos" el xml
            cerrarXML();
    		
    	if (enemigo.get(0)=="E"){
    		
    		Element enemigo2=documento.createElement("Elfos");
        	Element vid2=documento.createElement("vida");
        	Element vel2=documento.createElement("velocidad");
        	Element restFec2=documento.createElement("resistenciaFechas");
        	Element restMag2=documento.createElement("resistenciaMagia");
        	Element restArt2=documento.createElement("resistenciaArtilleria");
        	
        	Text Cont=documento.createTextNode((String) enemigo.get(1));
        	Text Cont1=documento.createTextNode((String) enemigo.get(2));
        	Text Cont2=documento.createTextNode((String) enemigo.get(3));
        	Text Cont3=documento.createTextNode((String) enemigo.get(4));;
        	Text Cont4=documento.createTextNode((String) enemigo.get(5));
        	
        	vid2.appendChild(Cont);
        	vel2.appendChild(Cont1);
        	restFec2.appendChild(Cont2);
        	restMag2.appendChild(Cont3);
        	restArt2.appendChild(Cont4);
        	
        	enemigo2.appendChild(vid);
        	enemigo2.appendChild(vel);
        	enemigo2.appendChild(restFec);
        	enemigo2.appendChild(restMag);
        	enemigo2.appendChild(restArt);
        	
        	raiz.appendChild(enemigo2);
        	
        	//"Cerramos" el xml
            cerrarXML();
        	
    	}
    	if (enemigo.get(0)=="H"){
    		
        	Element enemigo3=documento.createElement("Arpias");
        	Element vid3=documento.createElement("vida");
        	Element vel3=documento.createElement("velocidad");
        	Element restFec3=documento.createElement("resistenciaFechas");
        	Element restMag3=documento.createElement("resistenciaMagia");
        	Element restArt3=documento.createElement("resistenciaArtilleria");
        	
        	
        	Text conT=documento.createTextNode((String) enemigo.get(1));
        	Text conT1=documento.createTextNode((String) enemigo.get(2));
        	Text conT2=documento.createTextNode((String) enemigo.get(3));
        	Text conT3=documento.createTextNode((String) enemigo.get(4));
        	Text conT4=documento.createTextNode((String) enemigo.get(5));
        		
        	vid3.appendChild(conT);
        	vel3.appendChild(conT1);
        	restFec3.appendChild(conT2);
        	restMag3.appendChild(conT3);
        	restArt3.appendChild(conT4);
        	
          	enemigo3.appendChild(vid3);
        	enemigo3.appendChild(vel3);
        	enemigo3.appendChild(restFec3);
        	enemigo3.appendChild(restMag3);
        	enemigo3.appendChild(restArt3);
        	
        	raiz.appendChild(enemigo3);
        	
        	//"Cerramos" el xml
            cerrarXML();
        	
    	}
    	if (enemigo.get(0)=="M"){
    		
    		Element enemigo4=documento.createElement("Mercenarios");
        	Element vid4=documento.createElement("vida");
        	Element vel4=documento.createElement("velocidad");
        	Element restFec4=documento.createElement("resistenciaFechas");
        	Element restMag4=documento.createElement("resistenciaMagia");
        	Element restArt4=documento.createElement("resistenciaArtilleria");
        		
        	Text ConT=documento.createTextNode((String) enemigo.get(1));
        	Text ConT1=documento.createTextNode((String) enemigo.get(2));
        	Text ConT2=documento.createTextNode((String) enemigo.get(3));
        	Text ConT3=documento.createTextNode((String) enemigo.get(4));
        	Text ConT4=documento.createTextNode((String) enemigo.get(5));
        	
        	vid4.appendChild(ConT);
        	vel4.appendChild(ConT1);
        	restFec4.appendChild(ConT2);
        	restMag4.appendChild(ConT3);
        	restArt4.appendChild(ConT4);
        	
        	enemigo4.appendChild(vid4);
        	enemigo4.appendChild(vel4);
        	enemigo4.appendChild(restFec4);
        	enemigo4.appendChild(restMag4);
        	enemigo4.appendChild(restArt4);
        	
        	raiz.appendChild(enemigo4);
        	
        	//"Cerramos" el xml
            cerrarXML();
    		
    		}
    	}
    }
}