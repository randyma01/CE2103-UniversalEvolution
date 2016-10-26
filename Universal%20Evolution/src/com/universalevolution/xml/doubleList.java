package xml;

/**
 * Created by Fernanda on 15/09/16.
 */
public class doubleList {

    node cabeza;
    node fin;

    public doubleList(){
        cabeza = null;
        fin = null;
    }

    private boolean estaVacia(){

        boolean vacia = false;
        if (cabeza == null){
            vacia = true;
        }
        return vacia;
    }

    private void enlazar(node nodeA, node nodeB){

        nodeA.next = nodeB;
        nodeB.prev = nodeA;

    }

    public void interInicio(String ndato){

        node nuevo = new node(ndato);
        if( estaVacia()){
            cabeza = nuevo;
            fin = nuevo;
        }
        else{
            enlazar(nuevo, cabeza);
            cabeza = nuevo;
        }
    }
    void insertFin(String ndato){

        node nuevo = new node(ndato);
        if( estaVacia()){
            cabeza = nuevo;
            fin = nuevo;
        }
        else{
            enlazar(fin, nuevo);
            fin = nuevo;
        }
    }
    public void elimInicio(){

        if(!estaVacia()){
            node primero = cabeza.next;
            if (primero == null){
                cabeza = null;
                fin = null;
            }
            else{
                primero.prev = null;
                cabeza = primero;

            }
        }
    }

    public void elimFinal(){
        if(!estaVacia()){
            node ultimo = fin.prev;
            if (ultimo == null){
                cabeza = null;
                fin = null;
            }
            else{
                ultimo.prev = null;
                cabeza = ultimo;
            }
        }
    }

    public node busqueda(String dato){
        node buscado = null;
        node iterador = cabeza;
        while (buscado == null && iterador != null){
            if(iterador.data == dato){
                buscado = iterador;
            }
            iterador = iterador.next;
        }
        return buscado;
    }

    public void mostrar(){
        node iterador = cabeza;
        while (iterador != null){
            System.out.println(iterador.data);
            iterador = iterador.next;
        }
        System.out.println("null");
    }

    public int largo() {
        int counter = 0;
        node tmp = cabeza;

        while (tmp != null) {
            counter++;
            tmp = tmp.getNext();
        }
        return counter;
    }

    public String obtener(int i) {

        if (cabeza == fin) {
            return cabeza.getData();
        }

        else  {

            node temp = cabeza;
            if (temp != null) {
                for (int j = 0; j != i; j++) {

                    temp = temp.getNext();
                }
            } else {
                System.out.println("Index out of reach");
                return null;
            }
            return temp.getData();

        }

    }

    public void Imprimir(){
        node temp;
        temp=this.cabeza;
        if (cabeza==null){
            System.out.println("Lista vacia");
            return;
        }
        while(temp!=this.fin){
            System.out.println(temp.data.toString());
            temp=temp.next;
        }
        System.out.println(this.fin.data.toString());

    }

}
