package xml;

/**
 * Created by Fernanda on 15/09/16.
 */
class node {

    public String data;
    node next;
    node prev;


    node(String i) {
        super();
        this.data = i;
    }

    public void setNext(node next) {
        this.next = next;
    }

    /**
     * Set the previous node in the list.
     *
     * @param prev
     */
    public void setPrev(node prev){
        this.prev = prev;
    }

    /**
     * Returns the next node in the list.
     *
     * @return next (node)
     */
    node getNext() {
        return next;
    }

    /**
     * Return the previous node in the list.
     *
     * @return prev (node)
     */
    public node getPrev(){
        return prev;
    }

    /**
     * Returns the data (info)  of a node.
     *
     * @return data (info)
     */
    public String getData() {
        return data;
    }
}