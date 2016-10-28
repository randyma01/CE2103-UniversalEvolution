package xml;

import java.util.Vector;

/**
 * @autor Fernanda, Ricardo on 15/09/16.
 */
public class separador {

    public separador() {	}

    /**
     * separa la informacion que contiene un string, esta
     * informacion debe estar separada por el signo "/", por ejemplo "hola/como/estas" e inserta esta
     * informacion en una lista
     * @param message
     * @return doubleList
     */
    public Vector separar(String message){
        Vector l=new Vector();
        int i=0;
        int j=0;
        String temp;
        while (j<message.length()){
            if (message.charAt(j)==','){
                temp=message.substring(i,j);
                l.addElement(temp);
                i=j+1;
                j++;
            }
            else{
                j++;
            }
        }
        temp=message.substring(i,j);
        l.addElement(temp);
        return l;
    }
}