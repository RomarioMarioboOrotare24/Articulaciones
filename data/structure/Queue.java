package data.structure;

public class Queue<E> {
    ListLinked<E> elements;
    int size, limit;

    public Queue()
    {
        this.elements = new ListLinked<>();
        this.size = 0;
        this.limit = 100;
    }

    public Queue(int limit)
    {
        this.elements = new ListLinked<>();
        this.size = 0;
        this.limit = limit;
    }

    public boolean isEmpty()
    {
        if(elements.getHead()==null)
            return true;
        else
            return false;
    }

    public boolean isFull()
    {
        if(size == limit)
            return true;
        else
            return false;
    }

    public void add(E aux)
    {
        if(!isFull())
        {
            elements.addHead(aux);
            size++;
        }else
            System.out.println("COLA LLENA");
    }

    public Node<E> element()
    {
        Node<E> aux = null;
        if(!isEmpty())
            aux = elements.getTail();
        else
            System.out.println("COLA VACIA");
        return aux;
    }

    public Node<E> remove()
    {
        Node<E> aux = null;
        if(!isEmpty())
        {
            aux = elements.getTail();
            elements.removeTail();
            size--;
        }
        return aux;
    }
}
