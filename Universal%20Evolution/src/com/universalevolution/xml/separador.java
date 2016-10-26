package xml;

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
    public doubleList separar(String message){
        doubleList doubleList=new doubleList();
        int i=0;
        int j=0;
        String temp;
        while (j<message.length()){
            if (message.charAt(j)==','){
                temp=message.substring(i,j);
                doubleList.insertFin(temp);
                i=j+1;
                j++;
            }
            else{
                j++;
            }
        }
        temp=message.substring(i,j);
        doubleList.insertFin(temp);
        doubleList.Imprimir();
        return doubleList;
    }
}