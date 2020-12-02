package data.structure;

public class Stack<E> {
    private ListLinked<E> elements;
    private int size, limit;
    private E top;

    public Stack()
    {
        this.elements = new ListLinked<>();
        this.size = 0;
        this.top = null;
        this.limit = 100;
    }

    public Stack(int limit)
    {
        this.elements = new ListLinked<>();
        this.size = 0;
        this.top = null;
        this.limit = limit;
    }

    public boolean isEmpty()
    {
        if(size == 0)
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

    public int getSize()
    {
        return size;
    }

    public void add(E element)
    {
        if(!isFull())
        {
            top = element;
            elements.addHead(element);
            size++;
        }else
            System.out.println("PILA LLENA");
    }

    public void remove()
    {
        if(!isEmpty())
        {
            E aux;
            aux = top;
            elements.removeHead();
            size--;
            System.out.println("Se extrajo el elemento: "+aux);
        }else
            System.out.println("PILA VACIA");
    }

    public void showStack()
    {
        if(!isEmpty())
        {
            for(int i=0; i<size; i++)
                System.out.println("|"+elements.getNode(i).getData()+"|");
        }else
            System.out.println("PILA VACIA");
    }

    public E getTop()
    {
        return top;
    }

    public E pop() {
        E aux = null;
        if(!isEmpty()) {
            aux = top;
            elements.removeHead();
            size--;            
        }
        return aux;
    }
}
